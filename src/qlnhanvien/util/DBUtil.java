/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlnhanvien.util;

import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author dontwait
 */
public class DBUtil {

    private static Connection conn;

    public static Connection makeConnection() {
        conn = null;
        try {

            //String dbURL = "jdbc:sqlserver://A103PC25\\Administrator:1433;databaseName=dbKhachHang;encrypt=true;trustServerCertificate=true;";
            //String dbURL = "jdbc:sqlserver://DESKTOP-O7IVQ50\\DONTWAIT:1433;databaseName=QLNHANVIEN;encrypt=true;trustServerCertificate=true;";
            String dbURL = "jdbc:sqlserver://dontwait-inspiron15\\DONTWAIT:1433;databaseName=QLNHANVIEN;encrypt=true;trustServerCertificate=true;";

            
            String user = "sa";
            String pass = "Tansang990";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, user, pass);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {

            } catch (Exception e) {
                Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public static ResultSet executeQuery(String sql) {
        ResultSet rs = null;
        PreparedStatement sm;
        try {
            sm = conn.prepareStatement(sql);
            rs = sm.executeQuery();
        } catch (SQLException ex) {
            System.getLogger(DBUtil.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return rs;
    }

    public static int executeUpdate(String sql, Object... params) {
        int n = -1;
        try(PreparedStatement ps = conn.prepareStatement(sql)) {
            for(int i = 0; i < params.length; i++)
                ps.setObject( i + 1, params[i]);
            n = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return n;
    }

    public static void main(String[] args) throws SQLException {

        System.out.println("This is to test if we can connect to SQLServer");
        Connection conn = makeConnection();
        DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
        System.out.println("Driver name: " + dm.getDriverName());
        System.out.println("Driver version: " + dm.getDriverVersion());
        closeConnection(conn);
    }

}
