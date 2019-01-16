package com.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ClassName:
 * Function:
 * date: 2019年01月08日
 *
 * @author 许嘉阳
 */
@ConfigurationProperties(prefix = "security")
public class SecurityProperties {

    private BrowserProperties browserProperties = new BrowserProperties();

    public BrowserProperties getBrowserProperties() {
        return browserProperties;
    }

    public void setBrowserProperties(BrowserProperties browserProperties) {
        this.browserProperties = browserProperties;
    }
}
