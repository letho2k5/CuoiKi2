/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Hoadon {
    private int MaHD;
    private String TKH;
    private int SĐT;
    private String Diachi;
    private String DateOrder;
    private int Thanhtien;
    
    public Hoadon() {
        }
    
      public Hoadon(int STT,String TKH,int SĐT,String Diachi, String DateOrder, int Thanhtien) {
        this.MaHD = MaHD;
        this.TKH = TKH;
        this.SĐT = SĐT;
        this.Diachi = Diachi;
        this.DateOrder = DateOrder;
        this.Thanhtien = Thanhtien;
    }
    public int getMaHD() {
        return MaHD;
    }

    /**
     *
     * @param MaHD
     */
    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }
     public String getTKH() {
        return TKH;
    }

    public void setTKH(String TKH) {
        this.TKH = TKH;
    }
    public int getSĐT() {
        return SĐT;
    }

    public void setSĐT(int SĐT) {
        this.SĐT = SĐT;
    }
      public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }
    public String getDateOrder() {
        return DateOrder;
    }

    public void setDateOrder(String DateOrder) {
        this.DateOrder = DateOrder;
    }

    public int getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(int Thanhtien) {
        this.Thanhtien = Thanhtien;
    }

    void setMasp(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setTensp(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setLoai(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setSoluong(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setGia(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
