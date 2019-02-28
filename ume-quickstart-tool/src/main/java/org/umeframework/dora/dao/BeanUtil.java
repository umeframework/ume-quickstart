/*
 * Copyright 2014-2017 UME Framework Group, Apache License Version 2.0
 */
package org.umeframework.dora.dao;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.beanutils.PropertyUtils;

/**
 * Bean common access tool
 * 
 * @author Yue MA
 */
abstract public class BeanUtil {

    /**
     * Bean descriptor cacher
     */
    private static final Map<Class<?>, BeanReflectInfoBean> beanReflectInfoMap = new ConcurrentHashMap<Class<?>, BeanReflectInfoBean>();

    /**
     * Clear bean descriptor cache.
     */
    public static synchronized void clearCache() {
        beanReflectInfoMap.clear();
    }

    /**
     * Add bean descriptor into cache.
     * 
     * @param clazz
     */
    public static synchronized void addToCache(Class<?> clazz) {
        BeanReflectInfoBean reflectInfo = new BeanReflectInfoBean();
        Map<String, Method> setters = new LinkedHashMap<String, Method>();
        Map<String, Method> getters = new LinkedHashMap<String, Method>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
            PropertyDescriptor[] propDescs = beanInfo.getPropertyDescriptors();

            for (PropertyDescriptor propDesc : propDescs) {
                if (propDesc.getWriteMethod() != null) {
                    setters.put(propDesc.getName(), propDesc.getWriteMethod());
                }
                if (propDesc.getReadMethod() != null) {
                    getters.put(propDesc.getName(), propDesc.getWriteMethod());
                }
            }

            reflectInfo.setCachedTime(System.currentTimeMillis());
            reflectInfo.setGetters(getters);
            reflectInfo.setSetters(setters);

            beanReflectInfoMap.put(clazz, reflectInfo);
        } catch (IntrospectionException e) {
            setters = null;
            getters = null;
        }
    }

    /**
     * Set property value to bean instance
     * 
     * @param bean
     *            - bean instance
     * @param property
     *            - property name
     * @param value
     *            - property value
     * @throws RuntimeException
     */
    @SuppressWarnings({ "unchecked" })
    public static void setBeanProperty(Object bean, String property, Object value) {

        try {
            if (bean instanceof Map) {
                ((Map<String, Object>) bean).put(property, value);
            } else {
                Method method = getSetters(bean.getClass()).get(property);
                method.invoke(bean, value);
            }
        } catch (Exception e) {
            throw new RuntimeException("Fail to set bean property " + property + "," + bean + "," + value, e);
        }
    }

    /**
     * Get bean property
     * 
     * @param bean
     *            - bean instance
     * @param property
     *            - property name
     * @return property value
     * @throws RuntimeException
     */
    @SuppressWarnings("unchecked")
    public static Object getBeanProperty(Object bean, String property) {

        Object value = null;
        try {
            if (bean instanceof Map) {
                value = ((Map<String, Object>) bean).get(property);
            } else {
                Method method = getGetters(bean.getClass()).get(property);
                value = method.invoke(bean);
            }
        } catch (Exception e) {
            throw new RuntimeException("Fail to get bean property " + property + "," + bean, e);
        }
        return value;
    }

    /**
     * Get bean property data type
     * 
     * @param bean
     *            - bean instance
     * @param property
     *            - property name
     * @return property data type
     * @throws RuntimeException
     */
    public static Class<?> getBeanPropertyType(Object bean, String property) throws RuntimeException {
        try {
            Class<?> type = null;
            if (bean instanceof DynaBean) {
                DynaProperty descriptor = ((DynaBean) bean).getDynaClass().getDynaProperty(property);
                if (descriptor != null) {
                    type = descriptor.getType();
                }
            } else {
                type = PropertyUtils.getPropertyType(bean, property);
            }
            return type;
        } catch (Exception e) {
            throw new RuntimeException("Fail to set bean property type" + property + "," + bean, e);
        }
    }

    /**
     * Get bean setters as Map instance
     * 
     * @param clazz
     *            - bean class
     * @return setters
     */
    public static Map<String, Method> getSetters(Class<?> clazz) {
        if (!beanReflectInfoMap.containsKey(clazz)) {
            addToCache(clazz);
        }
        BeanReflectInfoBean data = beanReflectInfoMap.get(clazz);
        return data.getSetters();
    }

    /**
     * Get bean getters as Map instance
     * 
     * @param clazz
     *            - bean class
     * @return getters
     */
    public static Map<String, Method> getGetters(Class<?> clazz) {
        if (!beanReflectInfoMap.containsKey(clazz)) {
            addToCache(clazz);
        }
        BeanReflectInfoBean data = beanReflectInfoMap.get(clazz);
        return data.getGetters();
    }

    /**
     * Get bean properties
     * 
     * @param bean
     *            - bean instance
     * @param getters
     *            - getter methods Map
     * @return values Map
     * @throws Exception
     */
    public static Map<String, Object> getBeanProperties(Object bean, Map<String, Method> getters) {
        Map<String, Object> props = new LinkedHashMap<String, Object>();

        Class<?> clazz = bean.getClass();
        if (getters == null) {
            getters = getGetters(clazz);
        }
        for (Map.Entry<String, Method> entry : getters.entrySet()) {
            String prop = entry.getKey();
            Method getter = entry.getValue();
            Object value;
            try {
                value = getter.invoke(bean, new Object[] {});
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
            props.put(prop, value);
        }

        return props;
    }

    /**
     * Set bean properties
     * 
     * @param bean
     *            - bean instance
     * @param setters
     *            - getter methods Map
     * @param values
     *            - values Map
     * @throws Exception
     */
    public static void setBeanProperties(Object bean, Map<String, Method> setters, Map<String, ? extends Object> values) {
        Class<?> clazz = bean.getClass();
        if (setters == null) {
            setters = getSetters(clazz);
        }

        for (Map.Entry<String, ?> entry : values.entrySet()) {
            String prop = entry.getKey();
            Object value = entry.getValue();
            Method setter = setters.get(prop);
            if (setter != null) {
                if (value == null) {
                    try {
                        setter.invoke(bean, new Object[] { null });
                    } catch (Exception e) {
                        throw new RuntimeException(e.getMessage(), e);
                    }
                } else {
                    Class<?> setterParamType = setter.getParameterTypes()[0];
                    if (!value.getClass().equals(setterParamType)) {
                        value = convertValueType(value, value.getClass(), setterParamType);
                    }
                    if (setterParamType.isInstance(value)) {
                        try {
                            setter.invoke(bean, new Object[] { value });
                        } catch (Exception e) {
                            throw new RuntimeException(e.getMessage(), e);
                        }
                    }
                }
            }
        }
    }

    /**
     * Convert property values
     * 
     * @param fromValue
     *            - source Object before convert
     * @param fromType
     *            - source Object type
     * @param toType
     *            - target Object type
     * @return target Object
     */
    public static Object convertValueType(Object fromValue, Class<?> fromType, Class<?> toType) {
        if (fromValue == null || fromType == null || toType == null) {
            return fromValue;
        }
        if (toType.equals(String.class) && !fromType.equals(String.class)) {
            // Non String Type→String Type
            return StringUtil.objectToStr(fromValue);
        }
        if (fromType.equals(String.class) && !toType.equals(String.class)) {
            // String Type→Non String Type
            return StringUtil.toObject((String) fromValue, toType);
        }

        if (!toType.equals(String.class) && fromType.equals(BigDecimal.class)) {
            // BigDecimal Type→Non String Type
            if (toType.equals(BigInteger.class)) {
                // BigDecimal Type→BigInteger Type
                return BigInteger.valueOf(((BigDecimal) fromValue).longValue());
            } else if (toType.equals(Integer.class)) {
                // BigDecimal Type→Integer Type
                return ((BigDecimal) fromValue).intValue();
            } else if (toType.equals(Long.class)) {
                return ((BigDecimal) fromValue).longValue();
            } else if (toType.equals(Short.class)) {
                // BigDecimal Type→Short Type
                return (short) (((BigDecimal) fromValue).shortValue());
            } else if (toType.equals(Double.class)) {
                // BigDecimal Type→Double Type
                return ((BigDecimal) fromValue).doubleValue();
            } else if (toType.equals(Float.class)) {
                // BigDecimal Type→Float Type
                return ((BigDecimal) fromValue).floatValue();
            } else {
                return fromValue;
            }
        } else if (toType.equals(BigDecimal.class) && fromValue instanceof Number) {
            // Number Type→BigDecimal Type
            return new BigDecimal(fromValue.toString());
        } else if (!toType.equals(String.class) && fromType.equals(BigInteger.class)) {
            // BigInteger Type→Non String Type
            if (toType.equals(Integer.class)) {
                // BigInteger Type→Integer Type
                return ((BigInteger) fromValue).intValue();
            } else if (toType.equals(Long.class)) {
                // BigInteger Type→Long Type
                return ((BigInteger) fromValue).longValue();
            } else if (toType.equals(Short.class)) {
                // BigInteger Type→Short Type
                return (short) (((BigInteger) fromValue).intValue());
            } else if (toType.equals(Double.class)) {
                // BigInteger Type→Double Type
                return ((BigInteger) fromValue).doubleValue();
            } else if (toType.equals(Float.class)) {
                // BigInteger Type→Float Type
                return ((BigInteger) fromValue).floatValue();
            } else {
                return fromValue;
            }
        } else if (toType.equals(BigInteger.class) && (fromType.equals(Integer.class) || fromType.equals(Long.class) || fromType.equals(Short.class))) {
            // Integer Type→BigInteger Type
            return new BigInteger(fromValue.toString());
        } else {
            return fromValue;
        }
    }

    /**
     * Load bean class by class name
     * 
     * @param className
     * @return
     * @throws RuntimeException
     */
    public static Class<?> getClass(String className) {
        Class<?> clazz = null;
        Thread t = Thread.currentThread();
        ClassLoader cl = t.getContextClassLoader();
        try {
            clazz = cl.loadClass(className);
        } catch (Exception e) {
            throw new RuntimeException("Fail to load bean class " + className, e);
        }
        return clazz;
    }

    /**
     * Create bean instance by class
     * 
     * @param className
     *            bean class name
     * @return bean instance
     * @throws RuntimeException
     */
    @SuppressWarnings("unchecked")
    public static <T> T createBean(Class<T> clazz) {
        Object object = null;
        try {
            object = clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Fail to create bean instance " + clazz, e);
        }
        return (T) object;
    }

    /**
     * Create bean instance by class name and constructor parameters
     * 
     * @param clazz
     *            - bean class
     * @param constructorParameter
     *            - constructor parameters
     * @return bean instance
     * @throws RuntimeException
     */
    @SuppressWarnings("unchecked")
    public static <T> T createBean(Class<T> clazz, Object[] constructorParameter) {
        Constructor<?>[] constructors = null;
        try {
            constructors = clazz.getConstructors();
        } catch (Exception e) {
            throw new RuntimeException("Fail to get bean constructor " + clazz, e);
        }
        for (int i = 0; i < constructors.length; i++) {
            Object object = null;
            try {
                object = constructors[i].newInstance(constructorParameter);
            } catch (Exception e) {
            }
            if (object != null) {
                return (T) object;
            }
        }
        throw new RuntimeException("Fail to create bean instance " + clazz);
    }

    /**
     * Convert Map's key-value pair to bean instance
     * 
     * @param mapObject
     * @param clazz
     * @return
     */
    public static <T> T mapToBean(Map<String, ? extends Object> mapObject, Class<T> clazz) {
        T bean = createBean(clazz);
        Map<String, Method> setters = getSetters(bean.getClass());
        try {
            setBeanProperties(bean, setters, mapObject);
        } catch (Exception e) {
            bean = null;
        }
        return bean;
    }

    /**
     * @param bean
     * @return
     * @throws Exception
     */
    public static <T> Map<String, Object> beanToMap(T bean) {
        if (bean == null) {
            return null;
        }

        Map<String, Method> getters = getGetters(bean.getClass());
        try {
            return getBeanProperties(bean, getters);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
    
    /**
     * BeanReflectInfoBean
     */
    static class BeanReflectInfoBean implements Serializable {
        /**
         * serialVersionUID
         */
        private static final long serialVersionUID = 6942453830755737827L;
        
        /**
         * Class instance
         */
        private Class<?> clazz;
        /**
         * Setter map
         */
        private Map<String, Method> setters;
        /**
         * Getter map
         */
        private Map<String, Method> getters;
        /**
         * Cached time
         */
        private Long cachedTime;
        
        /**
         * @return the clazz
         */
        public Class<?> getClazz() {
            return clazz;
        }
        /**
         * @param clazz the clazz to set
         */
        public void setClazz(Class<?> clazz) {
            this.clazz = clazz;
        }
        /**
         * @return the setters
         */
        public Map<String, Method> getSetters() {
            return setters;
        }
        /**
         * @param setters the setters to set
         */
        public void setSetters(Map<String, Method> setters) {
            this.setters = setters;
        }
        /**
         * @return the getters
         */
        public Map<String, Method> getGetters() {
            return getters;
        }
        /**
         * @param getters the getters to set
         */
        public void setGetters(Map<String, Method> getters) {
            this.getters = getters;
        }
        /**
         * @return the cachedTime
         */
        public Long getCachedTime() {
            return cachedTime;
        }
        /**
         * @param cachedTime the cachedTime to set
         */
        public void setCachedTime(Long cachedTime) {
            this.cachedTime = cachedTime;
        }
    }

}
