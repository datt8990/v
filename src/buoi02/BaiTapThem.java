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
public class BaiTapThem {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double canh,ketqua;
        System.out.print("Nhap vao canh cua hinh lap phuong:");
        canh = nhap.nextDouble();
        ketqua = Math.pow(canh,3);
        System.out.println("The tich cua hinh lap phuong la :"+ketqua);
    }
}
