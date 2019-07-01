package com.holddie.usercenter.service.dto.pon;

import com.holddie.usercenter.domain.Menu;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author HoldDie
 * @date 2019-06-25 20:11
 * @vsersion 1.0
 **/
@Data
@ApiModel
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PonMenu {

    private Long id;
    private Long parentId;
    private String title;
    private String path;
    private String icon;
    private Boolean hideInMenu;
    private Integer sort;
    private List<String> authority;
    private List<PonMenu> children = new ArrayList<>();

    public static PonMenu of(Menu menu, List<PonMenu> childes) {
        PonMenu ponMenu = new PonMenu();
        ponMenu.setId(menu.getId());
        ponMenu.setParentId(menu.getParentMenu().getId());
        ponMenu.setTitle(menu.getTitle());
        ponMenu.setPath(menu.getPath());
        ponMenu.setIcon(menu.getIcon());
        ponMenu.setHideInMenu(menu.getHideInMenu());
        ponMenu.setSort(menu.getSort());
        ponMenu.setAuthority(menu.getAuthority());
        ponMenu.setChildren(childes);
        return ponMenu;
    }
}
