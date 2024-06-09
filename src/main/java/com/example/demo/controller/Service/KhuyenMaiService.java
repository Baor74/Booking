package com.example.demo.controller.Service;

import com.example.demo.controller.Entity.KhachSan;
import com.example.demo.controller.Entity.KhuyenMai;
import java.util.List;

public interface KhuyenMaiService {
  List<KhuyenMai> findAllKhuyenMai();
  KhuyenMai savekhuyenMai(KhuyenMai khuyenMai);

}
