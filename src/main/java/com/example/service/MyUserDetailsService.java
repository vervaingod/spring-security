package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * ClassName:
 * Function:
 * date: 2019年01月07日
 *
 * @author 许嘉阳
 */
//@Component
//public class MyUserDetailsService implements UserDetailsService {
//    private Logger logger = LoggerFactory.getLogger(getClass());
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        String password = passwordEncoder.encode("123456");
//        logger.info("password: {}", password);
//        // 封装用户信息，并返回。参数分别是：用户名，密码，用户权限 设置角色为Admin
//        User user = new User(username, password, true, true, true, true,
//                AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_Admin"));
//        return user;
//    }
//}