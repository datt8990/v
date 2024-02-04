/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi06;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class NewClass1 {
    public static void main(String[] args) {
        int n;
        int soluongphantu[];
        int tong=0;
        Scanner nhap = new Scanner(System.in);
                    System.out.println("Nhập số lượng mảng :");
                    n = nhap.nextInt();
                    nhap.nextLine();
                    soluongphantu = new int[n];
                    
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập phần tử thứ " +i+ ":");
                        soluongphantu[i] = nhap.nextInt();
                    } 
                    for (int i = 0; i < n; i++) {
                     tong += soluongphantu[i];
       }

                      double trungBinhCong =(double) tong / n;
                      System.out.println("Trung bình cộng các phần tử trong mảng: " + trungBinhCong);
        
    }
}
