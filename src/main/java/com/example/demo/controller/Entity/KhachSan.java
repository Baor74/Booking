package com.example.demo.controller.Entity;


import jakarta.persistence.*;

//import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Khach_san")
public class KhachSan {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Ma_khach_san")
  private int maKhachSan;

  @Column(name = "Ten_khach_san", nullable = false, length = 50)
  private String tenKhachSan;

  @Column(name = "Dia_chi", nullable = false, length = 100)
  private String diaChi;

  @Column(name = "Thanh_pho", nullable = false, length = 50)
  private String thanhPho;

  @Column(name = "Mo_ta", length = 100)
  private String moTa;

  @Column(name = "Xep_hang", nullable = false, precision = 2, scale = 1)
  private BigDecimal xepHang;

  @Column(name = "Hinh", length = 250)
  private String hinh;

  // Getters and Setters
  public int getMaKhachSan() {
    return maKhachSan;
  }

  public void setMaKhachSan(int maKhachSan) {
    this.maKhachSan = maKhachSan;
  }

  public String getTenKhachSan() {
    return tenKhachSan;
  }

  public void setTenKhachSan(String tenKhachSan) {
    this.tenKhachSan = tenKhachSan;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public String getThanhPho() {
    return thanhPho;
  }

  public void setThanhPho(String thanhPho) {
    this.thanhPho = thanhPho;
  }

  public String getMoTa() {
    return moTa;
  }

  public void setMoTa(String moTa) {
    this.moTa = moTa;
  }

  public BigDecimal getXepHang() {
    return xepHang;
  }

  public void setXepHang(BigDecimal xepHang) {
    this.xepHang = xepHang;
  }

  public String getHinh() {
    return hinh;
  }

  public void setHinh(String hinh) {
    this.hinh = hinh;
  }
}
