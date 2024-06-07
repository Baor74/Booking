package com.example.demo.controller.Service;

import com.example.demo.controller.Entity.KhachHang;
import org.springframework.stereotype.Service;

import java.util.List;


public interface KhachHangService {
    List<KhachHang>  findAllKhachHang();
    KhachHang findKhachHangByUsername(String username);

}
