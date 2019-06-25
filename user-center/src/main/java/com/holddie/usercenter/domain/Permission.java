package com.holddie.usercenter.domain;

import com.holddie.framework.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

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

    @NotNull
    @Size(max = 50)
    @Column(length = 50)
    private String name;

    @NotNull
    @Size(max = 100)
    @Column(length = 100)
    private String code;

    @NotNull
    @Size(max = 255)
    private String menuRelation;

    @NotNull
    @Size(max = 255)
    private String description;
}
