package com.course.system.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author V丶x
 * @Date: 2020-05-06 13:44
 * @Email: 1114005726@qq.com
 **/
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "success";
    }

}
