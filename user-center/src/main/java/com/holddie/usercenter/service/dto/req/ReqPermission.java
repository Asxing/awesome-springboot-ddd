package com.holddie.usercenter.service.dto.req;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * @author HoldDie
 * @date 2019-06-27 18:23
 * @vsersion 1.0
 **/
@Data
@ApiModel
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReqPermission {
    private Long id;
    private String title;
    private String code;
    private String description;
    private Boolean status;
    private ArrayList<String> moudelValue;
}
