package com.example.properties;

/**
 * ClassName:
 * Function:
 * date: 2019年01月08日
 *
 * @author 许嘉阳
 */
public class BrowserProperties {

    private String loginPage = "/login.html";

    private LoginType loginType = LoginType.JSON;

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }



}
