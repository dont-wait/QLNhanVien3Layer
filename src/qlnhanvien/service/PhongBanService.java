/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlnhanvien.service;

import java.util.List;
import qlnhanvien.dao.PhongBanDao;
import qlnhanvien.entity.PhongBan;

/**
 *
 * @author sangn
 */
public class PhongBanService {
    private PhongBanDao dao;
    
    public PhongBanService() {
        dao = PhongBanDao.getInstance();
    }
    public List<PhongBan> getAll() {
        return dao.getAll();
    }
}
