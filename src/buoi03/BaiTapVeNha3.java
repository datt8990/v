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
public class BaiTapVeNha3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double tien,sodien;
        System.out.print("Nhập vào số điện bạn sử dụng trong tháng :");
        sodien = nhap.nextDouble();
        if(sodien<1){
            System.out.println("Số điện không hợp lệ ");
        
        }else if(sodien<=50){
            tien = sodien*1000;
            System.out.println("Giá mỗi số điện là 1000 và số tiền you phải trả là :"+tien);
        }else{
            tien = sodien*1200;
            System.out.println("Giá mỗi số điện là 1200 và số tiền you phải trả là :"+tien);
        }
    }
}
