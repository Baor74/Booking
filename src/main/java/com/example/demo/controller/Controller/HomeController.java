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

  @GetMapping("/shop")
  public String shop(Model model, @RequestParam("p") Optional<Integer> p, @RequestParam("name") Optional<String> name) {
    return "shop";
  }

  @GetMapping("/shop/detail/{id}")
  public String shop_detail(Model model, @PathVariable("id") Integer id) {

    return "shop-details";
  }
}
