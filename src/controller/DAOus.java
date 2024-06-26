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
import model.User;

/**
 *
 * @author ADMIN
 */
public class DAOus {
    private Connection conn;

    public DAOus() {
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-R4TO9PD\\MSSQLSERVER01;databaseName=Login;user=sa;password=12345;encrypt=true;trustServerCertificate=true";
            this.conn = DriverManager.getConnection(dbURL);
            System.out.println("Connected to the database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<User> getListUS() {
        ArrayList<User> list = new ArrayList<>();
        String sql = "SELECT * FROM [User]";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User s = new User();
                s.setID(rs.getInt("ID"));
                s.setUsername(rs.getString("User_name"));
                s.setPassword(rs.getString("Password"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
public void DeleteHD(int STT){
    String sql = "DELETE FROM Login WHERE STT=?";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,STT);
        ps.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
    }
}


    public static void main(String[] args) {
        DAOus dao = new DAOus();
        ArrayList<User> invoiceList = dao.getListUS();

        // Use the invoiceList as needed, e.g., print the details
        for (User user : invoiceList) {
            System.out.println(user);
        }
    }
}


