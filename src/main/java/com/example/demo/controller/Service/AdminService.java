package com.example.demo.controller.Service;

import com.example.demo.controller.Entity.KhachHang;
import java.util.List;

public interface AdminService {
  List<KhachHang> findAllKhachHang();
  KhachHang addKhachHang(KhachHang khachHang);
  void deleteKhachHang(Integer khachHangId);
  KhachHang findKhachHangById(Integer maKhachHang);
}
