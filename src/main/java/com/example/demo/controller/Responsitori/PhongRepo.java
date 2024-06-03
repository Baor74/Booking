package com.example.demo.controller.Responsitori;

import com.example.demo.controller.entity.Phong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhongRepo extends JpaRepository<Phong, Integer> {

    @Query(value = "SELECT p.* FROM Phong p INNER JOIN Khach_san k ON p.Ma_khach_san = k.Ma_khach_san WHERE k.Ten_khach_san = ?1", nativeQuery = true)
    List<Phong> findPhongByKhachsan(String khachSan);

    @Query(value = "SELECT * FROM Phong p WHERE p.gia <?1", nativeQuery = true)
    List<Phong> sortPrice(Float PriceLess);
}
