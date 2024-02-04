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
public class CautrucElseIf {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double diemtb;
        System.out.print("Nhập vào điểm trung bình:");
        diemtb = nhap.nextDouble();
    if(diemtb>=9){
            System.out.println("HS XS");
    }else if(diemtb >=8){
            System.out.println("HS Gioi");
    }else if(diemtb >=6){
            System.out.println("HS Kha");
    }else{
            System.out.println("HS TB");
    }
    }
    }