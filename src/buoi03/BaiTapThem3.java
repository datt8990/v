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
public class BaiTapThem3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int tuoiban,tuoinyc;
        int hieu,tong;
        double sodu;
        System.out.print("Nhập vào tuổi của bạn: ");
        tuoiban = nhap.nextInt();
        System.out.print("Nhập vào tuổi của nyc bạn: ");
        tuoinyc = nhap.nextInt();
        if(tuoinyc>50) {
            hieu = tuoinyc - tuoiban;
            System.out.println("Không lo tiền học lại.");
            System.out.println(hieu);
        }else if(tuoinyc>30){
            tong = tuoinyc + tuoiban;
            System.out.println("Không lo tiền ăn.");
            System.out.println(tong);
        }else if(tuoinyc == tuoiban){
            System.out.println("Nợ môn nên bị bỏ");
        }else{
            sodu = tuoiban%tuoinyc;
            System.out.println(sodu);
        }
        }
        
    }

