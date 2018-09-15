package com.experts.core.biller.statemachine.api.activemq.standers.dto;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class MenuItemWrapper implements Serializable {

    private static final long serialVersionUID = -3079998076992259811L;

    private Long id;
    private String text;
    private MenuItemState state;
    private Long parentId;
    private BipPage bipPage;
    private Short order;
    private boolean isActive;
    private boolean isPage;
    private String iconClass;

    private boolean isReadable;
    private boolean isReadWriteable;

    private List<MenuItemWrapper> children = new ArrayList<>();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MenuItemState getState() {
        return state;
    }

    public void setState(MenuItemState state) {
        this.state = state;
    }

    public List<MenuItemWrapper> getChildren() {
        return children;
    }

    public void setChildren(List<MenuItemWrapper> children) {
        this.children = children;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public BipPage getBipPage() {
        return bipPage;
    }

    public void setBipPage(BipPage bipPage) {
        this.bipPage = bipPage;
    }

    public Short getOrder() {
        return order;
    }

    public void setOrder(Short order) {
        this.order = order;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isPage() {
        return isPage;
    }

    public void setPage(boolean page) {
        isPage = page;
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

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }
}
