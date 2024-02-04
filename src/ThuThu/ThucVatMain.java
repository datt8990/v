/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuThu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ThucVatMain {

    public static void main(String[] args) {
        ThucvatService hi = new ThucvatService();
        ArrayList<ThucVat> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            int chon;

            System.out.println("1.Nhập thông tin thực vật: ");
            System.out.println("2.Xuất thông tin thực vật: ");
            System.out.println("3.Thoát! ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    String check;
                    do {
                        ThucVat a = new ThucVat();
                        a.NhapThongTin();
                        hi.Nhaptt(a);
                        System.out.println("Bạn có muốn nhập nữa không? y/n");
                        check = sc.nextLine();
                        sc.nextLine();
                        break;

                    } while (check.equalsIgnoreCase("y"));
                    break;
                case 2:
                    list = hi.Xuattt();
                    for (ThucVat thucVat : list) {
                        thucVat.InThongTin();
                    }
                    break;
                case 3:
                    System.exit(0);

                default:
                    System.out.println("Không có trong lựa chon");
            }
        }
    }
}
