package com.example.demo.controller.API;

import com.example.demo.controller.Entity.KhachHang;
import com.example.demo.controller.Service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api-khachhang")
public class KhachHangAPI {
    @Autowired
    private KhachHangService service;

    @GetMapping("/get-all-khachhang")
    public ResponseEntity<?> getAllKhachHang(){
        Map<String, Object> rs = new HashMap();
        try {

            rs.put("status", true);
            rs.put("message", "Call api success");
            rs.put("data",service.findAllKhachHang());
        } catch (Exception ex) {
            rs.put("status", false);
            rs.put("message", "Call api failed");
            rs.put("data", null);
        }
        return ResponseEntity.ok(rs);
    }
    @GetMapping("/get-khachhang-by-username")
    public ResponseEntity<?> getKhachHangByUsername(@RequestParam("username") String username){
        Map<String, Object> rs = new HashMap();
        try {
            rs.put("status", true);
            rs.put("message", "Call api success");
            rs.put("data",service.findKhachHangByUsername(username));
        } catch (Exception ex) {
            rs.put("status", false);
            rs.put("message", "Call api failed");
            rs.put("data", null);
        }
        return ResponseEntity.ok(rs);
    }
}
