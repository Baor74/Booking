package com.example.demo.controller.Responsitory;


import com.example.demo.controller.Entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachSanDAO extends JpaRepository<KhachHang, Integer> {
}
