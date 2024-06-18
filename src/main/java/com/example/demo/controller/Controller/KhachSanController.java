package com.example.demo.controller.Controller;

import com.example.demo.controller.Entity.KhachSan;
import com.example.demo.controller.Service.KhachSanService;
//import com.phong.test_api.entity.KhachSan;
//import com.phong.test_api.service.KhachSanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class KhachSanController {

    @Autowired
    private KhachSanService khachSanService;

    @GetMapping("/khachsan/{tenKhachSan}")
    public String viewKhachSanDetails(@PathVariable("tenKhachSan") String tenKhachSan, Model model) {
        Optional<KhachSan> khachSan = khachSanService.getKhachSanByTenKhachSan(tenKhachSan);
        if (khachSan.isPresent()) {
            model.addAttribute("khachSan", khachSan.get());
            return "khachsan-details";
        } else {
            return "redirect:/error";
        }
    }
}
