package com.experts.core.biller.statemachine.api.activemq.standers.dto;

import java.io.Serializable;

public class BipPage implements Serializable {

    private static final long serialVersionUID = -8002557044976473549L;

    private Long id;
    private String pageName;
    private String pageUrl;

    // manual code
    private boolean isAdminPage;
    private boolean isReadable;
    private boolean isReadWriteable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName == null ? null : pageName.trim();
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl == null ? null : pageUrl.trim();
    }

    public boolean isAdminPage() {
        return isAdminPage;
    }

    public void setAdminPage(boolean adminPage) {
        isAdminPage = adminPage;
    }

    public boolean isReadable() {
        return isReadable;
    }

    public void setReadable(boolean readable) {
        isReadable = readable;
    }

    public boolean isReadWriteable() {
        return isReadWriteable;
    }

    public void setReadWriteable(boolean readWriteable) {
        isReadWriteable = readWriteable;
    }
}