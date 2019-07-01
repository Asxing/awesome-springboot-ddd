package com.holddie.usercenter.service.dto.pon;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * @author HoldDie
 * @date 2019-06-28 17:30
 * @vsersion 1.0
 **/
@Data
@ApiModel("权限返回")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PonPermission {

    /**
     * Id
     */
    private Long id;

    /**
     * 功能名称
     */
    private String title;

    /**
     * 功能编码
     */
    private String code;

    /**
     * 功能描述
     */
    private String description;

    /**
     * 对应菜单
     */
    private Long menuId;

    /**
     * 菜单状态
     */
    private Integer status;

    private ArrayList<String> moudelValue;

    private String moudelPath;

}
