/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoslide6;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class demo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String hoTen = "";

        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        hoTen = hoTen.toUpperCase();//in hoa
        System.out.println("In hoa: " + hoTen);
        String[] tach = hoTen.split(" ");
        System.out.println("Họ: "+tach[0]);
        String ho = hoTen.substring(0, 2);
        System.out.println("Ho: "+ho);
    }
        
}
