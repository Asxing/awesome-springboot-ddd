package com.holddie.usercenter.service;

import com.holddie.usercenter.domain.Menu;
import com.holddie.usercenter.domain.Permission;
import com.holddie.usercenter.repository.PermissionRepository;
import com.holddie.usercenter.service.dto.pon.PonPermission;
import com.holddie.usercenter.service.dto.req.ReqPermission;
import com.holddie.usercenter.service.mapper.PermissionMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @author HoldDie
 * @date 2019-06-27 18:27
 * @vsersion 1.0
 **/
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class PermissionService {

    @Autowired
    private MenuService menuService;

    @Autowired
    private PermissionRepository permissionRepository;

    @Autowired
    private PermissionMapper permissionMapper;

    /**
     * 保存权限资源
     *
     * @param reqPermission 请求资源
     * @date 2019-06-27  18:29
     * @author holddie
     */
    public void save(ReqPermission reqPermission) {
        Menu menu = menuService.getMenuById(Long.valueOf(reqPermission.getMoudelValue().get(reqPermission.getMoudelValue().size() - 1)));
        Permission permission;
        if (Objects.nonNull(reqPermission.getId())) {
            Optional<Permission> optionalPermission = permissionRepository.findById(reqPermission.getId());
            if (optionalPermission.isPresent()) {
                permission = optionalPermission.get();
                permission.update(reqPermission, menu);
            } else {
                permission = Permission.of(reqPermission, menu);
            }
        } else {
            permission = Permission.of(reqPermission, menu);
        }
        assert permission != null;
        permissionRepository.save(permission);
    }

    /**
     * 获取权限资源分类
     *
     * @param pageable 分页组件
     * @date 2019-06-27  20:54
     * @author holddie
     */
    public Page<PonPermission> fetchPermissions(Pageable pageable) {
        Page<Permission> permissionPage = permissionRepository.findAll(pageable);
        List<PonPermission> ponPermissions = permissionMapper.permissionsToPonPermissions(permissionPage.getContent());
        assert ponPermissions != null;
        return new PageImpl<>(ponPermissions, pageable, permissionPage.getTotalElements());
    }
}
