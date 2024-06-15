package com.example.demo.controller.API;

import com.example.demo.controller.Entity.KhuyenMai;
import com.example.demo.controller.Service.KhachSanService;
import com.example.demo.controller.Service.KhuyenMaiService;
import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/khuyenmai-api")
@RestController
@RequiredArgsConstructor
public class KhuyenMaiAPI {
  private final KhuyenMaiService khuyenMaiService;

  @GetMapping("/getAllKhuyenMai")
  public ResponseEntity<?> doGetAllKhuyenMai() {
    Map<String, Object> result = new HashMap();
    try {
      result.put("success", true);
      result.put("message", "Call api succes");
      result.put("data", khuyenMaiService.findAllKhuyenMai());
    } catch (Exception e) {
      result.put("success", false);
      result.put("message", "Call api fail");
      result.put("data", null);
    }
    return ResponseEntity.ok(result);
  }
  @PostMapping("saveKhuyenMai")
  public ResponseEntity<?> saveKhuyenMai(@RequestBody KhuyenMai khuyenMai) {
    Map<String, Object> result = new HashMap();
    try {
      result.put("success", true);
      result.put("message", "Call api succes");
      result.put("data", khuyenMaiService.savekhuyenMai(khuyenMai));
    } catch (Exception e) {
      result.put("success", false);
      result.put("message", "Call api fail");
      result.put("data", null);
    }
    return ResponseEntity.ok(result);
  }

}
