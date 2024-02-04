/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi06;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class baitapvenha2 {
    public static void main(String[] args) {
         int n;
         int soluongphantu[];
         Scanner nhap = new Scanner(System.in);
            System.out.println("Nhập số lượng mảng :");
            n = nhap.nextInt();
            nhap.nextLine();
            soluongphantu = new int[n];
            for (int i = 0; i < n; i++) {
                    System.out.println("Nhập phần tử thứ " +(i+1)+ ":");
                    soluongphantu[i] = nhap.nextInt();
            } 
            System.out.println("Phần tử của mảng :"+Arrays.toString(soluongphantu));
            Arrays.sort(soluongphantu);
            System.out.println("Phần tử của mảng sau khi sắp xếp :"+Arrays.toString(soluongphantu));
            int min = soluongphantu[0];
            for (int i = 0; i < soluongphantu.length; i++) {
                if(min > soluongphantu[i]){
                    min = soluongphantu[i];
                }
                
            
        }
            System.out.println("Phần tử nhỏ nhất trong mảng là: "+min);
            int tong = 0;
            int so = 0;
            for (int i = 0; i < soluongphantu.length; i++) {
                if (soluongphantu[i]%3==0) {
                    tong +=soluongphantu[i];
                    so++;
                }
                
        }
                double tbc =(double) tong / so;
                System.out.println("Trung bình cộng của các số chia hết cho 3 là: "+tbc);
    }
}
