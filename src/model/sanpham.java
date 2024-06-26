package model;

/**
 *
 * @author ADMIN
 */
public class sanpham {

    static sanpham get(int selectedIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int ID;
    private String Masp;
    private String Tensp;
    private String Loai;
    private int Soluong;
    private int Gia;
    private String HinhAnh;
   

    public sanpham(String Masp, String Tensp, String Loai, int Soluong, int Gia, String HinhAnh) {
        this.Masp = Masp;
        this.Tensp = Tensp;
        this.Loai = Loai;
        this.Soluong = Soluong;
        this.Gia = Gia;
        this.HinhAnh = HinhAnh;
    }
    public sanpham() {
   
}

    public sanpham(int ID, String Masp, String Tensp, String Loai, int Soluong, int Gia, String HinhAnh) {
        this.ID = ID;
        this.Masp = Masp;
        this.Tensp = Tensp;
        this.Loai = Loai;
        this.Soluong = Soluong;
        this.Gia = Gia;
        this.HinhAnh = HinhAnh;
    }
    public sanpham(String Masp, int Soluong) {
        this.Masp = Masp;
        this.Soluong = Soluong;
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

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
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
    
     public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String toString() {
        return "sanpham{" + "masp='" + Masp + '\'' + ", hinhanh='" + HinhAnh + '\'' + '}';
    }
}
    
