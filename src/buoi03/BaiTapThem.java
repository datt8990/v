/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi03;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BaiTapThem {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String tenban,tenny,tenbo;
        int tuoiban,tuoiny,tuoibo;
        System.out.print("Nhập tên vào tuổi của bạn:");
        tenban=nhap.nextLine();
        tuoiban = Integer.parseInt(nhap.nextLine());
        System.out.print("Nhập tên vào tuổi của Ny bạn:");
        tenny=nhap.nextLine();
        tuoiny = Integer.parseInt(nhap.nextLine());
        System.out.print("Nhập tên vào tuổi của bố bạn:");
        tenbo=nhap.nextLine();
        tuoibo = Integer.parseInt(nhap.nextLine());
        if(tuoiban>15){
            System.out.println(tenban+" là tên của bạn và bạn "+tuoiban+" tuổi");
            System.out.println(tenny+" là tên của ny bạn và ny bạn "+tuoiny+" tuổi");
            System.out.println(tenbo+" là tên của bố bạn và bố bạn "+tuoibo+" tuổi");
        }else{
            System.out.println("... Không đủ 15+");
        }
    }
}
