package com.holddie.usercenter.service.dto.req;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author HoldDie
 * @date 2019-06-25 21:30
 * @vsersion 1.0
 **/
@Data
@ApiModel
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReqMenu {
    private Long id;
    private Long parentId;
    private String title;
    private String path;
    private String authority;
    private Integer sort;
    private Boolean hideInMenu;
    private String icon;
}
