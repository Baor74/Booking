package com.example.demo.controller.Controller;

import com.example.demo.controller.Utils.SessionService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.controller.Responsitory.KhachSanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class HomeController {
  //phong
  @Autowired
  KhachSanRepo khachSanRepo;

  @Autowired
  SessionService session;

  @RequestMapping("/index")
  public String index() {
    return "home";
  }
  @GetMapping("/shop")
  public String shop(Model model) {

    return "shop";
  }

  @GetMapping("/shop/detail/{id}")
  public String shop_detail(Model model, @PathVariable("id") Integer id) {
    return "shop-details";
  }
}
