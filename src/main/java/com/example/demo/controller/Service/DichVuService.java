package com.example.demo.controller.Service;

import com.example.demo.controller.Entity.DichVu;

import java.util.List;

public interface DichVuService {
    List<DichVu> getAllDichVu();
    DichVu getDichVuById(Long id);
    DichVu saveDichVu(DichVu dichVu);
}
