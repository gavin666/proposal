package com.insiap.webapp.domain;

/**
 * Created by Gavin on 2017/2/23.
 */
public class Msg {
    private String title;
    private String content;
    private String extraInfo;
    public Msg(String title,String content,String extraInfo){
        super();
        this.content =content;
        this.extraInfo = extraInfo;
        this.title = title;
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

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }
}
