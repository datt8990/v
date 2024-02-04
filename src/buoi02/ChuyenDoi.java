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
public class ChuyenDoi {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double diemTb;
        int tuoi;
        String hoTen;
        
        System.out.print("Nhap tuoi:");
        //tuoi = nhap.nextInt();
        tuoi = Integer.parseInt(nhap.nextLine());
        System.out.print("Nhap diem trung binh :");
        diemTb = Double.parseDouble(nhap.nextLine());
        System.out.print("Nhap vao ho ten:");
        hoTen = nhap.nextLine();
        
        System.out.println(hoTen+" - "+tuoi+"va "+diemTb+"Diem");
    }
}
