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
public class BaiTapVeNha5 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int a,b;
        double ketqua;
        System.out.print("Nhap so nguyen duong a:");
        a = nhap.nextInt();
        System.out.print("Nhap so nguyen duong b:");
        b = nhap.nextInt();
       ketqua = a%b;
        System.out.println("So du cua phep chia ab la:"+ketqua);
    }
}
