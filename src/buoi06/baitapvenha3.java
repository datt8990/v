/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi06;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class baitapvenha3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        String tenSv[];
        double diem[];
        System.out.print("Nhập số lượng sinh viên: ");
        n = nhap.nextInt();
        nhap.nextLine();
        tenSv = new String[n];
        diem = new double[n];

        for (int i = 0; i < tenSv.length; i++) {
            System.out.println("Nhập tên sinh viên thứ " + (i + 1) + ": ");
            tenSv[i] = nhap.nextLine();
        }
        for (int i = 0; i < diem.length; i++) {
            System.out.println("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
            diem[i] = nhap.nextDouble();
        }
        System.out.println("Mảng tên sinh viên: " + Arrays.toString(tenSv));
        System.out.println("Mảng điểm sinh viên: " + Arrays.toString(diem));
        sortSV(tenSv, diem);
        System.out.println("Thứ tự được sắp xếp là:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên "+tenSv[i] + ": " + diem[i]+" điểm");
            if(diem[i]>=9){
                System.out.println("Học lực: Xuất sắc");
            }else if(diem[i]>=7.5){
                System.out.println("Học lực: Giỏi");
            }else if(diem[i]>=6.5){
                System.out.println("Học lực: Khá");  
            }else if(diem[i]>=5){
                System.out.println("Học lực: Trung bình");  
            }else{
                System.out.println("Học lực: Yếu");
            }
            System.out.println();
        }
    }

    public static void sortSV(String tenSv[], double diem[]) {
        for (int i = 0; i < tenSv.length; i++) {
            for (int j = i + 1; j < tenSv.length; j++) {
                if (diem[i] > diem[j]) {
                    double tam = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tam;

                    String tamTen = tenSv[i];
                    tenSv[i] = tenSv[j];
                    tenSv[j] = tamTen;
                }
            }
        }
    }
}