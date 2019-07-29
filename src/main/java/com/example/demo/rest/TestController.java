package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这个是
 */
@RestController
@RequestMapping("hello")
public class TestController {

    @GetMapping("test")
    public String testHello() {

        return "我是成功搭建一个项目提供的接口！！！";
    }
}
