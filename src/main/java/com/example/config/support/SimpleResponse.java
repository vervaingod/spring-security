package com.example.config.support;

/**
 * ClassName:
 * Function:
 * date: 2019年01月08日
 *
 * @author 许嘉阳
 */
public class SimpleResponse {

    private Object content;

    public SimpleResponse(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
