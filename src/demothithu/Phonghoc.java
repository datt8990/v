/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demothithu;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Phonghoc {

    private double chieudai;
    private double chieurong;
    private String tenphong;

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public Phonghoc() {
    }

    public Phonghoc(double chieudai, double chieurong, String tenphong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
        this.tenphong = tenphong;
    }

    public void nhap() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Chieu dai: ");
        chieudai = nhap.nextDouble();
        System.out.println("Chieu rong: ");
        chieurong = nhap.nextDouble();
        nhap.nextLine();
        System.out.println("ten phong: ");
        tenphong = nhap.nextLine();

    }

    public void xuat() {
        System.out.println("Chieu dai: " + chieudai);
        System.out.println("Chieu rong: " + chieurong);
        System.out.println("ten phong: " + tenphong);
    }

}
