package com.holddie.usercenter.web.rest;

import com.holddie.usercenter.service.MenuService;
import com.holddie.usercenter.service.dto.pon.PonMenu;
import com.holddie.usercenter.service.dto.req.ReqMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 菜单资源
 *
 * @author HoldDie
 * @date 2019-06-25 20:08
 * @vsersion 1.0
 **/
@RestController
@RequestMapping("api")
public class MenuResource {

    @Autowired
    private MenuService menuService;

    @GetMapping("menu")
    public List<PonMenu> getAllMenus(){
        return menuService.getAllMenus();
    }

    @PutMapping("menu")
    public void saveMenu(@RequestBody ReqMenu reqMenu){
        menuService.saveMenu(reqMenu);
    }

}
