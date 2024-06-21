package com.example.demo.controller.service;

import com.example.demo.controller.entity.KhachSan;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface KhachSanService {
  @Transactional
  List<KhachSan> findAllKhachSan();
  @Transactional
  KhachSan savekhachSan(KhachSan khachSan);
  @Transactional
  List<KhachSan> findTop6ByXepHang();
  @Transactional
  KhachSan getKhachSanById(int maKhachSan);
  @Transactional
  List<KhachSan> findThanhPhoAndSucChua(String thanhPho, int sucChua);
  @Transactional
  KhachSan createOrUpdate(KhachSan khachSan);
  @Transactional
  void deleteKhachSanByMaKhachSan(Integer makhachSan);
}
