
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
 * 数据表"UME角色资源访问权限关系表"映射的实体类<br>
 *
 * @author Generator
 */
@Entity
@Table(name="UME_ROLE_ACL")
@ApiModel(value="UmeRoleAclDto", description="UME角色资源访问权限关系表")
public class UmeRoleAclDto implements Serializable {
   /**
    * Default serial version number<br>
    */
    private static final long serialVersionUID = 1L;

   /**
    * 角色ID<br>
    */
    @Id
    @Column(name="ROLE_ID", nullable=false, length=32, columnDefinition="VARCHAR(32) NOT NULL", table="UME_ROLE_ACL")
    @NotNull
    @ApiModelProperty(value="角色ID", name="roleId", required=true)
    private String roleId;

   /**
    * 角色可访问的资源ID<br>
    */
    @Id
    @Column(name="ACC_RES_ID", nullable=false, length=32, columnDefinition="VARCHAR(32) NOT NULL", table="UME_ROLE_ACL")
    @NotNull
    @ApiModelProperty(value="角色可访问的资源ID", name="accResId", required=true)
    private String accResId;

   /**
    * 角色可访问的资源ID<br>
    */
    @Id
    @Column(name="ACC_RES_TYPE", nullable=false, length=2, columnDefinition="INT(2) NOT NULL", table="UME_ROLE_ACL")
    @NotNull
    @ApiModelProperty(value="角色可访问的资源ID", name="accResType", required=true)
    private Integer accResType;

   /**
    * 访问级别<br>
    */
    @Id
    @Column(name="ACC_LEVEL", nullable=false, length=2, columnDefinition="INT(2) NOT NULL", table="UME_ROLE_ACL")
    @NotNull
    @ApiModelProperty(value="访问级别", name="accLevel", required=true)
    private Integer accLevel;

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
        UmeRoleAclDto other = (UmeRoleAclDto) that;
        return
            (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            &&  (this.getAccResId() == null ? other.getAccResId() == null : this.getAccResId().equals(other.getAccResId()))
            &&  (this.getAccResType() == null ? other.getAccResType() == null : this.getAccResType().equals(other.getAccResType()))
            &&  (this.getAccLevel() == null ? other.getAccLevel() == null : this.getAccLevel().equals(other.getAccLevel()))
        ;
    }
    /* (non-Javadoc)
     * @see java.lang.Object
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getAccResId() == null) ? 0 : getAccResId().hashCode());
        result = prime * result + ((getAccResType() == null) ? 0 : getAccResType().hashCode());
        result = prime * result + ((getAccLevel() == null) ? 0 : getAccLevel().hashCode());
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
        sb.append(", roleId=").append(roleId);
        sb.append(", accResId=").append(accResId);
        sb.append(", accResType=").append(accResType);
        sb.append(", accLevel=").append(accLevel);
        sb.append("]");
        return sb.toString();
    }

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
