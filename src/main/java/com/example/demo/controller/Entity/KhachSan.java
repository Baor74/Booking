package com.example.demo.controller.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Khach_san")
public class KhachSan {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Ma_khach_san")
  private Integer maKhachSan;

  @Column(name = "Ten_khach_san")
  private String tenKhachSan;

  @Column(name = "Dia_chi")
  private String diaChi;

  @Column(name = "Thanh_pho")
  private String thanhPho;

  @Column(name = "Mo_ta")
  private String moTa;

  @Column(name = "Xep_hang")
  private BigDecimal xepHang;

  @OneToMany(mappedBy = "khachSan",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<Phong> listPhong;
}
