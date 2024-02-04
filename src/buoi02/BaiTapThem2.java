/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi02;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BaiTapThem2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double a,b,c,delta,ketqua;
        System.out.println("Nhap voa so a b c de tinh can bac 2:");
        a = nhap.nextDouble();
        b = nhap.nextDouble();
        c = nhap.nextDouble();
        delta = Math.pow(b,2)-4*a*c;
        ketqua = Math.sqrt(delta);
        System.out.println("Can bac 2 cua delta la: "+ketqua);
        
    }
}
