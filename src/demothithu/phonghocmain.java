/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demothithu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class phonghocmain {

    public static void main(String[] args) {
        Phonghocservice phsv = new Phonghocservice();
        ArrayList<Phonghoc> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int chon;
            System.out.println("-----------------------------");
            System.out.println("1.Nhập danh sách phòng học");
            System.out.println("2.Xuất danh sách phòng học");
            System.out.println("3.Tìm và sửa theo tên");
            System.out.println("4.Sắp xếp phòng theo diện tích tăng dần");
            System.out.println("Nhập vào chức năng: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    String check;
                    do {
                        System.out.println("1.Nhap danh sach phong hoc");

                        Phonghoc pc = new Phonghoc();
                        pc.nhap();
                        phsv.nhapphonghoc(pc);
                        System.out.println("Ban co muon nhap nưa khong Y/N: ");
                        check = sc.nextLine();
                        sc.nextLine();
                    } while (check.equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println("Danh sach da nhap: ");
                    list = phsv.xuatphonghoc();
                    for (Phonghoc aa : list) {
                        aa.xuat();
                    }
                    break;

            }

        }
    }
}
