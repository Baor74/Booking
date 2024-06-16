package com.example.demo.controller.Service;

import com.example.demo.controller.Entity.KhachHang;
import org.springframework.stereotype.Service;
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
