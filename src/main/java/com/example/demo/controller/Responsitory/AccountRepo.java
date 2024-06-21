package com.example.demo.controller.Responsitory;

import com.example.demo.controller.Entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<KhachHang, Integer> {
  KhachHang save(KhachHang khachHang);
}
