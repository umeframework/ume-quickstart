
package org.umeframework.quickstart.uac.entity;

import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity class map to table "UME用户表"
 *
 * @author ume-team
 */
@Entity
@Table(name="UME_USER")
public class UmeUserDto implements Serializable {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 用户识别ID 
    */
    @Id
    @Column(name="USER_ID", nullable=false, length=32, columnDefinition="VARCHAR(32) NOT NULL", table="UME_USER")
    private String userId;

   /**
    * 用户登录密码 
    */
    @Column(name="USER_PASSWORD", nullable=true, length=32, columnDefinition="VARCHAR(32)", table="UME_USER")
    private String userPassword;

   /**
    * 用户名 
    */
    @Column(name="USER_NAME", nullable=true, length=256, columnDefinition="VARCHAR(256)", table="UME_USER")
    private String userName;

   /**
    * 用户昵称 
    */
    @Column(name="USER_NICK_NAME", nullable=true, length=256, columnDefinition="VARCHAR(256)", table="UME_USER")
    private String userNickName;

   /**
    * 用户性别 
    * 1:男 2:女
    */
    @Column(name="USER_GENDER", nullable=true, length=1, columnDefinition="INT(1)", table="UME_USER")
    private Integer userGender;

   /**
    * 用户手机 
    */
    @Column(name="USER_MOBILE", nullable=true, length=16, columnDefinition="VARCHAR(16)", table="UME_USER")
    private String userMobile;

   /**
    * 用户邮箱 
    */
    @Column(name="USER_EMAIL", nullable=true, length=64, columnDefinition="VARCHAR(64)", table="UME_USER")
    private String userEmail;

   /**
    * 用户头像 
    * URL
    */
    @Column(name="USER_HEAD_IMAGE", nullable=true, length=256, columnDefinition="VARCHAR(256)", table="UME_USER")
    private String userHeadImage;

   /**
    * 用户描述信息 
    */
    @Column(name="USER_DESC", nullable=true, length=256, columnDefinition="VARCHAR(256)", table="UME_USER")
    private String userDesc;

   /**
    * 用户账户状态 
    * 1:正常 2:关闭
    */
    @Column(name="USER_STATUS", nullable=true, length=1, columnDefinition="INT(1)", table="UME_USER")
    private Integer userStatus;

