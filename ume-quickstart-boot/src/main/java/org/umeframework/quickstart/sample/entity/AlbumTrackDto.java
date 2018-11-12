
package org.umeframework.quickstart.sample.entity;

import java.io.Serializable;
import org.umeframework.dora.validation.constraints.Size;
import org.umeframework.dora.type.ColumnDesc;
import org.umeframework.dora.validation.constraints.NotEmpty;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import org.umeframework.dora.type.TableDesc;
import javax.persistence.Id;
import org.umeframework.dora.bean.BeanUtil;
import org.umeframework.dora.service.TableObject;

/**
 * Entity class map to table "唱片曲目信息表"
 *
 * @author ume-team
 */
@Entity
@Table(name="ALBUM_TRACK")
@TableDesc(label="唱片曲目信息表")
public class AlbumTrackDto extends TableObject implements Serializable {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 所属唱片 
    */
    @NotEmpty
    @Id
    @ColumnDesc(index=1, type="INT", label="所属唱片")
    @Column(name="ALBUM_ID", nullable=false)
    private Long albumId;

   /**
    * 曲目编号 
    */
    @NotEmpty
    @Id
    @ColumnDesc(index=2, type="INT", label="曲目编号")
    @Column(name="TRACK_NO", nullable=false)
    private Integer trackNo;

   /**
    * 曲目名称 
    */
    @NotEmpty
    @Size(max=128)
    @ColumnDesc(index=3, type="VARCHAR", label="曲目名称")
    @Column(name="TRACK_NAME", nullable=false, length=128)
    private String trackName;

   /**
    * 播放时间 
    */
    @Size(max=4, precision=2)
    @ColumnDesc(index=4, type="DECIMAL", label="播放时间")
    @Column(name="PLAY_TIME", nullable=true, length=4, scale=4, precision=2)
    private Double playTime;

   /**
    * Create Author (default setting while insert)
    */
    @ColumnDesc(index=(4 + 1), type="VARCHAR", label="createAuthor")
    @Column(name="CREATE_AUTHOR", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(4 + 2), type="TIMESTAMP", label="createDatetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @ColumnDesc(index=(4 + 3), type="VARCHAR", label="updateAuthor")
    @Column(name="UPDATE_AUTHOR", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(4 + 4), type="TIMESTAMP", label="updateDatetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;
    /**
     *　Get the "所属唱片"
     */
    public Long getAlbumId() {
        return this.albumId;
    }
    /**
     *　Set the "所属唱片"
     */
    public void setAlbumId(
            Long albumId) {
        this.albumId = albumId;
    }

    /**
     *　Get the "曲目编号"
     */
    public Integer getTrackNo() {
        return this.trackNo;
    }
    /**
     *　Set the "曲目编号"
     */
    public void setTrackNo(
            Integer trackNo) {
        this.trackNo = trackNo;
    }

    /**
     *　Get the "曲目名称"
     */
    public String getTrackName() {
        return this.trackName;
    }
    /**
     *　Set the "曲目名称"
     */
    public void setTrackName(
            String trackName) {
        this.trackName = trackName;
    }

    /**
     *　Get the "播放时间"
     */
    public Double getPlayTime() {
        return this.playTime;
    }
    /**
     *　Set the "播放时间"
     */
    public void setPlayTime(
            Double playTime) {
        this.playTime = playTime;
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
     * Create bean instance copy with selected properties
     * 
     * @param selectProperties
     *            - properties which copy to new instance
     * @return
     */
    public AlbumTrackDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        AlbumTrackDto newInstance = new AlbumTrackDto();
        for (Property property : selectProperties) {
            String name = property.toString();
            Object value = BeanUtil.getBeanProperty(this, name);
            BeanUtil.setBeanProperty(newInstance, name, value);
        }
        return newInstance;
    }
    
    /**
     * Constant declare: SQL ID in config file
     */
    public static class SQLID {
        public static final String INSERT = "org.umeframework.quickstart.sample.entity.ALBUM_TRACK_INSERT";
        public static final String UPDATE = "org.umeframework.quickstart.sample.entity.ALBUM_TRACK_UPDATE";
        public static final String UPDATE_FULLY = "org.umeframework.quickstart.sample.entity.ALBUM_TRACK_UPDATE_FULLY";
        public static final String UPDATE_ANY = "org.umeframework.quickstart.sample.entity.ALBUM_TRACK_UPDATE_ANY";
        public static final String DELETE = "org.umeframework.quickstart.sample.entity.ALBUM_TRACK_DELETE";
        public static final String FIND = "org.umeframework.quickstart.sample.entity.ALBUM_TRACK_FIND";
        public static final String FIND_FOR_UPDATE = "org.umeframework.quickstart.sample.entity.ALBUM_TRACK_FIND_FOR_UPDATE";
        public static final String FIND_LIST = "org.umeframework.quickstart.sample.entity.ALBUM_TRACK_FIND_LIST";
        public static final String FIND_LIST_LIKE = "org.umeframework.quickstart.sample.entity.ALBUM_TRACK_FIND_LIST_LIKE";
        public static final String COUNT = "org.umeframework.quickstart.sample.entity.ALBUM_TRACK_COUNT";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String albumId = "albumId";
        public static final String trackNo = "trackNo";
        public static final String trackName = "trackName";
        public static final String playTime = "playTime";
        public static final String createAuthor = "createAuthor";
        public static final String createDatetime = "createDatetime";
        public static final String updateAuthor = "updateAuthor";
        public static final String updateDatetime = "updateDatetime";
    }
    
    /**
     * Constant declare: column name map with bean property.<br>
     */
    public static class ColumnName {
        public static final String ALBUM_ID = "ALBUM_ID";
        public static final String TRACK_NO = "TRACK_NO";
        public static final String TRACK_NAME = "TRACK_NAME";
        public static final String PLAY_TIME = "PLAY_TIME";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "ALBUM_TRACK";

}
