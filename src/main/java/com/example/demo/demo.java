package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demo {
    @RequestMapping("/demo")
    public String demo1() {
        return "detail";
    }
    @RequestMapping("/hoatdong")
  	public String hoatdong()
  	{
  		return"hoatdong"; 
  	}
  	@RequestMapping("/vungtau")
  	public String vungtau() {
  		return"vungtau"; 
  	}
}
