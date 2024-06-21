package com.example.demo.controller.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Dich_vu")
@Getter
@Setter
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_dich_vu")
    private Long maDichVu;

    @Column(name = "ma_khach_san")
    private Long maKhachSan;

    @Column(name = "ten_dich_vu")
    private String tenDichVu;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "gia")
    private Double gia;
}
