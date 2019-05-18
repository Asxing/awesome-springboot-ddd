package com.holddie.usercenter.web.rest.vm;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * View Model object for storing a user's credentials.
 */
public class LoginVM {

    @ApiModelProperty("邮箱")
    @NotNull(message = "用户名不可以为空")
    @Size(min = 1, max = 50)
    private String username;

    @ApiModelProperty("邮箱")
    @NotNull(message = "密码不可以为空")
    @Size(min = 4, max = 100)
    private String password;

    @ApiModelProperty("邮箱")
    @NotEmpty(message = "邮箱不能为空")
    @Email
    @Size(min = 5, max = 254)
    private String email;

    private Boolean rememberMe;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    @Override
    public String toString() {
        return "LoginVM{" +
            "username='" + username + '\'' +
            ", rememberMe=" + rememberMe +
            '}';
    }
}
