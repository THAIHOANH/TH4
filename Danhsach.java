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
    public void nhapnha(){
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
    public void xuatnha(){
        System.out.println("Thông tin các giao dich nhà");
        for (int i = 0; i< arrGiaoDichNha.size(); i++){
            System.out.println(arrGiaoDichNha.get(i).toString());
            
        }
    }
    void tongtien(){
        for (int i=0; i<arrGiaoDichDat.size();i++){
            if(arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("A")){
                tongtiengiaodichdat += arrGiaoDichDat.get(i).getDienTich()*arrGiaoDich
            }
        }
    }
    
}
