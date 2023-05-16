/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author thaih
 */
public class KhachHang {
    private int makhachhang;
    private int soluong;
    private double dongia;
    private double thanhtien;
    private String ngayHD;
    private String hotenKH;
            

    public KhachHang(){
        
    }

    public KhachHang(int makhachhang, int soluong, double dongia, double thanhtien, String ngayHD, String hotenKH) {
        this.makhachhang = makhachhang;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
        this.ngayHD = ngayHD;
        this.hotenKH = hotenKH;
    }

    public int getMaKhachhang() {
        return makhachhang;
    }

    public void setMaKhachhang(int khachhang) {
        this.makhachhang = khachhang;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public String getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }

    public String getHotenKH() {
        return hotenKH;
    }

    public void setHotenKH(String hotenKH) {
        this.hotenKH = hotenKH;
    }
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng:");
        makhachhang = scanner.nextInt();
        System.out.println("Họ và tên khách hàng:");
        hotenKH = scanner.next();
        System.out.println("Ngày Lập hóa đơn:");
        ngayHD = scanner.next();
        System.out.println("Số lượng (KW):");
        soluong = scanner.nextInt();
        System.out.println("Đơn giá:");
        dongia = scanner.nextDouble();   
    }

    @Override
    public String toString() {
        return "KhachHang{" + "makhachhang=" + makhachhang + ", soluong=" + soluong + ", dongia=" + dongia + ", thanhtien=" + thanhtien + ", ngayHD=" + ngayHD + ", hotenKH=" + hotenKH + '}';
    }
    
    
    
    
    
    
}
