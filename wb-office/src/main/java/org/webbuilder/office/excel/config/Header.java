package org.webbuilder.office.excel.config;

/**
 * Created by 浩 on 2015-12-07 0007.
 */
public class Header {
    private String title;

    private String field;

    public Header() {
    }

    public Header(String title, String field) {
        this.title = title;
        this.field = field;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
