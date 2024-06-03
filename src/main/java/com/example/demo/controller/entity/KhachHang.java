package com.example.demo.controller.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Khach_hang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Ten_tai_khoan", unique = true)
    private String username;

    @Column(name = "Mat_khau")
    private String password;

    @Column(name="ho_ten")
    private String fullname;




}
