package com.example.demo.controller.Service;

import com.example.demo.controller.Entity.KhachSan;
import com.example.demo.controller.Entity.KhuyenMai;
import java.util.List;
import java.util.Optional;

public interface KhachSanService {
  List<KhachSan> findAllKhachSan();
  KhachSan savekhachSan(KhachSan khachSan);
  List<KhachSan> findTop6ByXepHang();
  KhachSan getKhachSanById(int maKhachSan);
  Optional<KhachSan> getKhachSanByTenKhachSan(String tenKhachSan); // Thêm phương thức mới

}
