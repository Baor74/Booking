package com.example.demo.controller.service;

import com.example.demo.controller.entity.DichVu;

import java.util.List;

public interface DichVuService {
    List<DichVu> getAllDichVu();
    DichVu getDichVuById(Long id);
    DichVu saveDichVu(DichVu dichVu);
}
