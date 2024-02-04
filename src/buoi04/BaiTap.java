/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi04;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BaiTap {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double thunhap,thue;
       
        
        System.out.print("Nhập lương của bạn để tính thuế thu nhập: ");
        thunhap = nhap.nextDouble();
        if (thunhap <= 9000000) {
            thue = 0; 
        } else if (thunhap <= 15000000) {
            thue = (thunhap - 9000000) * 0.1; 
        } else if (thunhap <= 30000000) {
            thue = (15000000 - 9000000) * 0.1 + (thunhap - 15000000) * 0.15; 
        } else {
            thue = (15000000 - 9000000) * 0.1 + (30000000 - 15000000) * 0.15 + (thunhap - 30000000) * 0.2; 
        }
         
         System.out.println("Tổng nhận sau thuế :"+thue);       
    }
}
