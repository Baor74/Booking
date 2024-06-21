package com.example.demo.controller.Service.serviceImpl;

import com.example.demo.controller.Entity.KhachHang;

import com.example.demo.controller.Responsitory.KhachHangRepo;
import com.example.demo.controller.Service.AdminService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
