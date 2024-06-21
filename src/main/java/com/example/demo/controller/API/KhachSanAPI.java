package com.example.demo.controller.API;
import com.example.demo.controller.Entity.KhachSan;
import com.example.demo.controller.Entity.KhuyenMai;
import com.example.demo.controller.Service.KhachSanService;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/khachsan-api")
@RestController
@RequiredArgsConstructor
public class KhachSanAPI {

  private final KhachSanService khachSanService;

  @GetMapping("getAllKhachSan")
  public ResponseEntity<?> doGetAllKhachSan() {
    Map<String, Object> result = new HashMap();
    try {
      result.put("success", true);
      result.put("message", "Call api succes");
      result.put("data", khachSanService.findAllKhachSan());
    } catch (Exception e) {
      result.put("success", false);
      result.put("message", "Call api fail");
      result.put("data", null);
    }
    return ResponseEntity.ok(result);
  }
  @PostMapping("saveKhachSan")
  public ResponseEntity<?> saveKhachSan(@RequestBody KhachSan KhachSan) {
    Map<String, Object> result = new HashMap();
    try {
      result.put("success", true);
      result.put("message", "Call api succes");
      result.put("data", khachSanService.saveKhachSan(KhachSan));
    } catch (Exception e) {
      result.put("success", false);
      result.put("message", "Call api fail");
      result.put("data", null);
    }
    return ResponseEntity.ok(result);
  }
  @GetMapping("findTop6ByXepHang")
  public ResponseEntity<?> findTop6ByXepHang() {
    Map<String, Object> result = new HashMap();
    try {
      result.put("success", true);
      result.put("message", "Call api succes");
      result.put("data", khachSanService.findTop6ByXepHang());
    } catch (Exception e) {
      result.put("success", false);
      result.put("message", "Call api fail");
      result.put("data", null);
      e.printStackTrace();
    }
    return ResponseEntity.ok(result);
  }
  @GetMapping("findKhachSanById")
  public ResponseEntity<?> findKhachSanById(@RequestParam("maKhachSan") int maKhachSan) {
    Map<String, Object> result = new HashMap<>();
    try {
      result.put("success", true);
      result.put("message", "Call api succes");
      result.put("data", khachSanService.getKhachSanById(maKhachSan));
    } catch (Exception e) {
      result.put("success", false);
      result.put("message", "Call api fail");
      result.put("data", null);
    }
    return ResponseEntity.ok(result);
  }
  // API lấy thông tin khách sạn theo tên
  @GetMapping("/{tenKhachSan}")
  public ResponseEntity<KhachSan> getKhachSanByTenKhachSan(@PathVariable("tenKhachSan") String tenKhachSan) {
    Optional<KhachSan> khachSan = khachSanService.getKhachSanByTenKhachSan(tenKhachSan);
    return khachSan.map(ResponseEntity::ok)  // Nếu tìm thấy khách sạn, trả về 200 OK
            .orElse(ResponseEntity.notFound().build()); // Nếu không tìm thấy, trả về HTTP 404
  }
}
