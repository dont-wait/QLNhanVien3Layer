/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlnhanvien.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import qlnhanvien.entity.PhongBan;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlnhanvien.util.DBUtil;

/**
 *
 * @author sangn
 */
public class PhongBanDao implements Serializable{
    private Connection conn = DBUtil.makeConnection();
    private static PhongBanDao instance;
    private List<PhongBan> dsPB = new ArrayList<>();
    
    public PhongBanDao() {}
    
    public static PhongBanDao getInstance() {
        if(instance == null)
            instance = new PhongBanDao();
        return instance;
    }
    
    public List<PhongBan> getAll() {
        String sql = "SELECT * FROM PhongBan";
        
        ResultSet rs = DBUtil.executeQuery(sql);
        try {
            while(rs.next()) {
                dsPB.add(new PhongBan(rs.getInt("maPhong"), rs.getString("tenPhong")));
            }
            DBUtil.closeConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(PhongBanDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsPB;
    }
}
