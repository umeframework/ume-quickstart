
package org.umeframework.quickstart.uac.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang.StringEscapeUtils;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 数据表"UME用户表"映射的实体类<br>
 *
 * @author Generator
 */
@Entity
@Table(name="UME_USER")
@ApiModel(value="UmeUserDto", description="UME用户表")
public class UmeUserDto implements Serializable {
   /**
    * Default serial version number<br>
    */
    private static final long serialVersionUID = 1L;

   /**
    * 用户识别ID<br>
    */
    @Id
    @Column(name="USER_ID", nullable=false, length=32, columnDefinition="VARCHAR(32) NOT NULL", table="UME_USER")
    @NotNull
    @ApiModelProperty(value="用户识别ID", name="userId", required=true)
    private String userId;

   /**
    * 用户登录密码<br>
    */
    @Column(name="USER_PASSWORD", nullable=true, length=32, columnDefinition="VARCHAR(32)", table="UME_USER")
    @ApiModelProperty(value="用户登录密码", name="userPassword")
    private String userPassword;

   /**
    * 用户名<br>
    */
    @Column(name="USER_NAME", nullable=true, length=256, columnDefinition="VARCHAR(256)", table="UME_USER")
    @ApiModelProperty(value="用户名", name="userName")
    private String userName;

   /**
    * 用户昵称<br>
    */
    @Column(name="USER_NICK_NAME", nullable=true, length=256, columnDefinition="VARCHAR(256)", table="UME_USER")
    @ApiModelProperty(value="用户昵称", name="userNickName")
    private String userNickName;

   /**
    * 用户性别<br>
    */
    @Column(name="USER_GENDER", nullable=true, length=1, columnDefinition="INT(1)", table="UME_USER")
    @ApiModelProperty(value="用户性别", name="userGender")
    private Integer userGender;

   /**
    * 用户手机<br>
    */
    @Column(name="USER_MOBILE", nullable=true, length=16, columnDefinition="VARCHAR(16)", table="UME_USER")
    @ApiModelProperty(value="用户手机", name="userMobile")
    private String userMobile;

   /**
    * 用户邮箱<br>
    */
    @Column(name="USER_EMAIL", nullable=true, length=64, columnDefinition="VARCHAR(64)", table="UME_USER")
    @ApiModelProperty(value="用户邮箱", name="userEmail")
    private String userEmail;

   /**
    * 用户头像<br>
    */
    @Column(name="USER_HEAD_IMAGE", nullable=true, length=256, columnDefinition="VARCHAR(256)", table="UME_USER")
    @ApiModelProperty(value="用户头像", name="userHeadImage")
    private String userHeadImage;

   /**
    * 用户描述信息<br>
    */
    @Column(name="USER_DESC", nullable=true, length=256, columnDefinition="VARCHAR(256)", table="UME_USER")
    @ApiModelProperty(value="用户描述信息", name="userDesc")
    private String userDesc;

   /**
    * 用户账户状态<br>
    */
    @Column(name="USER_STATUS", nullable=true, length=1, columnDefinition="INT(1)", table="UME_USER")
    @ApiModelProperty(value="用户账户状态", name="userStatus")
    private Integer userStatus;

