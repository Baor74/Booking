package com.example.demo.controller.service.serviceImpl;

import com.example.demo.controller.Responsitori.PhongRepo;
import com.example.demo.controller.entity.Phong;
import com.example.demo.controller.service.PhongService;
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
    }


