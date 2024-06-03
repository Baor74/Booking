package com.example.demo.controller.service;

import com.example.demo.controller.entity.Phong;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PhongService {
    List<Phong> findPhongByKhachsan(String KhachSan);
}
