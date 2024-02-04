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
public class BaiTapVeNha4 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double tong,hieu,tich;
        double a,b,thuong;
        System.out.print("Nhap vao so a:");
        a = nhap.nextDouble();
        System.out.print("Nhap vao so b:");
        b = nhap.nextDouble();
        tong = a+b;
        hieu = a-b;
        tich = a*b;
        thuong = a/b;
        System.out.println("Tong: "+ tong +"Hieu: "+ hieu +"Tich: "+ tich);
        System.out.printf("Thuong la: %.2f",thuong);
        
    }
}
