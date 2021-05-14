package com.hq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 演示使用 thymeleaf 模板引擎的功能
 *
 * @author 黄强
 * @date 2021/5/4 - 22:29
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    /**
     * 方法功能：演示 thymeleaf 模板引擎 中的 ${key} 功能 。
     * ${key} : 将请求域中的key值对应的value值替换占位符。
     */
    @RequestMapping("/dollarSign")
    public String dollarSign(Map<String, Object> map){

        // 1. 在方法形参中传递一个Map集合，方法参数列表默认被springMVC存储到request域中。

        // 2. 创建需要传递的数据，并存储到map集合中。
        map.put("hello","hello world");

        return "thymeleaf01";
    }
}
