
package org.umeframework.quickstart.uac.entity;

import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity class map to table "UME角色资源访问权限关系表"
 *
 * @author ume-team
 */
@Entity
@Table(name="UME_ROLE_ACL")
public class UmeRoleAclDto implements Serializable {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 角色ID 
    */
    @Id
    @Column(name="ROLE_ID", nullable=false, length=32, columnDefinition="VARCHAR(32) NOT NULL", table="UME_ROLE_ACL")
    private String roleId;

   /**
    * 角色可访问的资源ID 
    */
    @Id
    @Column(name="ACC_RES_ID", nullable=false, length=32, columnDefinition="VARCHAR(32) NOT NULL", table="UME_ROLE_ACL")
    private String accResId;

   /**
    * 角色可访问的资源ID 
    */
    @Id
    @Column(name="ACC_RES_TYPE", nullable=false, length=2, columnDefinition="INT(2) NOT NULL", table="UME_ROLE_ACL")
    private Integer accResType;

   /**
    * 访问级别 
    * 0:使用不可 1:只读 2:更新 4:读写
    */
    @Id
    @Column(name="ACC_LEVEL", nullable=false, length=2, columnDefinition="INT(2) NOT NULL", table="UME_ROLE_ACL")
    private Integer accLevel;

   /**
    * Create Author (default setting while insert)
    */
    //@ColumnDesc(index=(4 + 1), type="VARCHAR", label="createAuthor")
    @Column(name="CREATE_AUTHOR", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    //@ColumnDesc(index=(4 + 2), type="TIMESTAMP", label="createDatetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    //@ColumnDesc(index=(4 + 3), type="VARCHAR", label="updateAuthor")
    @Column(name="UPDATE_AUTHOR", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    //@ColumnDesc(index=(4 + 4), type="TIMESTAMP", label="updateDatetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;
	/**
     * table schema, default is empty
     */
    private String theSchema;
    /**
     * table division, default is empty
     */
    private String theDivision;
    /**
     * SQL Order By condition parameter
     */
    private String theOrderByCondition;
    /**
     * SQL Group By condition parameter
     */
    private String theGroupByCondition;
    /**
     * Dynamic SQL query condition parameter
     */
    private String theSQLCondition;
    /**
     * fetch max size
     */
    private Integer theFetchSize;
    /**
     * fetch begin index
     */
    private Integer theFetchStart;

    /**
     *　Get the "角色ID"
     */
    public String getRoleId() {
        return this.roleId;
    }
    /**
     *　Set the "角色ID"
     */
    public void setRoleId(
            String roleId) {
        this.roleId = roleId;
    }

    /**
     *　Get the "角色可访问的资源ID"
     */
    public String getAccResId() {
        return this.accResId;
    }
    /**
     *　Set the "角色可访问的资源ID"
     */
    public void setAccResId(
            String accResId) {
        this.accResId = accResId;
    }

    /**
     *　Get the "角色可访问的资源ID"
     */
    public Integer getAccResType() {
        return this.accResType;
    }
    /**
     *　Set the "角色可访问的资源ID"
     */
    public void setAccResType(
            Integer accResType) {
        this.accResType = accResType;
    }

    /**
     *　Get the "访问级别"
     */
    public Integer getAccLevel() {
        return this.accLevel;
    }
    /**
     *　Set the "访问级别"
     */
    public void setAccLevel(
            Integer accLevel) {
        this.accLevel = accLevel;
    }

    /**
     * Get the "Create Auther"
     */
    public String getCreateAuthor() {
        return createAuthor;
    }
    /**
     * Set the "Create Auther"
     */
    public void setCreateAuthor(
            String createAuthor) {
        this.createAuthor = createAuthor;
    }

    /**
     * Get the "Create Datetime"
     */
    public java.sql.Timestamp getCreateDatetime() {
        return createDatetime;
    }
    /**
     * Set the "Create Datetime"
     */
    public void setCreateDatetime(
            java.sql.Timestamp createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * Get the "Update Auther"
     */
    public String getUpdateAuthor() {
        return updateAuthor;
    }
    /**
     * Set the "Update Auther"
     */
    public void setUpdateAuthor(
            String updateAuthor) {
        this.updateAuthor = updateAuthor;
    }

    /**
     * Get the "Update Datetime"
     */
    public java.sql.Timestamp getUpdateDatetime() {
        return updateDatetime;
    }
    /**
     * Set the "Update Datetime"
     */
    public void setUpdateDatetime(
            java.sql.Timestamp updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
    /**
     * @return the theSchema
     */
    public String getTheSchema() {
        return theSchema;
    }
    /**
     * @param theSchema
     *            the theSchema to set
     */
    public void setTheSchema(
            String theSchema) {
        this.theSchema = theSchema;
    }
    /**
     * @return the theDivision
     */
    public String getTheDivision() {
        return theDivision;
    }
    /**
     * @param theDivision
     *            the theDivision to set
     */
    public void setTheDivision(
            String theDivision) {
        if (theDivision != null && theDivision.contains(" ")) {
            throw new RuntimeException("Found illegal SQL characters input for setTheDivision:" + theDivision);
        }
        this.theDivision = theDivision;
    }
    /**
     * @return the theOrderByCondition
     */
    public String getTheOrderByCondition() {
        return theOrderByCondition;
    }
    /**
     * @param theOrderByCondition
     *            the theOrderByCondition to set
     */
    public void setTheOrderByCondition(
            String theOrderByCondition) {

        this.theOrderByCondition = theOrderByCondition;
    }
    /**
     * @return the theFetchSize
     */
    public Integer getTheFetchSize() {
        return theFetchSize;
    }
    /**
     * @param theFetchSize
     *            the theFetchSize to set
     */
    public void setTheFetchSize(
            Integer theFetchSize) {
        this.theFetchSize = theFetchSize;
    }
    /**
     * @return the theGroupByCondition
     */
    public String getTheGroupByCondition() {
        return theGroupByCondition;
    }
    /**
     * @param theGroupByCondition
     *            the theGroupByCondition to set
     */
    public void setTheGroupByCondition(
            String theGroupByCondition) {
        this.theGroupByCondition = theGroupByCondition;
    }
    /**
     * @return the theSQLCondition
     */
    public String getTheSQLCondition() {
        return theSQLCondition;
    }
    /**
     * @param theSQLCondition the theSQLCondition to set
     */
    public void setTheSQLCondition(
            String theSQLCondition) {
        this.theSQLCondition = theSQLCondition;
    }
    /**
     * @return the theFetchStart
     */
    public Integer getTheFetchStart() {
        return theFetchStart;
    }
    /**
     * @param theFetchStart the theFetchStart to set
     */
    public void setTheFetchStart(
            Integer theFetchStart) {
        this.theFetchStart = theFetchStart;
    }
    /**
     * clearDefaultProperties
     */
    public void clearDefaultProperties() {
        this.setTheSchema(null);
        this.setTheDivision(null);
        this.setTheOrderByCondition(null);
        this.setTheGroupByCondition(null);
        this.setTheSQLCondition(null);
        this.setTheFetchSize(null);
        this.setTheFetchStart(null);
    }
    /**
     * Create bean instance copy with selected properties
     * 
     * @param selectProperties
     *            - properties which copy to new instance
     * @return
     */
    /* 
    public UmeRoleAclDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        UmeRoleAclDto newInstance = new UmeRoleAclDto();
        for (Property property : selectProperties) {
            String name = property.toString();
            Object value = org.umeframework.dora.bean.BeanUtil.BeanUtil.getBeanProperty(this, name);
            org.umeframework.dora.bean.BeanUtil.BeanUtil.setBeanProperty(newInstance, name, value);
        }
        return newInstance;
    } */
    
    /**
     * Constant declare: SQL ID in config file
     */
    public static class SQLID {
        public static final String FIND_LIST = "org.umeframework.quickstart.uac.entity.UME_ROLE_ACL_FIND_LIST";
        public static final String FIND_LIST_LIKE = "org.umeframework.quickstart.uac.entity.UME_ROLE_ACL_FIND_LIST_LIKE";
        public static final String COUNT = "org.umeframework.quickstart.uac.entity.UME_ROLE_ACL_COUNT";
        public static final String FIND = "org.umeframework.quickstart.uac.entity.UME_ROLE_ACL_FIND";
        public static final String FIND_FOR_UPDATE = "org.umeframework.quickstart.uac.entity.UME_ROLE_ACL_FIND_FOR_UPDATE";
        public static final String INSERT = "org.umeframework.quickstart.uac.entity.UME_ROLE_ACL_INSERT";
        public static final String UPDATE = "org.umeframework.quickstart.uac.entity.UME_ROLE_ACL_UPDATE";
        public static final String UPDATE_FULLY = "org.umeframework.quickstart.uac.entity.UME_ROLE_ACL_UPDATE_FULLY";
        public static final String UPDATE_ANY = "org.umeframework.quickstart.uac.entity.UME_ROLE_ACL_UPDATE_ANY";
        public static final String DELETE = "org.umeframework.quickstart.uac.entity.UME_ROLE_ACL_DELETE";
        public static final String DELETE_ANY = "org.umeframework.quickstart.uac.entity.UME_ROLE_ACL_DELETE_ANY";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String roleId = "roleId";
        public static final String accResId = "accResId";
        public static final String accResType = "accResType";
        public static final String accLevel = "accLevel";
        public static final String createAuthor = "createAuthor";
        public static final String createDatetime = "createDatetime";
        public static final String updateAuthor = "updateAuthor";
        public static final String updateDatetime = "updateDatetime";
        public static final String theGroupByCondition = "theGroupByCondition";
        public static final String theOrderByCondition = "theOrderByCondition";
        public static final String theSchema = "theSchema";
        public static final String theDivision = "theDivision";
        public static final String theFetchSize = "theFetchSize";
        public static final String theFetchStart = "theFetchStart";
    }
    
    /**
     * Constant declare: column name map with bean property.<br>
     */
    public static class ColumnName {
        public static final String ROLE_ID = "ROLE_ID";
        public static final String ACC_RES_ID = "ACC_RES_ID";
        public static final String ACC_RES_TYPE = "ACC_RES_TYPE";
        public static final String ACC_LEVEL = "ACC_LEVEL";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "UME_ROLE_ACL";

}
