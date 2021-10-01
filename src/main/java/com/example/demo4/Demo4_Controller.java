package com.example.demo4;

import org.springframework.web.bind.annotation.GetMapping;

public class Demo4_Controller {
    @GetMapping(value="")
    private String hello(){
        return "/index.html";
    }

}
