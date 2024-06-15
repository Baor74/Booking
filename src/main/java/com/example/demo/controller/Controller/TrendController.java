package com.example.demo.controller.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrendController {
  @GetMapping("/trend")
  public String getProductPage() {
    return "trend";
  }
}
