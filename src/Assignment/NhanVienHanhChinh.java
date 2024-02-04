/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class NhanVienHanhChinh extends NhanVien {

    ArrayList<NhanVien> nhanViens = new ArrayList<>();

    public ArrayList<NhanVien> getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(ArrayList<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    public NhanVienHanhChinh(Double luong, String maNV, String hoTen) {
        super(luong, maNV, hoTen);
    }

    public NhanVienHanhChinh() {
    }

    public ArrayList<NhanVien> Luong() {
        return Luong();
    }

    @Override
    public void xuatTT() {
        super.xuatTT();
    }

}
