package com.zhy.auth.application.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (AuthPermission)实体类
 *
 * @author makejava
 * @since 2024-01-22 10:20:50
 */
@Data
public class AuthPermissionDTO implements Serializable {
    private Long id;
    
    private String name;
    
    private Long parentId;
    
    private Integer type;
    
    private String menuUrl;
    
    private Integer status;
    
    private Integer show;
    
    private String icon;
    
    private String permissionKey;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getShow() {
        return show;
    }

    public void setShow(Integer show) {
        this.show = show;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPermissionKey() {
        return permissionKey;
    }

    public void setPermissionKey(String permissionKey) {
        this.permissionKey = permissionKey;
    }
}