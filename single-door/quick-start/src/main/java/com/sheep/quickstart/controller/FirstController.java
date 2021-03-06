package com.sheep.quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyangSheep
 * @ClassName FirstController.java
 * @Description Spring Security第一步体验
 * @createTime 2021年05月09日 16:09
 */
@RestController
@RequestMapping("/test")
public class FirstController {

    @GetMapping("hello")
    public String hello() {
        return "Hello Security!";
    }
}
