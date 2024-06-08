package com.example.demo.controller.Responsitori;

import com.example.demo.controller.Entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KhachHangRepo extends JpaRepository<KhachHang, Integer> {
    @Override
    List<KhachHang> findAll();

    KhachHang findKhachHangByUsername(String username);

    KhachHang save(KhachHang khachHang);

    void deleteKhachHangByid(Integer id);
}
