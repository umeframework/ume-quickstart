
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
 * 数据表"唱片风格分类描述表"映射的实体类<br>
 *
 * @author Generator
 */
@Entity
@Table(name="ALBUM_GENRE")
@ApiModel(value="AlbumGenreDto", description="唱片风格分类描述表")
public class AlbumGenreDto implements Serializable {
   /**
    * Default serial version number<br>
    */
    private static final long serialVersionUID = 1L;

   /**
    * 风格编码<br>
    */
    @Id
    @Column(name="GENRE_ID", nullable=false, length=2, columnDefinition="CHAR(2) NOT NULL", table="ALBUM_GENRE")
    @NotNull
    @ApiModelProperty(value="风格编码", name="genreId", required=true)
    private String genreId;

   /**
    * 风格名称<br>
    */
    @Column(name="GENRE_NAME", nullable=false, length=32, columnDefinition="VARCHAR(32) NOT NULL", table="ALBUM_GENRE")
    @NotNull
    @ApiModelProperty(value="风格名称", name="genreName", required=true)
    private String genreName;

   /**
    * 风格描述<br>
    */
    @Column(name="COMMENT", nullable=true, length=512, columnDefinition="VARCHAR(512)", table="ALBUM_GENRE")
    @ApiModelProperty(value="风格描述", name="comment")
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
     *　Get the "风格编码"
     */
    public String getGenreId() {
        return this.genreId;
    }
    /**
     *　Set the "风格编码"
     */
    public void setGenreId(
            String genreId) {
        this.genreId = genreId;
    }

    /**
     *　Get the "风格名称"
     */
    public String getGenreName() {
        return this.genreName;
    }
    /**
     *　Set the "风格名称"
     */
    public void setGenreName(
            String genreName) {
        this.genreName = genreName;
    }

    /**
     *　Get the "风格描述"
     */
    public String getComment() {
        return this.comment;
    }
    /**
     *　Set the "风格描述"
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
        AlbumGenreDto other = (AlbumGenreDto) that;
        return
            (this.getGenreId() == null ? other.getGenreId() == null : this.getGenreId().equals(other.getGenreId()))
            &&  (this.getGenreName() == null ? other.getGenreName() == null : this.getGenreName().equals(other.getGenreName()))
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
        result = prime * result + ((getGenreId() == null) ? 0 : getGenreId().hashCode());
        result = prime * result + ((getGenreName() == null) ? 0 : getGenreName().hashCode());
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
        sb.append(", genreId=").append(genreId);
        sb.append(", genreName=").append(genreName);
        sb.append(", comment=").append(comment);
        sb.append("]");
        return sb.toString();
    }

    /**
     * Constant declare: SQL ID in config file
     */
    public static class SQLID {
        public static final String FIND_LIST = "org.umeframework.quickstart.sample.entity.ALBUM_GENRE_FIND_LIST";
        public static final String FIND_LIST_LIKE = "org.umeframework.quickstart.sample.entity.ALBUM_GENRE_FIND_LIST_LIKE";
        public static final String COUNT = "org.umeframework.quickstart.sample.entity.ALBUM_GENRE_COUNT";
        public static final String FIND = "org.umeframework.quickstart.sample.entity.ALBUM_GENRE_FIND";
        public static final String FIND_FOR_UPDATE = "org.umeframework.quickstart.sample.entity.ALBUM_GENRE_FIND_FOR_UPDATE";
        public static final String INSERT = "org.umeframework.quickstart.sample.entity.ALBUM_GENRE_INSERT";
        public static final String UPDATE = "org.umeframework.quickstart.sample.entity.ALBUM_GENRE_UPDATE";
        public static final String UPDATE_FULLY = "org.umeframework.quickstart.sample.entity.ALBUM_GENRE_UPDATE_FULLY";
        public static final String UPDATE_ANY = "org.umeframework.quickstart.sample.entity.ALBUM_GENRE_UPDATE_ANY";
        public static final String DELETE = "org.umeframework.quickstart.sample.entity.ALBUM_GENRE_DELETE";
        public static final String DELETE_ANY = "org.umeframework.quickstart.sample.entity.ALBUM_GENRE_DELETE_ANY";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String genreId = "genreId";
        public static final String genreName = "genreName";
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
        public static final String GENRE_ID = "GENRE_ID";
        public static final String GENRE_NAME = "GENRE_NAME";
        public static final String COMMENT = "COMMENT";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "ALBUM_GENRE";

}
