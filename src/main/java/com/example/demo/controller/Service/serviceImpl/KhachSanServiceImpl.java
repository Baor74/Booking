package com.example.demo.controller.Service.serviceImpl;

import com.example.demo.controller.Entity.KhachSan;
import com.example.demo.controller.Responsitory.KhachSanRepo;
import com.example.demo.controller.Service.KhachSanService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhachSanServiceImpl implements KhachSanService {
  @Autowired
  KhachSanRepo khachSanRepo;

  @Override
  public List<KhachSan> findAllKhachSan() {
    return khachSanRepo.findAll();
  }
  @Override
  public KhachSan savekhachSan(KhachSan khachSan) {
    return khachSanRepo.save(khachSan);
  }
  @Override
  public List<KhachSan> findTop6ByXepHang() {
    return khachSanRepo.findTop6ByXepHang();
  }

  @Override
  public Optional<KhachSan> getKhachSanByTenKhachSan(String tenKhachSan) {
    return khachSanRepo.findByTenKhachSan(tenKhachSan);
  }
  @Override
  public KhachSan getKhachSanById(int maKhachSan) {
    Optional<KhachSan> optionalProduct = khachSanRepo.findById(maKhachSan);
    return optionalProduct.orElse(null);
  }
}
