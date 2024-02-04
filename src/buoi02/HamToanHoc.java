/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi02;

/**
 *
 * @author admin
 */
public class HamToanHoc {
    public static void main(String[] args) {
        double a = 4.5;
        double b = -3;
        double c ;
        //Hàm toán học
        c = Math.max(a, b);
        System.out.println("Gia tri max = "+c);
        c = Math.ceil(a);
        System.out.println("can tren la "+c);
        c = Math.floor(a);
        System.out.println("can duoi la "+c);
        c = Math.pow(a,3);
        System.out.println("lap phuong a"+c);
        c = Math.sqrt(a);
        System.out.println("can bac 2 a "+c);
        c = Math.abs(b);
        System.out.println("Tri tuyet doi cua b ="+c);
        c = Math.round(a);
        System.out.println("Lam tron so a "+c);
        c = Math.random();
        System.out.println("Random so tu 0 den 1 "+c);
        
    }
}
