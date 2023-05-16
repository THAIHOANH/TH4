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
public class GiaoDichNha extends GiaoDich {
    private String loainha;
    private String diachi;
    private  int choose;
    public GiaoDichNha(){
        super();
    }
    public GiaoDichNha(String loainha, String diachi){
        super();
        this.loainha = loainha;
        this.diachi= diachi;
        
    }
    public String getLoaiNha(){
        return loainha;
    }
    public void setLoaiNha(String loainha){
        this.loainha = loainha;
    }
    public String getDiaChi(){
        return diachi;
    }
    public void setDiaChi(String diachi){
        this.diachi = diachi;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập địa chỉ:");
        diachi = scanner.nextLine();
        System.out.println("Nhập loại nhà:");
        loainha = scanner.nextLine();
        switch(choose){
            case 0: 
                loainha = "cao cấp ";
                break;
            case 1:
                loainha = "thường";
                break;
            default:
                System.out.println("lựa chọn không hợp lệ.");
                break;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "GiaoDichNha{" + "loainha=" + loainha + ", diachi=" + diachi + '}';
    }
    
    
}
