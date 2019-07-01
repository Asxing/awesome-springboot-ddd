package com.holddie.usercenter.service.mapper;

import com.holddie.framework.domain.mapper.Boolean10Mapper;
import com.holddie.usercenter.domain.Permission;
import com.holddie.usercenter.service.dto.pon.PonPermission;
import com.holddie.usercenter.service.mapper.decorator.PermissionDecorator;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * 对接 Mapper
 *
 * @author HoldDie
 * @date 2019-06-28 17:50
 * @vsersion 1.0
 **/
@Mapper(componentModel = "spring", uses = {Boolean10Mapper.class})
@DecoratedWith(value = PermissionDecorator.class)
public interface PermissionMapper {

    @Mappings({
            @Mapping(source = "menu.id", target = "menuId"),
            @Mapping(target = "moudelPath", ignore = true)
    })
    PonPermission permissionToPonPermission(Permission permission);

    List<PonPermission> permissionsToPonPermissions(List<Permission> permissions);
}
