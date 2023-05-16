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
public class main {
     public static void main(String[] arg) 
    {
    Danhsach l = new Danhsach();
        int n ;
        Scanner sc = new Scanner(System.in);
        do {
        	
        	System.out.println(" chon 1 : nhap thong tin dat ");
        	System.out.println(" chon 2 : xuat thong tin dat ");
        	
        	
        n =sc.nextInt();
        switch (n)
        {
        case 1: l.nhap();break;
        
        case 2: l.xuat();break;
        
        }
        }
        while(true);
    	
    }
}
