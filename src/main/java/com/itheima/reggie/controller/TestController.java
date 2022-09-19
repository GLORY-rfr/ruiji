package com.itheima.reggie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/test",produces = "text/plain;charset=UTF-8")
    public String test() {
        return "小芙蓉";
    }
}
