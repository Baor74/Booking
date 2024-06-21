package com.example.demo.controller.Service;



import com.example.demo.controller.Entity.KhachSan;


import java.util.List;
import java.util.Optional;

public interface KhachSanService {
  List<KhachSan> findAllKhachSan();
  KhachSan saveKhachSan(KhachSan khachSan);
  List<KhachSan> findTop6ByXepHang();
  Optional<KhachSan> getKhachSanById(int maKhachSan);
  Optional<KhachSan> getKhachSanByTenKhachSan(String tenKhachSan);
}
