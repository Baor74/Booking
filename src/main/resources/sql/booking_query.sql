CREATE DATABASE DB_Booking;
USE DB_Booking;
Go
CREATE TABLE Khach_Hang(
                           Ma_khach_hang int Identity(1,1),
                           Ten_tai_khoan varchar(50) not null unique,
                           Mat_khau Varchar(20) not null,
                           Ho_ten Nvarchar(50) not null,
                           Gioi_tinh bit not null,
                           Ngay_sinh date not null,
                           Dia_chi Nvarchar(100) ,
                           Email Varchar(50) not null unique,
                           SDT Varchar (10) ,
                           PRIMARY KEY (Ma_khach_hang)
)

    GO
CREATE TABLE Khach_san(
                          Ma_khach_san int Identity(1,1),
                          Ten_khach_san NVarchar (50) not null,
                          Dia_chi Nvarchar(100) not null,
                          Thanh_pho NVarChar(50) not null,
                          Mo_ta NVarchar (100) ,
                          Xep_hang Decimal(2,1) not null,
                          PRIMARY KEY (Ma_khach_san)

)

    GO
CREATE TABLE Phong (
                       Ma_phong int identity(1,1),
                       Ma_khach_san INT,
                       So_phong VARCHAR(10) NOT NULL,
                       Kieu VARCHAR(50),
                       Gia Float NOT NULL,
                       Mo_ta NVarchar(100),
                       Trang_thai bit not null,
                       PRIMARY KEY (Ma_phong),
                       FOREIGN KEY (Ma_khach_san) REFERENCES Khach_san(Ma_khach_san)
);

GO
CREATE TABLE Dat_phong (
                           Ma_dat_phong INT Identity(1,1),
                           Ma_khach_hang INT,
                           Ma_phong INT,
                           Ngay_den DATE NOT NULL,
                           Ngay_tra DATE NOT NULL,
                           Tong_tien Float NOT NULL,
                           Trang_thai bit not null,
                           FOREIGN KEY (Ma_khach_hang) REFERENCES Khach_hang(Ma_khach_hang),
                           FOREIGN KEY (Ma_phong) REFERENCES Phong(Ma_phong)
);

GO
CREATE TABLE Danh_Gia (
                          Ma_danh_gia INT  Identity(1,1),
                          Ma_khach_hang INT,
                          Ma_khach_san INT,
                          Danh_gia INT CHECK (Danh_gia >= 1 AND Danh_gia <= 5),
                          Binh_luan TEXT,
                          Ngay_danh_gia DateTime,
                          PRIMARY KEY (Ma_danh_gia),
                          FOREIGN KEY (Ma_khach_hang) REFERENCES Khach_Hang(Ma_khach_hang),
                          FOREIGN KEY (Ma_khach_san) REFERENCES Khach_san(Ma_khach_san)
);

GO

CREATE TABLE Khuyen_mai (
                            Ma_khuyen_mai INT Identity(1,1),
                            Ten_khuyen_mai NVarchar(100) NOT NULL,
                            Mo_ta NVarchar(200),
                            Ngay_bat_dau DATE NOT NULL,
                            Ngay_ket_thuc DATE NOT NULL,
                            Muc_giam Decimal(5, 2) NOT NULL CHECK (Muc_giam >= 0 AND Muc_giam <= 100),
                            PRIMARY KEY (Ma_khuyen_mai)
);

GO

CREATE TABLE Dich_vu (
                         Ma_dich_vu INT Identity(1,1) ,
                         Ma_khach_san INT NOT NULL,
                         Ten_dich_vu NVarchar(100) NOT NULL,
                         Mo_ta NVarchar(200),
                         Gia Float NOT NULL,
                         PRIMARY KEY (Ma_dich_vu),
                         FOREIGN KEY (Ma_khach_san) REFERENCES Khach_san(Ma_khach_san)

);
drop table Dichvu
drop table KhachHang
drop Table KhachSan
Drop table Phong
drop table KhuyenMai
drop table DanhGia
Drop Table DatPhong
    GO


