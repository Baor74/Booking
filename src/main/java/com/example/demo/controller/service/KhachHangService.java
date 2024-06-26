package com.example.demo.controller.service;

import com.example.demo.controller.entity.KhachHang;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface KhachHangService {
    @Transactional(readOnly = true)
    List<KhachHang>  findAllKhachHang();
    @Transactional
    KhachHang findKhachHangByUsername(String username);
    @Transactional
    KhachHang addKhachHang(KhachHang khachHang);
    @Transactional
    void deleteKhachHangById(Integer id);


}
