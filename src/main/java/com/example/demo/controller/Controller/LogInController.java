package com.example.demo.controller.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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