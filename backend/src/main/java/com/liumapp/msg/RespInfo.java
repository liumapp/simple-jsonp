package com.liumapp.msg;

/**
 * Created by liumapp on 11/7/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class RespInfo {

    private Integer status;

    private String content;

    private String message;

    public RespInfo() {
    }

    public RespInfo(Integer status, String content, String message) {
        this.status = status;
        this.content = content;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
