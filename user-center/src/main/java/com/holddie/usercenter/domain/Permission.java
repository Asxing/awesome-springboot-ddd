package com.holddie.usercenter.domain;

import com.holddie.framework.bean.BaseEntity;
import com.holddie.usercenter.service.dto.req.ReqPermission;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * 功能表
 *
 * @author HoldDie
 * @version 1.0
 * @date 2019-05-20 08:15
 **/
@Data
@Entity
@Table(name = "center_permission")
@EqualsAndHashCode(callSuper = true)
public class Permission extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -2893941222399748328L;

    /**
     * 功能名称
     */
    @Size(max = 50)
    @Column(length = 50)
    private String title;

    /**
     * 功能编码
     */
    @Size(max = 100)
    @Column(length = 100)
    private String code;

    /**
     * 功能描述
     */
    @Size(max = 255)
    private String description;

    /**
     * 对应菜单
     */
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Menu menu;

    /**
     * 菜单状态
     */
    @Column(nullable = false)
    private Boolean status;

    private ArrayList<String> moudelValue;

    public static Permission of(ReqPermission reqPermission, Menu menu) {
        Permission permission = new Permission();
        permission.setTitle(reqPermission.getTitle());
        permission.setCode(reqPermission.getCode());
        permission.setDescription(reqPermission.getDescription());
        permission.setStatus(reqPermission.getStatus());
        permission.setMoudelValue(reqPermission.getMoudelValue());
        permission.setMenu(menu);
        return permission;
    }

    public void update(ReqPermission reqPermission, Menu menu) {
        this.setTitle(reqPermission.getTitle());
        this.setCode(reqPermission.getCode());
        this.setDescription(reqPermission.getDescription());
        this.setStatus(reqPermission.getStatus());
        this.setMoudelValue(reqPermission.getMoudelValue());
        this.setMenu(menu);
    }
}
