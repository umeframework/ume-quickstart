
package org.umeframework.quickstart.sample.entity;

import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity class map to table "参加该唱片录音的艺术家信息管理表"
 *
 * @author ume-team
 */
@Entity
@Table(name="ALBUM_CONTRIBUTOR")
public class AlbumContributorDto implements Serializable {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 唱片编号 
    */
    @Id
    @Column(name="ALBUM_ID", nullable=false, columnDefinition="INT NOT NULL", table="ALBUM_CONTRIBUTOR")
    private Long albumId;

   /**
    * 参与曲目 
    */
    @Id
    @Column(name="TRACK_NO", nullable=false, length=128, columnDefinition="INT(128) NOT NULL", table="ALBUM_CONTRIBUTOR")
    private Integer trackNo;

   /**
    * 艺术家 
    */
    @Id
    @Column(name="CONTRIBUTOR", nullable=false, length=32, columnDefinition="VARCHAR(32) NOT NULL", table="ALBUM_CONTRIBUTOR")
    private String contributor;

   /**
    * 备注 
    */
    @Column(name="COMMENT", nullable=true, length=256, columnDefinition="VARCHAR(256)", table="ALBUM_CONTRIBUTOR")
    private String comment;

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
    public AlbumContributorDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        AlbumContributorDto newInstance = new AlbumContributorDto();
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
