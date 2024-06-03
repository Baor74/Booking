package com.example.demo.controller.entity;


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


    @Column(name = "Ma_khach_san", unique = true)
    private Integer MaKhachSan;

    @Column(name = "So_phong")
    private String SoPhong;

    @Column(name = "Kieu")
    private String KieuPhong;

    @Column(name = "Gia")
    private Float Gia;

    @Column(name = "Mo_ta")
    private String Mo_ta;

    @Column(name = "Trang_thai")
    @Convert(converter = BooleanConverter.class)
    private Boolean TrangThai;
}
