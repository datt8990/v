/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi01;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ThongTinLop {
    public static void main(String[] args) {
        /*
        -so luong sv
        -ten lop
        -ten mon hoc
        */
        
        Scanner nhap = new Scanner(System.in);
        int soLuongSv;
        String tenLop, tenMonHoc;
        System.out.print("So luong sv cua lop :");
        soLuongSv = nhap.nextInt();
        nhap.nextLine();
        System.out.print("Ten lop hoc :");
        tenLop = nhap.nextLine();
        System.out.print("Ten mon hoc :");
        tenMonHoc = nhap.nextLine();
        System.out.println("So luong sv la :"+soLuongSv);
        System.out.println("Ten lop :"+tenLop);
        System.out.println("Ten mon la :"+tenMonHoc);
        
    }
    
}
