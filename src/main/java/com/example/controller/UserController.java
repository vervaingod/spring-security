package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:
 * Function:
 * date: 2019年01月07日
 *
 * @author 许嘉阳
 */
@RestController
public class UserController {

    @RequestMapping(value = "/user")
    String index() {
        return "Hello Spring Boot";
    }
}
