package com.example.demo.controller.Service.serviceImpl;

import com.example.demo.controller.Responsitory.PhongRepo;
import com.example.demo.controller.Entity.Phong;
import com.example.demo.controller.Service.PhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongImp implements PhongService {
    @Autowired
    PhongRepo repo;

    @Override
    public List<Phong> findPhongByKhachsan(String KhachSan) {
        return repo.findPhongByKhachsan(KhachSan);
    }

    public List<Phong> sortPrice(Float PriceLess)  { return repo.sortPrice(PriceLess);}

    @Override
    public List<Phong> findAll() {
        return repo.findAll();
    }
}


