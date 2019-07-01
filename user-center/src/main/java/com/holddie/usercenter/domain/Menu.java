package com.holddie.usercenter.domain;

import com.holddie.framework.bean.BaseEntity;
import com.holddie.framework.domain.converter.StringListConverter;
import com.holddie.usercenter.service.dto.req.ReqMenu;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 菜单
 *
 * @author HoldDie
 * @date 2019-06-25 18:01
 * @vsersion 1.0
 **/
@Data
@Entity
@Table(name = "center_menu")
@EqualsAndHashCode(callSuper = true)
public class Menu extends BaseEntity implements Serializable {
    /**
     * 父类 Id
     */
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "parentId")
    private Menu parentMenu;
    /**
     * 菜单名称
     */
    private String title;
    /**
     * 图标
     */
    private String icon;
    /**
     * 是否隐藏
     */
    private Boolean hideInMenu;
    /**
     * 菜单排序
     */
    private Integer sort;
    /**
     * 菜单路径
     */
    private String path;
    /**
     * 对应角色权限
     */
    @Convert(converter = StringListConverter.class)
    private List<String> authority;
    /**
     * 对应子集
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "parentMenu")
    private List<Menu> childrenMenus = new ArrayList<>();

    public Menu() {
    }

    public Menu(Long id) {
        this.id = id;
    }

    public static Menu of(ReqMenu reqMenu, Menu parentMenu) {
        Menu menu = new Menu();
        menu.setParentMenu(parentMenu);
        menu.setTitle(reqMenu.getTitle());
        menu.setPath(reqMenu.getPath());
        menu.setAuthority(Arrays.asList(reqMenu.getAuthority().split(",")));
        menu.setSort(reqMenu.getSort());
        menu.setHideInMenu(reqMenu.getHideInMenu());
        menu.setIcon(reqMenu.getIcon());
        return menu;
    }

    public boolean hasChildren() {
        return !this.childrenMenus.isEmpty();
    }

    public void updateOfReqMenu(ReqMenu reqMenu) {
        this.title = reqMenu.getTitle();
        this.path = reqMenu.getPath();
        this.authority = Arrays.asList(reqMenu.getAuthority().split(","));
        this.sort = reqMenu.getSort();
        this.hideInMenu = reqMenu.getHideInMenu();
        this.icon = reqMenu.getIcon();
    }
}
