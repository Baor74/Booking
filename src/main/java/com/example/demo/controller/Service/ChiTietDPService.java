package com.example.demo.controller.Service;

import com.example.demo.controller.Entity.ChiTietDatPhong;
import com.example.demo.controller.Entity.DatPhong;

import java.util.List;

public interface ChiTietDPService {
    public List<ChiTietDatPhong> getAllChiTietDatPhong();
    ChiTietDatPhong saveChiTietDatPhong(ChiTietDatPhong chiTietDatPhong);
    public void deleteChiTietDatPhong(Integer id);
}
