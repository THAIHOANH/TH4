/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author thaih
 */
public class GiaoDichDat extends GiaoDich {
    private String loaidat;
    
    public GiaoDichDat(){
        
    }
    public GiaoDichDat(String loaidat){
        super();
        this.loaidat = loaidat;
    }
    public String getLoaiDat(){
        return loaidat;
    }
    public void setLoaiDat(String loaidat){
        this.loaidat = loaidat;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập loại đất (A/B/C):");
        loaidat = scanner.nextLine();
        
    }

    @Override
    public String toString() {
        return super.toString() + "GiaoDichDat{" + "loaidat=" + loaidat + '}';
    }
    
    
}
