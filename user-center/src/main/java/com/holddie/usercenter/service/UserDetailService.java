package com.holddie.usercenter.service;

import com.holddie.usercenter.domain.User;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户登录
 *
 * @author HoldDie
 * @date 2019-05-21 16:50
 * @vsersion 1.0
 **/
@Service
public class UserDetailService {

    /**
     * 获取用户对应权限
     *
     * @param user 用户
     * @return 权限集合
     * @date 2019-05-21  16:57
     * @author holddie
     */
    public Authentication getUserAuthentication(User user) {

        // 权限
        final List<SimpleGrantedAuthority> authorities =
                user.getPermissionCodeList().stream()
                        .map(SimpleGrantedAuthority::new)
                        .collect(Collectors.toList());
        // 角色
        authorities.addAll(
                user.getRoleCodeList().stream()
                        .map(SimpleGrantedAuthority::new)
                        .collect(Collectors.toList()));

        return new UsernamePasswordAuthenticationToken(
                new org.springframework.security.core.userdetails.User(
                        user.getUserName(),
                        user.getPassword(),
                        authorities
                ),
                null,
                authorities);
    }

    /**
     * 校验用户的密码
     *
     * @param loginPassword 登陆密码
     * @param dbPassword    数据库密码
     * @return 是否相等
     * @date 2019-05-21  17:16
     * @author holddie
     */
    public boolean verifyPassword(String loginPassword, String dbPassword) {
        return false;
    }
}
