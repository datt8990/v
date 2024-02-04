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
public class BaiTapVeNha3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String hoTen,nghanhHoc;
        int so;
        System.out.print("Nhap ho va ten Ny cua ban: ");
        hoTen = nhap.nextLine();
        System.out.print("Nhap sdt ace cua Ny cua ban: ");
        so = nhap.nextInt();
        nhap.nextLine();
        System.out.print("Nhap nghanh hoc Ny cua ban: ");
        nghanhHoc = nhap.nextLine();
        
        System.out.printf("%s la ho ten NY ban va sdt ace cua ny ban la: %d \n",hoTen,so);
        System.out.println("Nghanh hoc cua ny ban la: "+nghanhHoc);
    }
}
