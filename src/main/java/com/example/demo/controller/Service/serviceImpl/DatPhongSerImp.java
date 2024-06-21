package com.example.demo.controller.Service.serviceImpl;

import com.example.demo.controller.Entity.ChiTietDatPhong;
import com.example.demo.controller.Entity.DatPhong;
import com.example.demo.controller.Responsitory.DatPhongRepo;
import com.example.demo.controller.Service.DatPhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatPhongSerImp implements DatPhongService {
    @Autowired
    DatPhongRepo repo;

    public List<DatPhong> getAllDatPhong() {
        return repo.findAll();
    }
    public DatPhong saveDatPhong(DatPhong DatPhong) {
        return repo.save(DatPhong);
    }
    public void deleteDatPhong(Integer id) {
        repo.deleteById(id);
    }

}
