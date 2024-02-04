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
public class BaiTapVeNha4 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int chon;
        do{
        System.out.println("----MENU----");
        System.out.println("1.Giải phương trình bậc nhất.");
        System.out.println("2.Giải phương trình bậc hai.");
        System.out.println("3.Tính tiền điện.");
        System.out.println("4.Kết thúc!.");
        chon = nhap.nextInt();
        switch(chon){
            case 1:
                System.out.println("Bạn đã chọn giải phương trình bậc nhất.");
                break;
            case 2:
                System.out.println("Bạn đã chọn giải phương trình bậc hai.");
                break;
            case 3:
                System.out.println("Bạn đã chọn tính tiền điện.");
                break;    
                
        }
    }while(chon!=4&&chon>=1&&chon<=3);
}
}    
