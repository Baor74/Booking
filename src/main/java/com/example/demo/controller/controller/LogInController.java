package com.example.demo.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogInController {

    @GetMapping("/FormDangKi")
    public String index(Model model) {
        return "FormDangKi";
    }
    @GetMapping("/FormDangNhap")
    public String indexs(Model model) {
        return "FormDangNhap";
    }
    
}