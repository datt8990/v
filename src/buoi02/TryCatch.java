/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi02;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TryCatch {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int soInt=3;
        //nhap
        System.out.print("Nhap so nguyen:");
        try {
            //đưa nội dung cần kiểm soát vào
            soInt = Integer.parseInt(nhap.nextLine());
        } catch (Exception e) {
            //nếu có lỗi thì thực hiện nội dung tại đây
            System.out.println("Nhập dữ liệu sai");
        }
       
        
        //in
        System.out.println("In ra so vua nhap "+soInt);
    }
}
