package com.example.demo.controller.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demo {
    @GetMapping("/demo")
    public String demo1() {
        return "detail";
    }
    @GetMapping("/hoatdong")
  	public String hoatdong()
  	{
  		return"hoatdong"; 
  	}
  	@RequestMapping("/vungtau")
  	public String vungtau() {
  		return"vungtau"; 
  	}


}
