
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
 * 数据表"UME资源管理表"映射的实体类<br>
 *
 * @author Generator
 */
@Entity
@Table(name="UME_RESOURCE")
@ApiModel(value="UmeResourceDto", description="UME资源管理表")
public class UmeResourceDto implements Serializable {
   /**
    * Default serial version number<br>
    */
    private static final long serialVersionUID = 1L;

   /**
    * 资源ID<br>
    */
    @Id
    @Column(name="RES_ID", nullable=false, length=32, columnDefinition="VARCHAR(32) NOT NULL", table="UME_RESOURCE")
    @NotNull
    @ApiModelProperty(value="资源ID", name="resId", required=true)
    private String resId;

   /**
    * 资源类型<br>
    */
    @Id
    @Column(name="RES_TYPE", nullable=false, length=2, columnDefinition="INT(2) NOT NULL", table="UME_RESOURCE")
    @NotNull
    @ApiModelProperty(value="资源类型", name="resType", required=true)
    private Integer resType;

   /**
    * 资源名称<br>
    */
    @Column(name="RES_NAME", nullable=true, length=64, columnDefinition="VARCHAR(64)", table="UME_RESOURCE")
    @ApiModelProperty(value="资源名称", name="resName")
    private String resName;

   /**
    * 资源分组<br>
    */
    @Column(name="RES_GROUP", nullable=true, length=64, columnDefinition="VARCHAR(64)", table="UME_RESOURCE")
    @ApiModelProperty(value="资源分组", name="resGroup")
    private String resGroup;

   /**
    * 资源链接<br>
    */
    @Column(name="RES_LINK", nullable=true, length=1024, columnDefinition="VARCHAR(1024)", table="UME_RESOURCE")
    @ApiModelProperty(value="资源链接", name="resLink")
    private String resLink;

   /**
    * 资源排序序号<br>
    */
    @Column(name="RES_INDEX", nullable=true, length=8, columnDefinition="INT(8)", table="UME_RESOURCE")
    @ApiModelProperty(value="资源排序序号", name="resIndex")
    private Integer resIndex;

   /**
    * 资源状态<br>
    */
    @Column(name="RES_STATUS", nullable=true, length=1, columnDefinition="INT(1)", table="UME_RESOURCE")
    @ApiModelProperty(value="资源状态", name="resStatus")
    private Integer resStatus;

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
     *　Get the "资源ID"
     */
    public String getResId() {
        return this.resId;
    }
    /**
     *　Set the "资源ID"
     */
    public void setResId(
            String resId) {
        this.resId = resId;
    }

    /**
     *　Get the "资源类型"
     */
    public Integer getResType() {
        return this.resType;
    }
    /**
     *　Set the "资源类型"
     */
    public void setResType(
            Integer resType) {
        this.resType = resType;
    }

    /**
     *　Get the "资源名称"
     */
    public String getResName() {
        return this.resName;
    }
    /**
     *　Set the "资源名称"
     */
    public void setResName(
            String resName) {
        this.resName = resName;
    }

    /**
     *　Get the "资源分组"
     */
    public String getResGroup() {
        return this.resGroup;
    }
    /**
     *　Set the "资源分组"
     */
    public void setResGroup(
            String resGroup) {
        this.resGroup = resGroup;
    }

    /**
     *　Get the "资源链接"
     */
    public String getResLink() {
        return this.resLink;
    }
    /**
     *　Set the "资源链接"
     */
    public void setResLink(
            String resLink) {
        this.resLink = resLink;
    }

    /**
     *　Get the "资源排序序号"
     */
    public Integer getResIndex() {
        return this.resIndex;
    }
    /**
     *　Set the "资源排序序号"
     */
    public void setResIndex(
            Integer resIndex) {
        this.resIndex = resIndex;
    }

