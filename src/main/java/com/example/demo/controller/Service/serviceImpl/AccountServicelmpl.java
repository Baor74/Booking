package com.example.demo.controller.Service.serviceImpl;

import com.example.demo.controller.Entity.KhachHang;
import com.example.demo.controller.Responsitory.KhachHangRepo;
import com.example.demo.controller.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServicelmpl implements AccountService {
  @Autowired
  private KhachHangRepo repo;
  @Override
  public KhachHang addKhachHang(KhachHang khachHang) {
    return repo.save(khachHang);
  }
}
