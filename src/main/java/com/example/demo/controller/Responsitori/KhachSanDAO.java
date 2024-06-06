package com.example.demo.controller.Responsitori;

import com.example.demo.controller.Entity.KhachSan;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachSanDAO extends JpaRepository<KhachSan, Integer> {
}
