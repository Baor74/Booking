package com.example.demo.controller.Service;

import com.example.demo.controller.Entity.KhachHang;

public interface AccountService {
  KhachHang addKhachHang(KhachHang khachHang);
  KhachHang getKhachHangById(int id);
}
