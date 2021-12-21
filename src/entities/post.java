package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class post {

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<comment> commentList = new ArrayList<>();

    public post(){

    }

    public post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<comment> getCommentList() {
        return commentList;
    }

    public void addComment(comment comment){
        commentList.add(comment);
    }

    public void removeComment(comment comment){
        commentList.remove(comment);
    }
}
