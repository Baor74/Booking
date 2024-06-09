package com.example.demo.controller.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Khach_san")
public class KhachSan implements Serializable{
  @Serial
  private static final long serialVersionUID = 1L;

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
  private Double  xepHang;

  @Column(name = "Hinh")
  private String hinh;

}
