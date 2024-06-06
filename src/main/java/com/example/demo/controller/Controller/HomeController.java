package com.example.demo.controller.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hanoi")
public class HomeController {

    @GetMapping("/hanoi")
    public String index(Model model)
    {
        return "haNoi";
    }
}
