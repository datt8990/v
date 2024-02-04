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
public class BaiTapVeNha2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double canh1,canh2,ketqua1,ketqua2,canhnhonhat;
        
        System.out.print("Nhap do dai canh 1:");
        canh1 = nhap.nextDouble();
        System.out.print("Nhap do dai canh 2:");
        canh2 = nhap.nextDouble();
        ketqua1 = (canh1 + canh2)*2;
        ketqua2 = canh1 * canh2;
        canhnhonhat = Math.min(canh1,canh2);
        System.out.printf("%.2f la chu vi cua hinh \n",ketqua1);
        System.out.printf("%.2f la dien tich cua hinh \n",ketqua2);
        System.out.println("Canh nho nhat la: "+canhnhonhat);
    }
    
}
