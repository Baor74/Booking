package com.example.demo.controller.Service.serviceImpl;



import java.util.List;
import java.util.Optional;

import com.example.demo.controller.Entity.KhachSan;
import com.example.demo.controller.Responsitory.KhachSanRepo;
import com.example.demo.controller.Service.KhachSanService;
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
  public KhachSan saveKhachSan(KhachSan khachSan) {
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
  public Optional<KhachSan> getKhachSanById(int maKhachSan) {
    return khachSanRepo.findById(maKhachSan);
  }
}

