package com.example.demo.controller.service.serviceImpl;



import com.example.demo.controller.entity.KhachHang;
import com.example.demo.controller.responsitory.KhachHangRepo;
import com.example.demo.controller.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServicelmpl implements AdminService {

  @Autowired
  private KhachHangRepo repo;

  @Override
  public List<KhachHang> findAllKhachHang() {
    return repo.findAll();
  }
  @Override
  public KhachHang addKhachHang(KhachHang khachHang) {
    return repo.save(khachHang);
  }

  @Override
  public void deleteKhachHang(Integer khachHangId) {
    repo.deleteById(khachHangId);
  }
  @Override
  public KhachHang findKhachHangById(Integer maKhachHang) {
    Optional<KhachHang> optionalProduct = repo.findById(maKhachHang);
    return optionalProduct.orElse(null);
  }
}
