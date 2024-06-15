package com.example.demo.controller.Responsitori;


import com.example.demo.controller.Entity.KhuyenMai;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface KhuyenMaiRepo extends JpaRepository<KhuyenMai, Integer> {

}
