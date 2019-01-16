package com.example.config;

import com.example.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:
 * Function:
 * date: 2019年01月08日
 *
 * @author 许嘉阳
 */
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {
}
