/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thaih
 */
public class Danhsach {
    ArrayList<GiaoDichNha> arrGiaoDichNha = new ArrayList<>();
    ArrayList<GiaoDichDat> arrGiaoDichDat = new ArrayList<>();
    int sogiaodichdat = 0 , sogiaodichnha = 0;
    long tongtiengiaodichdat = 0, trungbinhthanhtien = 0;
    Scanner scanner = new Scanner(System.in);
    public void nhapdat(){
        System.out.println("Nhập số giao dịch đất:");
        sogiaodichdat = scanner.nextInt();
        System.out.println("Nhập thông tin giao dịch đất:");
        for (int i  =0; i < sogiaodichdat; i++){
            System.out.println("Nhập thông tin giao dịch đất thứ"+ (i+1)+":");
            GiaoDichDat giaodichdat = new GiaoDichDat();
            giaodichdat.nhap();
            arrGiaoDichDat.add(giaodichdat);
        
    }
    }
    public void nhap(){
        System.out.println("Nhập số giao dịch nhà:");
        sogiaodichnha = scanner.nextInt();
        System.out.println("Nhập thông tin giao dịch nhà:");
        for (int i = 0 ; i< sogiaodichnha; i ++){
            System.out.println("Nhập thông tin giao dịch nhà thứ"+ (i+1)+":");
            GiaoDichNha giaodichnha = new GiaoDichNha();
            giaodichnha.nhap();
            arrGiaoDichNha.add(giaodichnha);
        }
    }
    public void xuat(){
        System.out.println("Thông tin các giao dich nhà");
        for (int i = 0; i< arrGiaoDichNha.size(); i++){
            System.out.println(arrGiaoDichNha.get(i).toString());
            
        }
    }
    void tongtien(){
        for (int i=0; i<arrGiaoDichDat.size();i++){
            if(arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("A")){
                tongtiengiaodichdat += arrGiaoDichDat.get(i).getDienTich() * 
                    arrGiaoDichDat.get(i).getDonGia() * 1.5;
            } 
            else if (arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("B") || 
                    arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("C"))
            {
                tongtiengiaodichdat += arrGiaoDichDat.get(i).getDienTich() * 
                    arrGiaoDichDat.get(i).getDonGia();
            }
        }
        }
        void tbinhdat() {
        trungbinhthanhtien = tongtiengiaodichdat / (arrGiaoDichDat.size());
        System.out.println("Trung bình thành tiền của giao dịch đất = " + trungbinhthanhtien);

        // xuất ra các giao dịch của tháng 9 năm 2013
        System.out.println("Các giao dịch đất của tháng 9 năm 2013: ");
        for (int i = 0; i < arrGiaoDichDat.size(); i++) {
            String[] dateGiaoDichDat = arrGiaoDichDat.get(i).getNgayGiaoDich().split("/");
            if (dateGiaoDichDat[1].equals("9") && dateGiaoDichDat[2].equals("2013")) {
                System.out.println(arrGiaoDichDat.get(i).toString());
            }
        }

        System.out.println("Các giao dịch nhà của tháng 9 năm 2013: ");
        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
            String[] dateGiaoDichNha = arrGiaoDichNha.get(i).getNgayGiaoDich().split("/");
            if (dateGiaoDichNha[1].equals("9") && dateGiaoDichNha[2].equals("2013")) {
                System.out.println(arrGiaoDichNha.get(i).toString());
            }
        }
    }
    
}
