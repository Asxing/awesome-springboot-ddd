package com.holddie.usercenter.web.rest.vm;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * View Model object for storing a user's credentials.
 */
public class LoginVM {

    @ApiModelProperty("用户名")
    @Size(min = 1, max = 50)
    private String userName;

    @ApiModelProperty("密码")
    @NotNull(message = "密码不可以为空")
    @Size(min = 4, max = 100)
    private String password;

    @ApiModelProperty("邮箱")
    @Email
    @Size(min = 5, max = 254)
    private String email;

    private Boolean rememberMe;
    @ApiModelProperty("用户类型")
    private String type;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", rememberMe=" + rememberMe +
                ", type='" + type + '\'' +
                '}';
    }
}
