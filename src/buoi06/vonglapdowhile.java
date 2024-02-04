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
//cho người dùng nhập vào điểm từ 0 -10
public class vonglapdowhile {
    public static void main(String[] args) {
       int diem=0;
        do {   
            Scanner nhap = new Scanner(System.in);
            System.out.println("Mời nhập điểm:");
            diem = nhap.nextInt();
            System.out.println("Điểm là:"+diem);
            
        } while (diem <0||diem>10);
    }
}
