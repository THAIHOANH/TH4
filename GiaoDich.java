/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author thaih
 */
public class GiaoDich {
 private String magiaodich;
 private String ngaygiaodich;
 private long dongia;
 private float dientich;
 
 public GiaoDich(){
     super();
 }
 public GiaoDich(String magiaodich, String ngaygiaodich,long dongia, float dientich){
     super();
     this.magiaodich = magiaodich;
     this.ngaygiaodich = ngaygiaodich;
     this.dongia = dongia;
     this.dientich = dientich;
 }
 public String getMaGiaoDich(){
     return magiaodich;
 }
 public void setMaGiaoDich(String magiadich){
     this.magiaodich = magiaodich;
 }
 public String getNgayGiaoDich(){
     return ngaygiaodich;
 }
 public void setNgayGiaoDich(String ngaygiaodich){
     this.ngaygiaodich = ngaygiaodich;
 }
 public long getDonGia(){
     return dongia;
 }
 public void setDonGia(long dongia){
     this.dongia = dongia;
 }
 public float getDienTich(){
     return dientich;
 }
 public void setDienTich(float dientich){
     this.dientich = dientich;
 }
 
 public void nhap(){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Nhập mã giao dịch:");
     magiaodich = scanner.nextLine();
     System.out.println("Nhập ngày giao dịch(ngày,tháng,năm):");
     ngaygiaodich = scanner.nextLine();
     System.out.println("Nhập đơn giá:");
     dongia = scanner.nextLong();
     System.out.println("Nhập diện tích:");
     dientich = scanner.nextFloat();
 }

    @Override
    public String toString() {
        return "GiaoDich{" + "magiaodich=" + magiaodich + ", ngaygiaodich=" + ngaygiaodich + ", dongia=" + dongia + ", dientich=" + dientich + '}';
    }
 
 
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
