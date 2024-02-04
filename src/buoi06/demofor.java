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
public class demofor {
    public static void main(String[] args) {
        int bangcuuchuong;
        Scanner nhap = new Scanner(System.in);
        bangcuuchuong = nhap.nextInt();
        if(bangcuuchuong >=1 && bangcuuchuong <=10){
            for (int i = 1 ; i<=10;i++ ){
                System.out.printf("%2d * %2d = %2d%n",bangcuuchuong,i,bangcuuchuong*i);
            }
        }
    }
}
