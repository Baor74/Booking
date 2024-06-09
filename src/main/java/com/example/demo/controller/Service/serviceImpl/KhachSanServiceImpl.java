package com.example.demo.controller.Service.serviceImpl;

import com.example.demo.controller.Entity.KhachSan;
import com.example.demo.controller.Responsitori.KhachSanRepo;
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
  public List<KhachSan> findTop10ByXepHang() {
    return khachSanRepo.findTop10ByXepHang();
  }
  @Override
  public KhachSan getKhachSanById(int maKhachSan) {
    Optional<KhachSan> optionalProduct = khachSanRepo.findById(maKhachSan);
    return optionalProduct.orElse(null);
  }
}
