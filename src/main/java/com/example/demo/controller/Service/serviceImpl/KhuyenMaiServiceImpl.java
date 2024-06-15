package com.example.demo.controller.Service.serviceImpl;

import com.example.demo.controller.Entity.KhuyenMai;
import com.example.demo.controller.Responsitory.KhuyenMaiRepo;
import com.example.demo.controller.Service.KhuyenMaiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService {
  @Autowired
  KhuyenMaiRepo khuyenMaiRepo;

  @Override
  public List<KhuyenMai> findAllKhuyenMai() {
    return khuyenMaiRepo.findAll();
  }
  @Override
  public KhuyenMai savekhuyenMai(KhuyenMai khuyenMai) {
    return khuyenMaiRepo.save(khuyenMai);
  }
}
