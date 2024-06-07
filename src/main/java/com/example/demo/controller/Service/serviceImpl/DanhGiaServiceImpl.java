package com.example.demo.controller.Service.serviceImpl;

import com.example.demo.controller.Entity.DanhGia;
import com.example.demo.controller.Responsitori.DanhGiaRespository;
import com.example.demo.controller.Service.DanhGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhGiaServiceImpl implements DanhGiaService {
    @Autowired
    private DanhGiaRespository danhgiaRespository;
    @Override
    public List<DanhGia> getAllDanhGia() {
        return List.of();
    }
}
