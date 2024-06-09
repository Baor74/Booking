package com.example.demo.controller.Responsitori;

import com.example.demo.controller.Entity.KhachSan;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachSanRepo extends JpaRepository<KhachSan, Integer> {
  @Query("SELECT ks FROM KhachSan ks ORDER BY ks.xepHang DESC")
  List<KhachSan> findTop10ByXepHang();
}
