/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi05;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class DemoSwitchCase {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int chon;
        int a= 5 , b=7;
        System.out.println("MÁY TÍNH CÁ NHÂN");
        System.out.println("-------------------");
        System.out.println("1.Cộng");
        System.out.println("2.Trừ");
        System.out.println("3.Kết thúc");
        System.out.println("--------------------");
        System.out.println("Mời bạn chọn chức năng:");
        chon = nhap.nextInt();
        switch(chon){
            case 1:
                System.out.println("Cộng");
                cong();
                
                break;
            case 2:
                System.out.println("Trừ");
                tru();
                break;
            case 3:
                System.out.println("Kết thúc");
                System.exit(0);
                break;
        }
    }
      static void cong(){
                int tong,a=5,b=7;
                tong = a+b;
                System.out.println("Tong la:"+tong);
                System.out.println("Bạn có muốn tiếp tục nhập? Yes or No?");
                
      }
      static void tru(){
          int hieu,a=5,b=7;
                hieu = b -a;
                System.out.println("Hieu la:"+hieu);
      }
    }

