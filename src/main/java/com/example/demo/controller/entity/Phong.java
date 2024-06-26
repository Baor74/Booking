package com.example.demo.controller.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Phong")
public class Phong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Ma_phong")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "Ma_khach_san")
    @JsonBackReference
    private KhachSan khachSan;

    @Column(name = "So_phong")
    private String soPhong;

    @Column(name = "Kieu")
    private String KieuPhong;

    @Column(name = "Gia")
    private Float Gia;

    @Column(name = "Mo_ta")
    private String MoTa;

    @Column(name = "Suc_chua")
    private Integer sucChua;

    @Column(name = "Trang_thai")
    @Convert(converter = BooleanConverter.class)
    private Boolean trangThai;

    @Column(name = "hinh")
    private String hinh;

}