    /**
     *　Get the "资源状态"
     */
    public Integer getResStatus() {
        return this.resStatus;
    }
    /**
     *　Set the "资源状态"
     */
    public void setResStatus(
            Integer resStatus) {
        this.resStatus = resStatus;
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
        UmeResourceDto other = (UmeResourceDto) that;
        return
            (this.getResId() == null ? other.getResId() == null : this.getResId().equals(other.getResId()))
            &&  (this.getResType() == null ? other.getResType() == null : this.getResType().equals(other.getResType()))
            &&  (this.getResName() == null ? other.getResName() == null : this.getResName().equals(other.getResName()))
            &&  (this.getResGroup() == null ? other.getResGroup() == null : this.getResGroup().equals(other.getResGroup()))
            &&  (this.getResLink() == null ? other.getResLink() == null : this.getResLink().equals(other.getResLink()))
            &&  (this.getResIndex() == null ? other.getResIndex() == null : this.getResIndex().equals(other.getResIndex()))
            &&  (this.getResStatus() == null ? other.getResStatus() == null : this.getResStatus().equals(other.getResStatus()))
        ;
    }
    /* (non-Javadoc)
     * @see java.lang.Object
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResId() == null) ? 0 : getResId().hashCode());
        result = prime * result + ((getResType() == null) ? 0 : getResType().hashCode());
        result = prime * result + ((getResName() == null) ? 0 : getResName().hashCode());
        result = prime * result + ((getResGroup() == null) ? 0 : getResGroup().hashCode());
        result = prime * result + ((getResLink() == null) ? 0 : getResLink().hashCode());
        result = prime * result + ((getResIndex() == null) ? 0 : getResIndex().hashCode());
        result = prime * result + ((getResStatus() == null) ? 0 : getResStatus().hashCode());
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
        sb.append(", resId=").append(resId);
        sb.append(", resType=").append(resType);
        sb.append(", resName=").append(resName);
        sb.append(", resGroup=").append(resGroup);
        sb.append(", resLink=").append(resLink);
        sb.append(", resIndex=").append(resIndex);
        sb.append(", resStatus=").append(resStatus);
        sb.append("]");
        return sb.toString();
    }

    /**
     * Constant declare: SQL ID in config file
     */
    public static class SQLID {
        public static final String FIND_LIST = "org.umeframework.quickstart.uac.entity.UME_RESOURCE_FIND_LIST";
        public static final String FIND_LIST_LIKE = "org.umeframework.quickstart.uac.entity.UME_RESOURCE_FIND_LIST_LIKE";
        public static final String COUNT = "org.umeframework.quickstart.uac.entity.UME_RESOURCE_COUNT";
        public static final String FIND = "org.umeframework.quickstart.uac.entity.UME_RESOURCE_FIND";
        public static final String FIND_FOR_UPDATE = "org.umeframework.quickstart.uac.entity.UME_RESOURCE_FIND_FOR_UPDATE";
        public static final String INSERT = "org.umeframework.quickstart.uac.entity.UME_RESOURCE_INSERT";
        public static final String UPDATE = "org.umeframework.quickstart.uac.entity.UME_RESOURCE_UPDATE";
        public static final String UPDATE_FULLY = "org.umeframework.quickstart.uac.entity.UME_RESOURCE_UPDATE_FULLY";
        public static final String UPDATE_ANY = "org.umeframework.quickstart.uac.entity.UME_RESOURCE_UPDATE_ANY";
        public static final String DELETE = "org.umeframework.quickstart.uac.entity.UME_RESOURCE_DELETE";
        public static final String DELETE_ANY = "org.umeframework.quickstart.uac.entity.UME_RESOURCE_DELETE_ANY";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String resId = "resId";
        public static final String resType = "resType";
        public static final String resName = "resName";
        public static final String resGroup = "resGroup";
        public static final String resLink = "resLink";
        public static final String resIndex = "resIndex";
        public static final String resStatus = "resStatus";
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
        public static final String RES_ID = "RES_ID";
        public static final String RES_TYPE = "RES_TYPE";
        public static final String RES_NAME = "RES_NAME";
        public static final String RES_GROUP = "RES_GROUP";
        public static final String RES_LINK = "RES_LINK";
        public static final String RES_INDEX = "RES_INDEX";
        public static final String RES_STATUS = "RES_STATUS";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "UME_RESOURCE";

}
