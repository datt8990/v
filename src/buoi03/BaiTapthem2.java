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
public class BaiTapthem2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double a;
        double b;
        double nghiem;
        System.out.print("Nhập vào 2 số a và b bất kì : ");
        a = nhap.nextDouble();
        b = nhap.nextDouble();
        System.out.println(a+"x"+"+"+b+" = 0");
        if(a==0){
            if(b!=0){
            System.out.println("Pt vô nghiệm");
            }else{
            System.out.println("Pt có vô số nghiệm");
            }
            
        }else{
            nghiem = -b/a;
            System.out.println("Pt có nghiệm "+nghiem);
        }
            
        }
        
        
    }

