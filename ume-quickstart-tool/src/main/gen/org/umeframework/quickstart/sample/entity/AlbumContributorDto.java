
package org.umeframework.quickstart.sample.entity;

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
 * 数据表"参加该唱片录音的艺术家信息管理表"映射的实体类<br>
 *
 * @author Generator
 */
@Entity
@Table(name="ALBUM_CONTRIBUTOR")
@ApiModel(value="AlbumContributorDto", description="参加该唱片录音的艺术家信息管理表")
public class AlbumContributorDto implements Serializable {
   /**
    * Default serial version number<br>
    */
    private static final long serialVersionUID = 1L;

   /**
    * 唱片编号<br>
    */
    @Id
    @Column(name="ALBUM_ID", nullable=false, columnDefinition="INT NOT NULL", table="ALBUM_CONTRIBUTOR")
    @NotNull
    @ApiModelProperty(value="唱片编号", name="albumId", required=true)
    private Long albumId;

   /**
    * 参与曲目<br>
    */
    @Id
    @Column(name="TRACK_NO", nullable=false, length=128, columnDefinition="INT(128) NOT NULL", table="ALBUM_CONTRIBUTOR")
    @NotNull
    @ApiModelProperty(value="参与曲目", name="trackNo", required=true)
    private Integer trackNo;

   /**
    * 艺术家<br>
    */
    @Id
    @Column(name="CONTRIBUTOR", nullable=false, length=32, columnDefinition="VARCHAR(32) NOT NULL", table="ALBUM_CONTRIBUTOR")
    @NotNull
    @ApiModelProperty(value="艺术家", name="contributor", required=true)
    private String contributor;

   /**
    * 备注<br>
    */
    @Column(name="COMMENT", nullable=true, length=256, columnDefinition="VARCHAR(256)", table="ALBUM_CONTRIBUTOR")
    @ApiModelProperty(value="备注", name="comment")
    private String comment;

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
     *　Get the "唱片编号"
     */
    public Long getAlbumId() {
        return this.albumId;
    }
    /**
     *　Set the "唱片编号"
     */
    public void setAlbumId(
            Long albumId) {
        this.albumId = albumId;
    }

    /**
     *　Get the "参与曲目"
     */
    public Integer getTrackNo() {
        return this.trackNo;
    }
    /**
     *　Set the "参与曲目"
     */
    public void setTrackNo(
            Integer trackNo) {
        this.trackNo = trackNo;
    }

    /**
     *　Get the "艺术家"
     */
    public String getContributor() {
        return this.contributor;
    }
    /**
     *　Set the "艺术家"
     */
    public void setContributor(
            String contributor) {
        this.contributor = contributor;
    }

    /**
     *　Get the "备注"
     */
    public String getComment() {
        return this.comment;
    }
    /**
     *　Set the "备注"
     */
    public void setComment(
            String comment) {
        this.comment = comment;
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
        AlbumContributorDto other = (AlbumContributorDto) that;
        return
            (this.getAlbumId() == null ? other.getAlbumId() == null : this.getAlbumId().equals(other.getAlbumId()))
            &&  (this.getTrackNo() == null ? other.getTrackNo() == null : this.getTrackNo().equals(other.getTrackNo()))
            &&  (this.getContributor() == null ? other.getContributor() == null : this.getContributor().equals(other.getContributor()))
            &&  (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
        ;
    }
    /* (non-Javadoc)
     * @see java.lang.Object
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAlbumId() == null) ? 0 : getAlbumId().hashCode());
        result = prime * result + ((getTrackNo() == null) ? 0 : getTrackNo().hashCode());
        result = prime * result + ((getContributor() == null) ? 0 : getContributor().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
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
        sb.append(", albumId=").append(albumId);
        sb.append(", trackNo=").append(trackNo);
        sb.append(", contributor=").append(contributor);
        sb.append(", comment=").append(comment);
        sb.append("]");
        return sb.toString();
    }

    /**
     * Constant declare: SQL ID in config file
     */
    public static class SQLID {
        public static final String FIND_LIST = "org.umeframework.quickstart.sample.entity.ALBUM_CONTRIBUTOR_FIND_LIST";
        public static final String FIND_LIST_LIKE = "org.umeframework.quickstart.sample.entity.ALBUM_CONTRIBUTOR_FIND_LIST_LIKE";
        public static final String COUNT = "org.umeframework.quickstart.sample.entity.ALBUM_CONTRIBUTOR_COUNT";
        public static final String FIND = "org.umeframework.quickstart.sample.entity.ALBUM_CONTRIBUTOR_FIND";
        public static final String FIND_FOR_UPDATE = "org.umeframework.quickstart.sample.entity.ALBUM_CONTRIBUTOR_FIND_FOR_UPDATE";
        public static final String INSERT = "org.umeframework.quickstart.sample.entity.ALBUM_CONTRIBUTOR_INSERT";
        public static final String UPDATE = "org.umeframework.quickstart.sample.entity.ALBUM_CONTRIBUTOR_UPDATE";
        public static final String UPDATE_FULLY = "org.umeframework.quickstart.sample.entity.ALBUM_CONTRIBUTOR_UPDATE_FULLY";
        public static final String UPDATE_ANY = "org.umeframework.quickstart.sample.entity.ALBUM_CONTRIBUTOR_UPDATE_ANY";
        public static final String DELETE = "org.umeframework.quickstart.sample.entity.ALBUM_CONTRIBUTOR_DELETE";
        public static final String DELETE_ANY = "org.umeframework.quickstart.sample.entity.ALBUM_CONTRIBUTOR_DELETE_ANY";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String albumId = "albumId";
        public static final String trackNo = "trackNo";
        public static final String contributor = "contributor";
        public static final String comment = "comment";
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
        public static final String ALBUM_ID = "ALBUM_ID";
        public static final String TRACK_NO = "TRACK_NO";
        public static final String CONTRIBUTOR = "CONTRIBUTOR";
        public static final String COMMENT = "COMMENT";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "ALBUM_CONTRIBUTOR";

}
