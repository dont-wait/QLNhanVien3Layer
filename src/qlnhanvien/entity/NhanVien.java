/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlnhanvien.entity;

import java.util.Date;

/**
 *
 * @author dontwait
 */
public class NhanVien {
    private String maNhanVien;
    private String tenNhanvien;
    private Date ngayVaoLam;
    private Date namVaoLam;
    private String email;
    private String phone;
    private int maPhongBan;

    public NhanVien(String maNhanVien, String tenNhanvien, Date ngayVaoLam, Date namVaoLam, String email, String phone, int maPhongBan) {
        this.maNhanVien = maNhanVien;
        this.tenNhanvien = tenNhanvien;
        this.ngayVaoLam = ngayVaoLam;
        this.namVaoLam = namVaoLam;
        this.email = email;
        this.phone = phone;
        this.maPhongBan = maPhongBan;
    }
    
    public NhanVien(){}

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanvien() {
        return tenNhanvien;
    }

    public void setTenNhanvien(String tenNhanvien) {
        this.tenNhanvien = tenNhanvien;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public Date getNamVaoLam() {
        return namVaoLam;
    }

    public void setNamVaoLam(Date namVaoLam) {
        this.namVaoLam = namVaoLam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(int maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", tenNhanvien=" + tenNhanvien + ", ngayVaoLam=" + ngayVaoLam + ", namVaoLam=" + namVaoLam + ", email=" + email + ", phone=" + phone + ", maPhongBan=" + maPhongBan + '}';
    }
    
}
