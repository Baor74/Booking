package com.example.demo.controller.Service;


import com.example.demo.controller.Entity.Phong;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PhongService {
    List<Phong> findAll();
    List<Phong> findPhongByKhachsan(String KhachSan);
    List<Phong> sortPrice(Float PriceLess);
}
