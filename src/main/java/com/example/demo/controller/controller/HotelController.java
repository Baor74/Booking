package com.example.demo.controller.controller;

import com.example.demo.controller.api.KhachSanAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private KhachSanAPI khachSanAPI;

    @GetMapping("/list")
    public String listHotel(@RequestParam("thanhPho") String thanhPho,
                            @RequestParam("soPhong") int soPhong,
                            @RequestParam("soNguoiLon") int soNguoiLon,
                            @RequestParam("soTreEm") int soTreEm,
                            Model model){
        model.addAttribute("thanhPho", thanhPho);
        model.addAttribute("soPhong", soPhong);
        model.addAttribute("soNguoiLon", soNguoiLon);
        model.addAttribute("soTreEm", soTreEm);
        System.out.println(thanhPho);

        return "hotel";
    }
    @GetMapping("/detail")
    public String detailHotel(){
        return "detail";
    }
}
