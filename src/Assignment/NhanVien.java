/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author admin
 */
public class NhanVien {

    private Double luong;

    private String maNV;

    private String HoTen;

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        this.HoTen = HoTen;
    }

    public NhanVien(Double luong, String maNV, String hoTen) {
        this.luong = luong;
        this.maNV = maNV;
        this.HoTen = hoTen;
    }

    public NhanVien() {
    }

    public Double getThuNhap() {
        return luong;
    }

    public Double getThueTN() {

        if (this.getThuNhap() < 9000000) {
            return this.getThuNhap() - this.getThuNhap();
        } else if (this.getThuNhap() <= 15000000) {
            return (this.getThuNhap() - 9000000) * 0.1;

        } else {
            return (15000000 - 9000000) * 0.1 + (this.getThuNhap() - 15000000) * 0.12;
        }
    }

    public void xuatTT() {

        System.out.println("Mã: " + maNV);
        System.out.println("Tên: " + HoTen);
        System.out.printf("Thu nhập: %.2f\n", this.getThuNhap());
        System.out.printf("Thuế thu nhập: %.2f\n", this.getThueTN());
        System.out.printf("Lương: %.2f\n", luong);
    }
}
