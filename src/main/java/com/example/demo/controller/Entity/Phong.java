package com.example.demo.controller.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Phong {
    @ManyToOne
    @JoinColumn(name = "Ma_khach_san")
    @JsonBackReference
    private KhachSan khachSan;

    @Column(name = "So_phong")
    private String SoPhong;
    @Column(name = "Kieu")
    private String KieuPhong;
    @Column(name = "Gia")
    private Float Gia;
    @Column(name = "Mo_ta")
    private String MoTa;
    @Column(name = "Trang_thai")
    @Convert(converter = BooleanConverter.class)
    private Boolean TrangThai;
}
}
