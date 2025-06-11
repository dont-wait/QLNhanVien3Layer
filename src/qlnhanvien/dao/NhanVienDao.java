/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlnhanvien.dao;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import qlnhanvien.entity.NhanVien;
import java.sql.Connection;
import qlnhanvien.util.DBUtil;

/**
 *
 * @author dontwait
 */
public class NhanVienDao implements Serializable{
    private static NhanVienDao instance;
    private Connection conn = DBUtil.makeConnection();
    private List<NhanVien> employees = new ArrayList<>();
    
    public NhanVienDao() {}
    public static NhanVienDao getInstance() {
        if(instance == null)
            instance = new NhanVienDao();
        return instance;
    }
    public static List<NhanVien> layDanhSachNhanVien() {
        return null;
    }
}
