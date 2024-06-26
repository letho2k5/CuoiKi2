/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class SanphamCT {
    private int ID;
    private String Masp;
    private int Soluong;
    private int Gia;
    
    public SanphamCT() {
        }

    public SanphamCT(String Masp, int Soluong, int Gia) {
        this.Masp = Masp;
        this.Soluong = Soluong;
        this.Gia = Gia;
    }

    public SanphamCT(int ID, String Masp, int Soluong, int Gia) {
        this.ID = ID;
        this.Masp = Masp;
        this.Soluong = Soluong;
        this.Gia = Gia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMasp() {
        return Masp;
    }

    public void setMasp(String Masp) {
        this.Masp = Masp;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }
    
}
