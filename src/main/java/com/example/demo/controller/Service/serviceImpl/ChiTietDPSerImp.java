package com.example.demo.controller.Service.serviceImpl;

import com.example.demo.controller.Entity.ChiTietDatPhong;
import com.example.demo.controller.Entity.DatPhong;
import com.example.demo.controller.Responsitory.ChiTietDatPhongRepo;
import com.example.demo.controller.Responsitory.DatPhongRepo;
import com.example.demo.controller.Service.ChiTietDPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietDPSerImp implements ChiTietDPService {
    @Autowired
    ChiTietDatPhongRepo repo;

    public List<ChiTietDatPhong> getAllChiTietDatPhong() {
        return repo.findAll();
    }
    public ChiTietDatPhong saveChiTietDatPhong(ChiTietDatPhong chiTietDatPhong) {
        return repo.save(chiTietDatPhong);
    }
    public void deleteChiTietDatPhong(Integer id) {
        repo.deleteById(id);
    }

}
