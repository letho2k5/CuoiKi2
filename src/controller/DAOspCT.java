/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import model.SanphamCT;

/**
 *
 * @author ADMIN
 */
public class DAOspCT {

    private static boolean SanphamCT;
     private Connection conn;

    public DAOspCT() {
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-R4TO9PD\\MSSQLSERVER01;databaseName=ctsanpham;user=sa;password=12345;encrypt=true;trustServerCertificate=true";
            this.conn = DriverManager.getConnection(dbURL);
            System.out.println("Connected to the database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public ArrayList<SanphamCT> getListSPCT() {
        ArrayList<SanphamCT> list = new ArrayList<>();
        String sql = "SELECT * FROM tblctsanpham"; // Adjust table name if needed
        try {
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanphamCT s = new SanphamCT();
                s.setID(rs.getInt("ID"));
                s.setMasp(rs.getString("Mã sản phẩm"));
                s.setSoluong(rs.getInt("Số lượng"));
                s.setGia(rs.getInt("Giá"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
     public void AddSP(SanphamCT s){
        String sql = "INSERT INTO tblctsanpham ([Mã sản phẩm], [Số lượng], [Giá]) VALUES (?, ?, ?)";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1,s.getMasp());
             ps.setInt(2,s.getSoluong());
             ps.setInt(3,s.getGia());
             ps.executeUpdate();
} catch (Exception e) {
    e.printStackTrace();
         }
     }
    public void DeleteSPCT(int ID){
        String sql="DELETE FROM tblctsanpham WHERE ID=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1, ID);
            ps.executeUpdate();
} catch (Exception e) {
    e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DAOspCT dao = new DAOspCT();
        ArrayList<SanphamCT> invoiceList = dao.getListSPCT();

        // Use the invoiceList as needed, e.g., print the details
        for (SanphamCT sanphamCT : invoiceList) {
            System.out.println(SanphamCT);
        }
//        for (SanphamCT sanphamCT : invoiceList) {
//            System.out.println("ID: " + sanphamCT.getID() +
//            ", Mã sản phẩm: " + sanphamCT.getMasp() +
//            ", Số lượng: " + sanphamCT.getSoluong() +
//            ", Giá: " + sanphamCT.getGia());
//        }
    }


   
}
