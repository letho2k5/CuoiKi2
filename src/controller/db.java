/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ADMIN
 */
public class db {

    private Connection con;

    Connection mycon() {
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-R4TO9PD\\MSSQLSERVER01;databaseName=Login;user=sa;password=12345;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(dbURL);
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
