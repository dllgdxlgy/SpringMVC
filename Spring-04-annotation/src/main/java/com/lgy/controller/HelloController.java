package com.lgy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//如果是使用 @RestController 注解这就是返回的字符串，并不会进行视图解析。

@Controller
public class HelloController {


    @RequestMapping("/hello")
    public String hello(Model model){

        //封装数据
        model.addAttribute("mso", "这是基于注解的SpringMVC");
        //hello这个字符串会被试图解析器进行处理
        return "hello";
    }


}
