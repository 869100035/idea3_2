package com.hwua.servlet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(Map<String,Object> map){
        map.put("name","zhangsan");
        map.put("age",10);
        return "success";
    }
}
