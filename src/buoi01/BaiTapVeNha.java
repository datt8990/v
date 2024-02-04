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
public class BaiTapVeNha {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String hoTen;
        double diemTB;
        System.out.print("Nhap ho va ten sinh vien: ");
        hoTen = nhap.nextLine();
        System.out.print("Nhap dtb cua sinh vien: ");
        diemTB = nhap.nextDouble();
        System.out.printf("%s %.2f diem ",hoTen,diemTB);
        
        
    }
    
}
