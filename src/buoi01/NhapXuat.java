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
public class NhapXuat {
    public static void main(String[] args) {
        //tao doi tuong scanner => dung nhap du lieu
        Scanner nhap = new Scanner(System.in);
        //Khai bao bien
        String hoTen;
        int tuoi;
        double diemTB;
        //nhap dl vao tu ban phim
        System.out.print("Nhap ten: ");
        hoTen = nhap.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = nhap.nextInt();
        System.out.print("Nhap diem TB: ");
        diemTB = nhap.nextDouble();
        //in ra mh
        System.out.println("Ten la:"+hoTen);
        System.out.println("Tuoi la :"+tuoi);
        System.out.printf("Diem TB la: %.2f\n ",diemTB);
        
    }
    
}
