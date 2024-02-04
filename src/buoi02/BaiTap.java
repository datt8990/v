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
public class BaiTap {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double a,b,c,max,min;
        System.out.print("Nhap vao so a :");
        a = nhap.nextDouble();
        System.out.print("Nhap vao so b :");
        b = nhap.nextDouble();
        min = Math.min(a,b);
        max = Math.max(a,b);
        c = Math.random()*(max-min)+min;
        
        System.out.println("Gia tri bat ki tu a den b "+c);
        
        
    }
    
}
