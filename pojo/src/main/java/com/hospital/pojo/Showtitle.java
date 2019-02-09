package com.hospital.pojo;

import java.io.Serializable;

public class Showtitle implements Serializable {
    private String titleId;

    private String title;

    private String titleUrl;

    private String showInfo;

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId == null ? null : titleId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTitleUrl() {
        return titleUrl;
    }

    public void setTitleUrl(String titleUrl) {
        this.titleUrl = titleUrl == null ? null : titleUrl.trim();
    }

    public String getShowInfo() {
        return showInfo;
    }

    public void setShowInfo(String showInfo) {
        this.showInfo = showInfo == null ? null : showInfo.trim();
    }
}