package liu.hope.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Hope
 * @version 1.0
 * TODO:
 * @createTime 2018/12/15 20:18
 */
public class Notice implements Serializable {

    private Integer id;
    private String title;
    private String img;
    private String content;
    private String author;
    private Integer inserter;
    private Date insertTime;
    private String updater;
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getInserter() {
        return inserter;
    }

    public void setInserter(Integer inserter) {
        this.inserter = inserter;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Notice() {
    }

    public Notice(Integer id, String title, String img, String content, String author, Integer inserter, Date insertTime, String updater, Date updateTime) {
        this.id = id;
        this.title = title;
        this.img = img;
        this.content = content;
        this.author = author;
        this.inserter = inserter;
        this.insertTime = insertTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", inserter=" + inserter +
                ", insertTime=" + insertTime +
                ", updater='" + updater + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
