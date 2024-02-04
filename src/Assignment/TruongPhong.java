/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author admin
 */
public class TruongPhong extends NhanVien {

    private Double TrachNhiem;

    public Double getTrachNhiem() {
        return TrachNhiem;
    }

    public void setTrachNhiem(Double TrachNhiem) {
        this.TrachNhiem = TrachNhiem;
    }

    public TruongPhong(Double TrachNhiem, Double luong, String maNV, String Hoten) {
        super(luong, maNV, Hoten);
        this.TrachNhiem = TrachNhiem;
    }

    public TruongPhong(Double TrachNhiem) {
        this.TrachNhiem = TrachNhiem;
    }

    public TruongPhong() {
    }

    @Override
    public Double getThuNhap() {
        return super.getLuong() + this.TrachNhiem;
    }

    @Override
    public void xuatTT() {
        super.xuatTT();
        System.out.printf("Tiền trách nhiệm: %.2f\n", TrachNhiem);
    }
}
