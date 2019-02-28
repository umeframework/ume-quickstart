
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
 * 数据表"唱片基本信息表"映射的实体类<br>
 *
 * @author Generator
 */
@Entity
@Table(name="ALBUM")
@ApiModel(value="AlbumDto", description="唱片基本信息表")
public class AlbumDto implements Serializable {
   /**
    * Default serial version number<br>
    */
    private static final long serialVersionUID = 1L;

   /**
    * 编号<br>
    */
    @Id
    @Column(name="ID", nullable=false, columnDefinition="AUTO-INCREMENT NOT NULL", table="ALBUM")
    @NotNull
    @ApiModelProperty(value="编号", name="id", required=true)
    private Long id;

   /**
    * 标题<br>
    */
    @Column(name="TITLE", nullable=false, length=128, columnDefinition="VARCHAR(128) NOT NULL", table="ALBUM")
    @NotNull
    @ApiModelProperty(value="标题", name="title", required=true)
    private String title;

   /**
    * 艺术家<br>
    */
    @Column(name="ARTIST", nullable=false, length=32, columnDefinition="VARCHAR(32) NOT NULL", table="ALBUM")
    @NotNull
    @ApiModelProperty(value="艺术家", name="artist", required=true)
    private String artist;

   /**
    * 发行时间<br>
    */
    @Column(name="ISSUE_DATE", nullable=true, columnDefinition="DATE", table="ALBUM")
    @ApiModelProperty(value="发行时间", name="issueDate")
    private java.sql.Date issueDate;

   /**
    * 风格<br>
    */
    @Column(name="GENRE", nullable=true, length=2, columnDefinition="CHAR(2)", table="ALBUM")
    @ApiModelProperty(value="风格", name="genre")
    private String genre;

   /**
    * 封面设计<br>
    */
    @Column(name="COVER_PHOTO", nullable=true, columnDefinition="BLOB", table="ALBUM")
    @ApiModelProperty(value="封面设计", name="coverPhoto")
    private java.sql.Blob coverPhoto;

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
     *　Get the "编号"
     */
    public Long getId() {
        return this.id;
    }
    /**
     *　Set the "编号"
     */
    public void setId(
            Long id) {
        this.id = id;
    }

    /**
     *　Get the "标题"
     */
    public String getTitle() {
        return this.title;
    }
    /**
     *　Set the "标题"
     */
    public void setTitle(
            String title) {
        this.title = title;
    }

    /**
     *　Get the "艺术家"
     */
    public String getArtist() {
        return this.artist;
    }
    /**
     *　Set the "艺术家"
     */
    public void setArtist(
            String artist) {
        this.artist = artist;
    }

    /**
     *　Get the "发行时间"
     */
    public java.sql.Date getIssueDate() {
        return this.issueDate;
    }
    /**
     *　Set the "发行时间"
     */
    public void setIssueDate(
            java.sql.Date issueDate) {
        this.issueDate = issueDate;
    }

    /**
     *　Get the "风格"
     */
    public String getGenre() {
        return this.genre;
    }
    /**
     *　Set the "风格"
     */
    public void setGenre(
            String genre) {
        this.genre = genre;
    }

    /**
     *　Get the "封面设计"
     */
    public java.sql.Blob getCoverPhoto() {
        return this.coverPhoto;
    }
    /**
     *　Set the "封面设计"
     */
    public void setCoverPhoto(
            java.sql.Blob coverPhoto) {
        this.coverPhoto = coverPhoto;
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
        AlbumDto other = (AlbumDto) that;
        return
            (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            &&  (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            &&  (this.getArtist() == null ? other.getArtist() == null : this.getArtist().equals(other.getArtist()))
            &&  (this.getIssueDate() == null ? other.getIssueDate() == null : this.getIssueDate().equals(other.getIssueDate()))
            &&  (this.getGenre() == null ? other.getGenre() == null : this.getGenre().equals(other.getGenre()))
            &&  (this.getCoverPhoto() == null ? other.getCoverPhoto() == null : this.getCoverPhoto().equals(other.getCoverPhoto()))
        ;
    }
    /* (non-Javadoc)
     * @see java.lang.Object
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getArtist() == null) ? 0 : getArtist().hashCode());
        result = prime * result + ((getIssueDate() == null) ? 0 : getIssueDate().hashCode());
        result = prime * result + ((getGenre() == null) ? 0 : getGenre().hashCode());
        result = prime * result + ((getCoverPhoto() == null) ? 0 : getCoverPhoto().hashCode());
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
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", artist=").append(artist);
        sb.append(", issueDate=").append(issueDate);
        sb.append(", genre=").append(genre);
        sb.append(", coverPhoto=").append(coverPhoto);
        sb.append("]");
        return sb.toString();
    }

    /**
     * Constant declare: SQL ID in config file
     */
    public static class SQLID {
        public static final String FIND_LIST = "org.umeframework.quickstart.sample.entity.ALBUM_FIND_LIST";
        public static final String FIND_LIST_LIKE = "org.umeframework.quickstart.sample.entity.ALBUM_FIND_LIST_LIKE";
        public static final String COUNT = "org.umeframework.quickstart.sample.entity.ALBUM_COUNT";
        public static final String FIND = "org.umeframework.quickstart.sample.entity.ALBUM_FIND";
        public static final String FIND_FOR_UPDATE = "org.umeframework.quickstart.sample.entity.ALBUM_FIND_FOR_UPDATE";
        public static final String INSERT = "org.umeframework.quickstart.sample.entity.ALBUM_INSERT";
        public static final String UPDATE = "org.umeframework.quickstart.sample.entity.ALBUM_UPDATE";
        public static final String UPDATE_FULLY = "org.umeframework.quickstart.sample.entity.ALBUM_UPDATE_FULLY";
        public static final String UPDATE_ANY = "org.umeframework.quickstart.sample.entity.ALBUM_UPDATE_ANY";
        public static final String DELETE = "org.umeframework.quickstart.sample.entity.ALBUM_DELETE";
        public static final String DELETE_ANY = "org.umeframework.quickstart.sample.entity.ALBUM_DELETE_ANY";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String id = "id";
        public static final String title = "title";
        public static final String artist = "artist";
        public static final String issueDate = "issueDate";
        public static final String genre = "genre";
        public static final String coverPhoto = "coverPhoto";
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
        public static final String ID = "ID";
        public static final String TITLE = "TITLE";
        public static final String ARTIST = "ARTIST";
        public static final String ISSUE_DATE = "ISSUE_DATE";
        public static final String GENRE = "GENRE";
        public static final String COVER_PHOTO = "COVER_PHOTO";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "ALBUM";

}
