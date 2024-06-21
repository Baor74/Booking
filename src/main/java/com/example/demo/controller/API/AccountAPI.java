package com.example.demo.controller.API;

import com.example.demo.controller.Entity.KhachHang;
import com.example.demo.controller.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/account")
public class AccountAPI {
    @Autowired
    private AccountService accountService;
    @GetMapping("/dangnhap")
    public ResponseEntity<?> getKhachHangById(@RequestParam int id) {
        Map<String, Object> result = new HashMap<>();
        try {
            KhachHang khachHang = accountService.getKhachHangById(id);
            result.put("Success", true);
            result.put("Message", "Call success");
            result.put("data", khachHang);
        } catch (Exception e) {
            result.put("Success", false);
            result.put("Message", "Call fail");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }
}
