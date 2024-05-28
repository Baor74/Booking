package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogInController {

    @RequestMapping("/FormDangKi")
    public String index(Model model) {
        return "FormDangKi";
    }
    @RequestMapping("/FormDangNhap")
    public String indexs(Model model) {
        return "FormDangNhap";
    }
    
}