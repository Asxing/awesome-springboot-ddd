package com.holddie.usercenter.service;

import com.holddie.usercenter.domain.Menu;
import com.holddie.usercenter.repository.MenuRepository;
import com.holddie.usercenter.service.dto.pon.PonMenu;
import com.holddie.usercenter.service.dto.req.ReqMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

/**
 * @author HoldDie
 * @date 2019-06-25 20:20
 * @vsersion 1.0
 **/
@Service
@Transactional(rollbackOn = Exception.class)
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    /**
     * 获取所有的菜单目录
     *
     * @date 2019-06-25  20:20
     * @author holddie
     */
    public List<PonMenu> getAllMenus() {
        List<Menu> menuList = menuRepository.findAllByParentMenu_IdOrderBySortAsc(0L);
        return getPonMenus(menuList);
    }

    /**
     * 递归获取菜单目录
     *
     * @param menuList 菜单列表
     * @date 2019-06-25  20:38
     * @author holddie
     */
    private List<PonMenu> getPonMenus(Collection<Menu> menuList) {
        List<PonMenu> ponMenus = new ArrayList<>();
        for (Menu menu : menuList) {
            List<PonMenu> childrens = new ArrayList<>();
            if (menu.hasChildren()) {
                childrens = getPonMenus(menuRepository.findAllByParentMenu_IdOrderBySortAsc(menu.getId()));
            }
            ponMenus.add(PonMenu.of(menu, childrens));
        }
        return ponMenus;
    }

    public void saveMenu(ReqMenu reqMenu) {
        Menu parentMenu = menuRepository.findById(reqMenu.getParentId()).get();
        Menu menu;
        if (Objects.nonNull(reqMenu.getId())) {
            Optional optional = menuRepository.findById(reqMenu.getId());
            if (optional.isPresent()) {
                menu = (Menu) optional.get();
                menu.updateOfReqMenu(reqMenu);
            } else {
                menu = Menu.of(reqMenu,parentMenu);
            }
        } else {
            menu = Menu.of(reqMenu,parentMenu);
        }
        assert menu != null;
        menuRepository.save(menu);

    }

    public Menu getMenuById(long menuId) {
        return menuRepository.findById(menuId).get();
    }
}
