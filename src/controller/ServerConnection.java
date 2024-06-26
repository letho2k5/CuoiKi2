package controller;

import model.sanpham;
import model.Hoadon;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;


public class ServerConnection {
	private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 8888;
    private  PrintWriter out;
    public static void sendspInfoToServer(Hoadon hd) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            out.println("THEM HOA DON"); 
            out.println("Ten khach hang: "+hd.getTKH()+", Thanh tien: "+hd.getThanhtien());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void sendspUpdateToServer(sanpham sp) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            out.println("THEM SAN PHAM"); 
            out.println("Ma san pham: "+sp.getMasp()+", So luong san pham: "+sp.getSoluong()+", Gia: "+sp.getGia());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void sendDeletedspToServer(sanpham deletedsp) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            out.println("XOA SAN PHAM");
            out.println("Da xoa san pham co ma: " + deletedsp.getMasp());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void sendDeletedhdToServer(Hoadon deletedhd) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            out.println("XOA HOA DON");
            out.println("Da xoa hoa don co STT: " + deletedhd.getMaHD());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
  