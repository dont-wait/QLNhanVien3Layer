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
    private int namVaoLam;
    private Date namSinh;
    private String email;
    private String phone;
    private int maPhongBan;

    public NhanVien() {
    }
    
    public NhanVien(String maNhanVien, String tenNhanvien, int namVaoLam, Date namSinh, String email, String phone, int maPhongBan) {
        this.maNhanVien = maNhanVien;
        this.tenNhanvien = tenNhanvien;
        this.namVaoLam = namVaoLam;
        this.namSinh = namSinh;
        this.email = email;
        this.phone = phone;
        this.maPhongBan = maPhongBan;
    }

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

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public void setNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }

    public String getEmail() {
        return email;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
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
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", tenNhanvien=" + tenNhanvien + ", namVaoLam=" + namVaoLam + ", email=" + email + ", phone=" + phone + ", maPhongBan=" + maPhongBan + '}';
    }

}
