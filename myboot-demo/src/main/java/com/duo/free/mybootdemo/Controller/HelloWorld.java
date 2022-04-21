package com.duo.free.mybootdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
    @ResponseBody
    @RequestMapping("/helloWorld")
    public String HelloWorld(){
        return "HELLO WORLD";
    }
}
