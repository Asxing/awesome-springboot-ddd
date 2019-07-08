package com.holddie.usercenter.web.rest;

import com.holddie.usercenter.service.dto.req.ReqAuthority;
import org.springframework.web.bind.annotation.*;

/**
 * 角色控制器
 *
 * @author HoldDie
 * @date 2019-07-01 20:06
 * @vsersion 1.0
 **/
@RestController
@RequestMapping("api/authority")
public class AuthorityController {

    @PostMapping
    public void save(@RequestBody ReqAuthority reqAuthority) {

    }

    @GetMapping
    public void fetch() {

    }

}
