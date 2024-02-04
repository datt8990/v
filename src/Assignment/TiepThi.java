
package Assignment;


public class TiepThi extends NhanVien {

    private Double Doanhso;

    private Double HueHong;

    public Double getDoanhso() {
        return Doanhso;
    }

    public void setDoanhso(Double Doanhso) {
        this.Doanhso = Doanhso;
    }

    public Double getHueHong() {
        return HueHong;
    }

    public void setHueHong(Double HueHong) {
        this.HueHong = HueHong;
    }

    public TiepThi(Double Doanhso, Double HueHong, Double luong, String maNV, String Hoten) {

        super(luong, maNV, Hoten);
        this.Doanhso = Doanhso;
        this.HueHong = HueHong;
    }

    public TiepThi(Double Doanhso, Double HueHong) {

        this.Doanhso = Doanhso;
        this.HueHong = HueHong;
    }

    public TiepThi() {
    }

    @Override
    public Double getThuNhap() {
        return super.getLuong() + this.Doanhso + this.HueHong;
    }

    @Override
    public void xuatTT() {
        super.xuatTT();
        System.out.printf("Doanh số: %.2f\n", Doanhso);
        System.out.printf("Hoa hồng: %.2f\n", HueHong);
    }
}
