package com.holddie.usercenter.web.rest;


import com.alibaba.fastjson.JSON;
import com.holddie.framework.bean.BaseController;
import com.holddie.framework.bean.response.Result;
import com.holddie.framework.bean.response.ResultUtil;
import com.holddie.framework.error.BadRequestAlertException;
import com.holddie.usercenter.domain.User;
import com.holddie.usercenter.repository.UserRepository;
import com.holddie.usercenter.security.jwt.JWTFilter;
import com.holddie.usercenter.security.jwt.TokenProvider;
import com.holddie.usercenter.service.UserDetailService;
import com.holddie.usercenter.web.rest.vm.LoginVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller to authenticate users.
 */
@RestController
@RequestMapping("/api")
public class UserJWTController extends BaseController {

    @Autowired
    private TokenProvider tokenProvider;
    @Autowired
    private UserDetailService userDetailService;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("login")
    public Result authorize(@RequestBody LoginVM loginVM) {
//        User dbUser = userRepository.findFirstByUserName(loginVM.getUserName()).orElseThrow(() -> new BadRequestAlertException("用户不存在"));
//        if (!this.userDetailService.verifyPassword(loginVM.getPassword(), dbUser.getPassword())) {
//            return ResultUtil.genFailedResult("用户名密码错误");
//        }
//        Authentication authentication = userDetailService.getUserAuthentication(dbUser);

        /*************** test kata start *********************/
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        if (loginVM.getUserName().startsWith("admin")) {
            authorities.add(new SimpleGrantedAuthority("admin"));
//            authorities.add(new SimpleGrantedAuthority("admin2"));
//            authorities.add(new SimpleGrantedAuthority("admin3"));
//            authorities.add(new SimpleGrantedAuthority("admin4"));
//            authorities.add(new SimpleGrantedAuthority("admin5"));
        } else if (loginVM.getUserName().startsWith("user")) {
            authorities.add(new SimpleGrantedAuthority("user"));
        } else {
            authorities.add(new SimpleGrantedAuthority("guest"));
        }
        Authentication authentication = new UsernamePasswordAuthenticationToken(
                new org.springframework.security.core.userdetails.User(
                        loginVM.getUserName(),
                        loginVM.getPassword(),
                        authorities
                ),
                null,
                authorities);
        /************* test kata end *******************/
        SecurityContextHolder.getContext().setAuthentication(authentication);
        boolean rememberMe = (loginVM.isRememberMe() == null) ? Boolean.FALSE : loginVM.isRememberMe();
        String jwt = tokenProvider.createToken(authentication, rememberMe);
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        servletRequestAttributes.getResponse().setHeader(JWTFilter.AUTHORIZATION_HEADER, "Bearer " + jwt);
        return ResultUtil.genOkObjectResult(jwt);
    }

    @GetMapping("currentUser")
    public Object getCurrentUser() {
        return JSON.parse("{\n" +
                "    name: 'Serati Ma',\n" +
                "    avatar: 'https://gw.alipayobjects.com/zos/antfincdn/XAosXuNZyF/BiazfanxmamNRoxxVxka.png',\n" +
                "    userid: '00000001',\n" +
                "    email: 'antdesign@alipay.com',\n" +
                "    signature: '海纳百川，有容乃大',\n" +
                "    title: '交互专家',\n" +
                "    group: '蚂蚁金服－某某某事业群－某某平台部－某某技术部－UED',\n" +
                "    tags: [\n" +
                "      {\n" +
                "        key: '0',\n" +
                "        label: '很有想法的',\n" +
                "      },\n" +
                "      {\n" +
                "        key: '1',\n" +
                "        label: '专注设计',\n" +
                "      },\n" +
                "      {\n" +
                "        key: '2',\n" +
                "        label: '辣~',\n" +
                "      },\n" +
                "      {\n" +
                "        key: '3',\n" +
                "        label: '大长腿',\n" +
                "      },\n" +
                "      {\n" +
                "        key: '4',\n" +
                "        label: '川妹子',\n" +
                "      },\n" +
                "      {\n" +
                "        key: '5',\n" +
                "        label: '海纳百川',\n" +
                "      },\n" +
                "    ],\n" +
                "    notifyCount: 12,\n" +
                "    unreadCount: 11,\n" +
                "    country: 'China',\n" +
                "    geographic: {\n" +
                "      province: {\n" +
                "        label: '浙江省',\n" +
                "        key: '330000',\n" +
                "      },\n" +
                "      city: {\n" +
                "        label: '杭州市',\n" +
                "        key: '330100',\n" +
                "      },\n" +
                "    },\n" +
                "    address: '西湖区工专路 77 号',\n" +
                "    phone: '0752-268888888',\n" +
                "  }");
    }
}