   /**
    * Create Author (default setting while insert)
    */
    @Column(name="CREATE_AUTHOR", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @Column(name="UPDATE_AUTHOR", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;
    /**
     * table division, default is empty
     */
    private String _theDivision;
    /**
     * SQL Order By condition parameter
     */
    private String _theOrderByCondition;
    /**
     * Dynamic SQL query condition parameter
     */
    private String _theSqlCondition;
    /**
     * fetch max size
     */
    private Integer _theFetchSize;
    /**
     * fetch begin index
     */
    private Integer _theFetchStart;

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
     * @return the _theDivision
     */
    public String get_theDivision() {
        return StringEscapeUtils.escapeSql(_theDivision);
    }
    /**
     * @param _theDivision
     *            the _theDivision to set
     */
    public void set_theDivision(
            String _theDivision) {
        if (_theDivision != null && _theDivision.contains(" ")) {
            throw new RuntimeException("Found illegal SQL characters input for set_theDivision:" + _theDivision);
        }
        this._theDivision = StringEscapeUtils.escapeSql(_theDivision);
    }
    /**
     * @return the _theOrderByCondition
     */
    public String get_theOrderByCondition() {
        return StringEscapeUtils.escapeSql(_theOrderByCondition);
    }
    /**
     * @param  _theOrderByCondition
     *            the  _theOrderByCondition to set
     */
    public void set_theOrderByCondition(
            String  _theOrderByCondition) {

        this._theOrderByCondition = StringEscapeUtils.escapeSql(_theOrderByCondition);
    }
    /**
     * @return the _theSqlCondition
     */
    public String get_theSqlCondition() {
        return StringEscapeUtils.escapeSql(_theSqlCondition);
    }
    /**
     * @param _theSqlCondition the _theSqlCondition to set
     */
    public void set_theSqlCondition(
            String _theSqlCondition) {
        this._theSqlCondition = StringEscapeUtils.escapeSql(_theSqlCondition);
    }
    /**
     * @return the _theFetchStart
     */
    public Integer get_theFetchStart() {
        return _theFetchStart;
    }
    /**
     * @param _theFetchStart the _theFetchStart to set
     */
    public void set_theFetchStart(
            Integer _theFetchStart) {
        this._theFetchStart = _theFetchStart;
    }
    /**
     * @return the _theFetchSize
     */
    public Integer get_theFetchSize() {
        return _theFetchSize;
    }
    /**
     * @param _theFetchSize
     *            the _theFetchSize to set
     */
    public void set_theFetchSize(
            Integer _theFetchSize) {
        this._theFetchSize = _theFetchSize;
    }
    /**
     * clearDefaultProperties
     */
    public void clearDefaultProperties() {
        this.set_theDivision(null);
        this.set_theOrderByCondition(null);
        this.set_theSqlCondition(null);
        this.set_theFetchSize(null);
        this.set_theFetchStart(null);
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UmeUserDto other = (UmeUserDto) that;
        return
            (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            &&  (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            &&  (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            &&  (this.getUserNickName() == null ? other.getUserNickName() == null : this.getUserNickName().equals(other.getUserNickName()))
            &&  (this.getUserGender() == null ? other.getUserGender() == null : this.getUserGender().equals(other.getUserGender()))
            &&  (this.getUserMobile() == null ? other.getUserMobile() == null : this.getUserMobile().equals(other.getUserMobile()))
            &&  (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            &&  (this.getUserHeadImage() == null ? other.getUserHeadImage() == null : this.getUserHeadImage().equals(other.getUserHeadImage()))
            &&  (this.getUserDesc() == null ? other.getUserDesc() == null : this.getUserDesc().equals(other.getUserDesc()))
            &&  (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
        ;
    }
    /* (non-Javadoc)
     * @see java.lang.Object
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserNickName() == null) ? 0 : getUserNickName().hashCode());
        result = prime * result + ((getUserGender() == null) ? 0 : getUserGender().hashCode());
        result = prime * result + ((getUserMobile() == null) ? 0 : getUserMobile().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserHeadImage() == null) ? 0 : getUserHeadImage().hashCode());
        result = prime * result + ((getUserDesc() == null) ? 0 : getUserDesc().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userName=").append(userName);
        sb.append(", userNickName=").append(userNickName);
        sb.append(", userGender=").append(userGender);
        sb.append(", userMobile=").append(userMobile);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userHeadImage=").append(userHeadImage);
        sb.append(", userDesc=").append(userDesc);
        sb.append(", userStatus=").append(userStatus);
        sb.append("]");
        return sb.toString();
    }

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
        public static final String _theSqlCondition = "_theSqlCondition";
        public static final String _theOrderByCondition = "_theOrderByCondition";
        public static final String _theDivision = "_theDivision";
        public static final String _theFetchSize = "_theFetchSize";
        public static final String _theFetchStart = "_theFetchStart";
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
