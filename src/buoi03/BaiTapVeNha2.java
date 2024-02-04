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
public class BaiTapVeNha2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double a,b,c,delta,x,x1,x2,nghiem;
        System.out.print("Nhập vào hệ số a , b , c :");
        a = nhap.nextDouble();
        b = nhap.nextDouble();
        c = nhap.nextDouble();
        if(a==0){
            nghiem = -b/a;
            System.out.println("Nghiệm khi a = 0 là :"+nghiem);
        }else{
            delta = Math.pow(b,2)-4*a*c;
            if(delta<0){
                System.out.println("PT vô nghiệm");
            }else if(delta==0){
                x= -b/(2*a);
                System.out.println("PT có nghiệm kép là:"+x);
            }else{
                x1 = (-b+Math.sqrt(delta))/(2*a);
                x2 = (-b-Math.sqrt(delta))/(2*a);
                System.out.println("PT có nghiệm X1 là : "+x1);
                System.out.println("PT có nghiệm X2 là : "+x2);
                
            }
            }
        }
        
    }

