package com.example.demo.controller.API;

import com.example.demo.controller.Responsitori.PhongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/api-phong")
@RestController
public class PhongAPI {
    @Autowired
    private PhongRepo repo;

    @GetMapping("/Get-all")
    public ResponseEntity<?> doGetAllPhong() {
        Map<String, Object> rs = new HashMap();
        try {
            rs.put("Status", true);
            rs.put("Message", "AllPhong");
            rs.put("data", repo.findAll());
        } catch (Exception ex) {
            rs.put("Status", false);
            rs.put("Message", "fail");
            rs.put("data", null);
        }
        return ResponseEntity.ok(rs);
    }

    @GetMapping("/Find-by-KhachSan")
    public ResponseEntity<?> doFindByName(@RequestParam("khachSan") String KhachSan) {
        Map<String, Object> rs = new HashMap();

        try {
            rs.put("Status", true);
            rs.put("Message", "AllPhong");
            rs.put("data", repo.findPhongByKhachsan(KhachSan));
        } catch (Exception ex) {
            rs.put("Status", false);
            rs.put("Message", "fail");
            rs.put("data", null);
        }
        return ResponseEntity.ok(rs);
    }
}
