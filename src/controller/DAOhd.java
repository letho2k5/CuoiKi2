            /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.Hoadon;

/**
 *
 * @author ADMIN
 */
public class DAOhd {
    private Connection conn;

    public DAOhd() {
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-R4TO9PD\\MSSQLSERVER01;databaseName=hoadon;user=sa;password=12345;encrypt=true;trustServerCertificate=true";
            this.conn = DriverManager.getConnection(dbURL);
            System.out.println("Connected to the database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Hoadon> getListHD() {
        ArrayList<Hoadon> list = new ArrayList<>();
        String sql = "SELECT * FROM tblhoadon";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Hoadon s = new Hoadon();
                s.setMaHD(rs.getInt("STT"));
                s.setTKH(rs.getString("Tên khách hàng"));
                s.setSĐT(rs.getInt("SĐT"));
                s.setDiachi(rs.getString("Địa chỉ"));
                s.setDateOrder(rs.getString("Ngày đặt"));
                s.setThanhtien(rs.getInt("Thành tiền"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
public void AddHD(Hoadon h){
        String sql = "INSERT INTO tblhoadon ([Tên khách hàng],[SĐT],[Địa chỉ],[Ngày đặt], [Thành tiền]) VALUES ( ?,?,?,?,?)";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
//             ps.setInt(1,h.getMaHD());
             ps.setString(1,h.getTKH());
             ps.setInt(2,h.getSĐT());
             ps.setString(3,h.getDiachi());
             if (h.getDateOrder() != null) {
    // Convert the date string to a java.sql.Date object
             SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
             java.util.Date parsedDate = dateFormat.parse(h.getDateOrder());
             java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());

             ps.setDate(4, sqlDate);
            } else {
    // Handle NULL value or set a default date
            ps.setNull(4, java.sql.Types.DATE);
    // or ps.setDate(5, some_default_date);
             }
             ps.setInt(5,h.getThanhtien());
             
             ps.executeUpdate();
} catch (Exception e) {
    e.printStackTrace();
         }
     }
public void DeleteHD(int STT){
    String sql = "DELETE FROM tblhoadon WHERE STT=?";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,STT);
        ps.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
    }
}


    public static void main(String[] args) {
        DAOhd dao = new DAOhd();
        ArrayList<Hoadon> invoiceList = dao.getListHD();

        // Use the invoiceList as needed, e.g., print the details
        for (Hoadon hoadon : invoiceList) {
            System.out.println(hoadon);
        }
    }
}


