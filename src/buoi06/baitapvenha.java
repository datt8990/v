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
public class baitapvenha {
    public static void main(String[] args) {
        int n;
        boolean ok = true;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên để kiểm tra:");
        n = nhap.nextInt();
        for (int i = 2; i < n-1; i++) {
             if (n%i==0) {
                ok = false;
                break;
            }
             i++;
        }
        if (ok == true) {
            System.out.println(n+" là số nguyên tố.");
            
        } else {
            System.out.println(n+" không phải số nguyên tố.");
        }
    }
}
