package com.hq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 黄强
 * @date 2021/4/9 - 11:25
 */

@Controller

@RequestMapping("/hello/")
public class HelloController {

    public String testHello(){

        return "Hello SpringBoot";
    }
}
