package com.example.demo.controller.Service;

import com.example.demo.controller.Entity.DatPhong;

import java.util.List;

public interface DatPhongService {
    public List<DatPhong> getAllDatPhong();
    public DatPhong saveDatPhong(DatPhong DatPhong);
    public void deleteDatPhong(Integer id);
}
