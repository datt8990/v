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
public class BaiTapVeNha1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double a,b,nghiem;
        System.out.print("Mời nhập 2 số a và b : ");
        a = nhap.nextDouble();
        b = nhap.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("PT vô số nghiệm");
            } else{
                System.out.println("PT vô nghiệm");
            }
        }else{
            nghiem = -b/a;
            System.out.println("Nghiệm của phương trình bậc nhất là :"+nghiem);
        }
    }
    
}
