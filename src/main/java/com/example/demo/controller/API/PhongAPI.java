package com.example.demo.controller.API;

import com.example.demo.controller.Entity.Phong;
import com.example.demo.controller.Responsitori.PhongRepo;
import com.example.demo.controller.Service.PhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/api-phong")
@RestController
public class PhongAPI {
    @Autowired
    private PhongService phongService;

    @GetMapping("/get-all")
    public ResponseEntity<?> doGetAllPhong() {
        Map<String, Object> rs = new HashMap();
        try {
            List<Phong> phongList = phongService.findAll();

            rs.put("status", true);
            rs.put("message", "Call api success");
            rs.put("data",phongList);
        } catch (Exception ex) {
            rs.put("status", false);
            rs.put("message", "Call api failed");
            rs.put("data", null);
        }
        return ResponseEntity.ok(rs);
    }

    @GetMapping("/find-by-KhachSan")
    public ResponseEntity<?> doFindByName(@RequestParam("khachSan") String KhachSan) {
        Map<String, Object> rs = new HashMap();

        try {
            rs.put("status", true);
            rs.put("message", "Call api success");
            rs.put("data", phongService.findByKhachSan(KhachSan));
        } catch (Exception ex) {
            rs.put("status", false);
            rs.put("message", "Call api failed");
            rs.put("data", null);
        }
        return ResponseEntity.ok(rs);
    }
    @GetMapping("/sortPrice")
    public ResponseEntity<?> doGetPriceLess(@RequestParam("Price") Float Price) {
        Map<String, Object> rs = new HashMap();
        try {
            rs.put("status", true);
            rs.put("message", "Call api success");
            rs.put("data", phongService.sortPrice(Price));
        } catch (Exception ex) {
            rs.put("status", false);
            rs.put("message", "Call api failed");
            rs.put("data", null);
        }
        return ResponseEntity.ok(rs);
    }
}
