package com.example.demo.controller.Controller;

import com.example.demo.controller.Responsitory.KhachSanRepo;
import com.example.demo.controller.Utils.SessionService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  @Autowired
  KhachSanRepo khachSanRepo;

  @Autowired
  SessionService session;

  @RequestMapping("/index")
  public String index() {
    return "home";
  }
  @RequestMapping("/detail")
  public String shop_detail() {
    return "detail";
  }
  @GetMapping("/shop")
  public String shop() {
    return "hotel";
  }


}