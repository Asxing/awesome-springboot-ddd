package com.holddie.usercenter.web.rest;

import com.google.gson.Gson;
import com.holddie.framework.bean.response.ResultPage;
import com.holddie.framework.bean.response.ResultUtil;
import com.holddie.usercenter.service.PermissionService;
import com.holddie.usercenter.service.dto.pon.PonPermission;
import com.holddie.usercenter.service.dto.req.ReqPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

/**
 * @author HoldDie
 * @date 2019-06-26 20:39
 * @vsersion 1.0
 **/
@RestController
@RequestMapping("api")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @PostMapping("permission")
    public void save(@RequestBody ReqPermission reqPermission) {
        System.out.println(new Gson().toJson(reqPermission));
        permissionService.save(reqPermission);
    }

    @GetMapping("permission")
    public ResultPage<PonPermission> getPermission(@RequestParam(value = "currentPage", defaultValue = "1", required = false) Integer currentPage, @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        Pageable pageable = PageRequest.of(currentPage - 1, pageSize, Sort.by("id").descending());
        return ResultUtil.genOkResultPage(permissionService.fetchPermissions(pageable));
    }

    @DeleteMapping("permission/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        permissionService.deleteById(id);
    }

}
