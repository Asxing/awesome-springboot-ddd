package com.holddie.usercenter.service.mapper.decorator;

import com.holddie.usercenter.domain.Menu;
import com.holddie.usercenter.domain.Permission;
import com.holddie.usercenter.repository.MenuRepository;
import com.holddie.usercenter.service.dto.pon.PonPermission;
import com.holddie.usercenter.service.mapper.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author HoldDie
 * @date 2019-06-28 19:09
 * @vsersion 1.0
 **/
public abstract class PermissionDecorator implements PermissionMapper {

    @Autowired
    @Qualifier("delegate")
    private PermissionMapper delegate;

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public PonPermission permissionToPonPermission(Permission permission) {
        PonPermission ponPermission = this.delegate.permissionToPonPermission(permission);
        StringBuilder moudelPath = new StringBuilder();
        permission.getMoudelValue().forEach(s -> moudelPath.append(menuRepository.findById(Long.valueOf(s)).get().getTitle()).append("/"));
        ponPermission.setMoudelPath(moudelPath.substring(0, moudelPath.length() - 1));
        return ponPermission;
    }

    @Override
    public List<PonPermission> permissionsToPonPermissions(List<Permission> permissions) {
        return permissions.stream().map(this::permissionToPonPermission).collect(Collectors.toList());
    }
}
