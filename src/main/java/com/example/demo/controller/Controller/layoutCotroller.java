package com.example.demo.controller.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layout")
public class layoutCotroller {
    @GetMapping("/index")
    public String layout(){
        return "home";
    }
    @GetMapping("/detail")
    public  String detail(){
        return "khachsan-details";
    }
    @GetMapping("/hoatdong")
    public  String hoatdong(){
        return "hoatdong";
    }
}
