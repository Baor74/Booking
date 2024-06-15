package com.example.demo.controller.Service.serviceImpl;

import com.example.demo.controller.Entity.DichVu;
import com.example.demo.controller.Responsitori.DichVuRepository;
import com.example.demo.controller.Service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DichVuServiceImpl implements DichVuService {

    @Autowired
    private DichVuRepository dichVuRepository;

    @Override
    public List<DichVu> getAllDichVu() {
        return dichVuRepository.findAll();
    }

    @Override
    public DichVu getDichVuById(Long id) {
        Optional<DichVu> optionalDichVu = dichVuRepository.findById(id);
        return optionalDichVu.orElse(null);
    }

    @Override
    public DichVu saveDichVu(DichVu dichVu) {
        return dichVuRepository.save(dichVu);
    }
}
