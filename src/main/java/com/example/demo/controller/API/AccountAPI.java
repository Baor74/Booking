package com.example.demo.controller.API;

import com.example.demo.controller.Entity.KhachHang;
import com.example.demo.controller.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    public ResponseEntity<Map<String, Object>> getKhachHangById(@RequestParam(required = false) Integer maKhachHang) {
        Map<String, Object> result = new HashMap<>();

//        if (maKhachHang == null) {
//            result.put("success", false);
//            result.put("message", "Mã khách hàng không được để trống");
//            result.put("data", null);
//            return ResponseEntity.badRequest().body(result);
//        }

        try {
            KhachHang khachHang = accountService.getKhachHangById(maKhachHang);
            if (khachHang == null) {
                result.put("success", false);
                result.put("message", "Không tìm thấy khách hàng với mã này");
                result.put("data", null);
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(result);
            }
            result.put("success", true);
            result.put("message", "Thành công");
            result.put("data", khachHang);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "Lỗi: " + e.getMessage());
            result.put("data", null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result);
        }
    }
}
