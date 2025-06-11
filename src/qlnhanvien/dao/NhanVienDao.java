/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlnhanvien.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import qlnhanvien.entity.NhanVien;
import java.sql.*;
import java.sql.Connection;
import qlnhanvien.util.DBUtil;

/**
 *
 * @author dontwait
 */
public class NhanVienDao implements Serializable {

    private static NhanVienDao instance;
    private Connection conn = DBUtil.makeConnection();
    private List<NhanVien> employees = new ArrayList<>();

    public NhanVienDao() {
    }

    //Chỉ được khởi tạo bằng duy nhất 1 lần
    public static NhanVienDao getInstance() {
        if (instance == null) {
            instance = new NhanVienDao();
        }
        return instance;
    }

    public boolean deleteNhanVienByMaNhanVien(String maNhanVien) {
        String sql = "DELETE FROM NhanVien WHERE maNhanVien = ?";
        int rowsDeleted = DBUtil.executeUpdate(sql, maNhanVien);
        DBUtil.closeConnection(conn);
        return rowsDeleted > 0;
    }
    
    public List<NhanVien> getEmployees() {

        try {
            String sql = "SELECT * FROM NhanVien";
            ResultSet rs = DBUtil.executeQuery(sql);
            while (rs.next()) {
                employees.add(new NhanVien(rs.getString("maNhanVien"),
                        rs.getString("tenNhanVien"),
                        rs.getInt("namVaoLam"),
                        rs.getDate("namSinh"),
                        rs.getString("email"),
                        rs.getString("soDienThoai"),
                        rs.getInt("maPhong")
                )
                );
            }
            DBUtil.closeConnection(conn);

        } catch (SQLException ex) {
            System.getLogger(NhanVienDao.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return employees;
    }
}
