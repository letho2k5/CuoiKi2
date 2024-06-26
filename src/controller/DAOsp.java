/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import model.sanpham;

/**
 *
 * @author ADMIN
 */
public class DAOsp {

    private static boolean sanpham;

    private Connection conn;

    public DAOsp() {
    try {
            String dbURL = "jdbc:sqlserver://DESKTOP-R4TO9PD\\MSSQLSERVER01;databaseName=sanpham;user=sa;password=12345;encrypt=true;trustServerCertificate=true";
            this.conn = DriverManager.getConnection(dbURL);
            System.out.println("Connected to the database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<sanpham> getListSP() {
        ArrayList<sanpham> list = new ArrayList<>();
        String sql = "SELECT * FROM tblsanpham"; // Adjust table name if needed
        try {
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sanpham s = new sanpham();
                s.setID(rs.getInt("ID"));
                s.setMasp(rs.getString("Mã sản phẩm"));
                s.setTensp(rs.getString("Name"));
                s.setLoai(rs.getString("Loại"));
                s.setSoluong(rs.getInt("Số lượng"));
                s.setGia(rs.getInt("Giá"));
                s.setHinhAnh(rs.getString("Hình ảnh"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public void DeleteSP(int ID){
        String sql="DELETE FROM tblsanpham WHERE ID=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ID);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void AddSP(sanpham s){
        String sql = "INSERT INTO tblsanpham ([Mã sản phẩm], [Name], [Loại], [Số lượng], [Giá], [Hình ảnh]) VALUES (?, ?, ?, ?, ?, ?)";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1,s.getMasp());
             ps.setString(2,s.getTensp());
             ps.setString(3,s.getLoai());
             ps.setInt(4,s.getSoluong());
             ps.setInt(5,s.getGia());
             ps.setString(6,s.getHinhAnh());
             ps.executeUpdate();
} catch (Exception e) {
    e.printStackTrace();
         }
     }
   public void updateSPQuantity(String masp, int newQuantity) {
    String sql = "UPDATE tblsanpham SET [Số lượng] = ? WHERE [Mã sản phẩm] = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, newQuantity);
        ps.setString(2, masp);
        ps.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
   public sanpham getProductById(String masp) {
    String sql = "SELECT [Mã sản phẩm], [Số lượng] FROM tblsanpham WHERE [Mã sản phẩm] = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, masp);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            String idsp = rs.getString("Mã sản phẩm");
            int quantity = rs.getInt("Số lượng");
            return new sanpham(idsp, quantity);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}
   public void update1SPQuantity(String masp, int newQuantity) {
    String sql = "UPDATE tblsanpham SET [Số lượng] = ? WHERE [Mã sản phẩm] = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, newQuantity);
            ps.setString(2, masp);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Cap nhat so luong thanh cong cho ma san pham: " + masp);
            } else {
                System.out.println("Khong co san pham nao duoc cap nhat voi ma san pham: " + masp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi khi cap nhat so luong cho ma san pham: " + masp + " - " + e.getMessage());
        }
}
    
    public static void main(String[] args) {
        DAOsp dao = new DAOsp();
        ArrayList<sanpham> invoiceList = dao.getListSP();
        // Use the invoiceList as needed, e.g., print the details
        for (sanpham Sanpham : invoiceList) {
            System.out.println(Sanpham);
        }
    }
 
}