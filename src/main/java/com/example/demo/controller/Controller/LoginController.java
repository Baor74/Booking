package com.example.demo.controller.Controller;

import com.example.demo.controller.Entity.KhachHang;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.controller.Utils.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.controller.Responsitory.KhachHangRepo;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class LoginController {
    //Thư
    @Autowired
    KhachHangRepo khachHangRepo;

    @Autowired
    SessionService session;

    @GetMapping("/sign-in")
    public String signin() {
        return "account/DangNhap";
    }
    @PostMapping("/sign-in")
    public String signin_signin(Model model) {
        return "account/DangNhap";
    }

    @GetMapping("/sign-up")
    public String signup(Model model, @ModelAttribute("account") KhachHang khachHang) {
        return "account/DangKy";
    }

    @PostMapping("/sign-up")
    public String signup_signup(Model model, @Validated @ModelAttribute("account") KhachHang khachHang) {

        return "account/DangKy";
    }
    
}