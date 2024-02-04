/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi03;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ToanTu3Ngoi {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int a;
        int b,max;
        System.out.print("Nhap a= ");
        a=nhap.nextInt();
        System.out.print("Nhap b= ");
        b=nhap.nextInt();
        max = a>b?a:b;
        System.out.println("Số max là:"+max);
    }
}
