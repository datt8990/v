/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuThu;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ThucVat {

    private String MaThucVat;
    private String TenThucVat;
    private float KhoiLuong;
    Scanner sc = new Scanner(System.in);

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getMaThucVat() {
        return MaThucVat;
    }

    public void setMaThucVat(String MaThucVat) {
        this.MaThucVat = MaThucVat;
    }

    public String getTenThucVat() {
        return TenThucVat;
    }

    public void setTenThucVat(String TenThucVat) {
        this.TenThucVat = TenThucVat;
    }

    public float getKhoiLuong() {
        return KhoiLuong;
    }

    public void setKhoiLuong(float KhoiLuong) {
        this.KhoiLuong = KhoiLuong;
    }

    public ThucVat(String MaThucVat, String TenThucVat, float KhoiLuong) {
        this.MaThucVat = MaThucVat;
        this.TenThucVat = TenThucVat;
        this.KhoiLuong = KhoiLuong;
    }

    public ThucVat() {
    }

    public void NhapThongTin() {

        System.out.println("Nhập mã thực vật: ");
        MaThucVat = sc.nextLine();
        System.out.println("Nhập tên thực vật: ");
        TenThucVat = sc.nextLine();
        System.out.println("Nhập khối lượng thực vật(kg): ");
        KhoiLuong = sc.nextInt();

    }

    public void InThongTin() {
        System.out.println("Mã: " + MaThucVat);
        System.out.println("Tên: " + TenThucVat);
        System.out.println("Khối lượng: " + KhoiLuong + " kg");

    }
}
