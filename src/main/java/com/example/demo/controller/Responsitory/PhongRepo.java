package com.example.demo.controller.Responsitory;


import com.example.demo.controller.Entity.Phong;
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

    @Query(value = "SELECT p.Ma_phong AS Ma_phong_p, ct.Ma_phong AS Ma_phong_ct FROM Phong p INNER JOIN Chi_tiet_dat_phong ct ON p.Ma_phong = ct.Ma_phong WHERE ct.Ma_phong = ?1", nativeQuery = true)
    List<Phong> chiTietToMKS(Integer id);


}