   /**
    * Create Author (default setting while insert)
    */
    //@ColumnDesc(index=(10 + 1), type="VARCHAR", label="createAuthor")
    @Column(name="CREATE_AUTHOR", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    //@ColumnDesc(index=(10 + 2), type="TIMESTAMP", label="createDatetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    //@ColumnDesc(index=(10 + 3), type="VARCHAR", label="updateAuthor")
    @Column(name="UPDATE_AUTHOR", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    //@ColumnDesc(index=(10 + 4), type="TIMESTAMP", label="updateDatetime")
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
     *　Get the "用户识别ID"
     */
    public String getUserId() {
        return this.userId;
    }
    /**
     *　Set the "用户识别ID"
     */
    public void setUserId(
            String userId) {
        this.userId = userId;
    }

    /**
     *　Get the "用户登录密码"
     */
    public String getUserPassword() {
        return this.userPassword;
    }
    /**
     *　Set the "用户登录密码"
     */
    public void setUserPassword(
            String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     *　Get the "用户名"
     */
    public String getUserName() {
        return this.userName;
    }
    /**
     *　Set the "用户名"
     */
    public void setUserName(
            String userName) {
        this.userName = userName;
    }

    /**
     *　Get the "用户昵称"
     */
    public String getUserNickName() {
        return this.userNickName;
    }
    /**
     *　Set the "用户昵称"
     */
    public void setUserNickName(
            String userNickName) {
        this.userNickName = userNickName;
    }

    /**
     *　Get the "用户性别"
     */
    public Integer getUserGender() {
        return this.userGender;
    }
    /**
     *　Set the "用户性别"
     */
    public void setUserGender(
            Integer userGender) {
        this.userGender = userGender;
    }

    /**
     *　Get the "用户手机"
     */
    public String getUserMobile() {
        return this.userMobile;
    }
    /**
     *　Set the "用户手机"
     */
    public void setUserMobile(
            String userMobile) {
        this.userMobile = userMobile;
    }

    /**
     *　Get the "用户邮箱"
     */
    public String getUserEmail() {
        return this.userEmail;
    }
    /**
     *　Set the "用户邮箱"
     */
    public void setUserEmail(
            String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     *　Get the "用户头像"
     */
    public String getUserHeadImage() {
        return this.userHeadImage;
    }
    /**
     *　Set the "用户头像"
     */
    public void setUserHeadImage(
            String userHeadImage) {
        this.userHeadImage = userHeadImage;
    }

    /**
     *　Get the "用户描述信息"
     */
    public String getUserDesc() {
        return this.userDesc;
    }
    /**
     *　Set the "用户描述信息"
     */
    public void setUserDesc(
            String userDesc) {
        this.userDesc = userDesc;
    }

    /**
     *　Get the "用户账户状态"
     */
    public Integer getUserStatus() {
        return this.userStatus;
    }
    /**
     *　Set the "用户账户状态"
     */
    public void setUserStatus(
            Integer userStatus) {
        this.userStatus = userStatus;
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
    public UmeUserDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        UmeUserDto newInstance = new UmeUserDto();
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
        public static final String FIND_LIST = "org.umeframework.quickstart.uac.entity.UME_USER_FIND_LIST";
        public static final String FIND_LIST_LIKE = "org.umeframework.quickstart.uac.entity.UME_USER_FIND_LIST_LIKE";
        public static final String COUNT = "org.umeframework.quickstart.uac.entity.UME_USER_COUNT";
        public static final String FIND = "org.umeframework.quickstart.uac.entity.UME_USER_FIND";
        public static final String FIND_FOR_UPDATE = "org.umeframework.quickstart.uac.entity.UME_USER_FIND_FOR_UPDATE";
        public static final String INSERT = "org.umeframework.quickstart.uac.entity.UME_USER_INSERT";
        public static final String UPDATE = "org.umeframework.quickstart.uac.entity.UME_USER_UPDATE";
        public static final String UPDATE_FULLY = "org.umeframework.quickstart.uac.entity.UME_USER_UPDATE_FULLY";
        public static final String UPDATE_ANY = "org.umeframework.quickstart.uac.entity.UME_USER_UPDATE_ANY";
        public static final String DELETE = "org.umeframework.quickstart.uac.entity.UME_USER_DELETE";
        public static final String DELETE_ANY = "org.umeframework.quickstart.uac.entity.UME_USER_DELETE_ANY";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String userId = "userId";
        public static final String userPassword = "userPassword";
        public static final String userName = "userName";
        public static final String userNickName = "userNickName";
        public static final String userGender = "userGender";
        public static final String userMobile = "userMobile";
        public static final String userEmail = "userEmail";
        public static final String userHeadImage = "userHeadImage";
        public static final String userDesc = "userDesc";
        public static final String userStatus = "userStatus";
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
        public static final String USER_ID = "USER_ID";
        public static final String USER_PASSWORD = "USER_PASSWORD";
        public static final String USER_NAME = "USER_NAME";
        public static final String USER_NICK_NAME = "USER_NICK_NAME";
        public static final String USER_GENDER = "USER_GENDER";
        public static final String USER_MOBILE = "USER_MOBILE";
        public static final String USER_EMAIL = "USER_EMAIL";
        public static final String USER_HEAD_IMAGE = "USER_HEAD_IMAGE";
        public static final String USER_DESC = "USER_DESC";
        public static final String USER_STATUS = "USER_STATUS";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "UME_USER";

}
