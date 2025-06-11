/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlnhanvien.service;

import java.util.List;
import qlnhanvien.dao.NhanVienDao;
import qlnhanvien.entity.NhanVien;

/**
 *
 * @author dontwait
 */
public class NhanVienService {
    private static NhanVienService instance;
    private NhanVienDao dao;
    
    public NhanVienService() {
        dao = NhanVienDao.getInstance();
    }
    
    public List<NhanVien> getAll() {
        return dao.getEmployees();
    }
    
}
