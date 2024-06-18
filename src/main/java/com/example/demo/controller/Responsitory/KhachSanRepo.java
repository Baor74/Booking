package com.example.demo.controller.Responsitory;

import com.example.demo.controller.Entity.KhachSan;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachSanRepo extends JpaRepository<KhachSan, Integer> {
  @Query("SELECT ks FROM KhachSan ks ORDER BY ks.xepHang DESC LIMIT 6")
  List<KhachSan> findTop6ByXepHang();
  Optional<KhachSan> findByTenKhachSan(String tenKhachSan); // Tìm kiếm khách sạn theo tên khách sạn

}