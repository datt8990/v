/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class MenuMain {

    public static void main(String[] args) {

        ArrayList<NhanVien> arrNV = new ArrayList<>();

        int chon;

        do {

            Scanner nhap = new Scanner(System.in);

            System.out.println("---Menu---");
            System.out.println("1. Nhập danh sách nhân viên từ bàn phím.");
            System.out.println("2. Xuất danh sách nhân viên ra màn hình.");
            System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
            System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
            System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.");
            System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
            System.out.println("7. Sắp xếp nhân viên theo họ và tên.");
            System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
            System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất.");
            System.out.println("10.Kết thúc!.");
            System.out.println("Mời bạn chọn chức năng:");

            chon = nhap.nextInt();

            switch (chon) {

                case 1:
                    System.out.println("Bạn chọn chức năng 1.");
                    CN1(arrNV);
                    break;

                case 2:
                    System.out.println("Bạn đã chọn chức năng 2.");
                    CN2(arrNV);
                    break;

                case 3:
                    System.out.println("Bạn đã chọn chức năng 3.");
                    CN3(arrNV);
                    break;

                case 4:
                    System.out.println("Bạn đã chọn chức năng 4.");
                    CN4(arrNV);
                    break;

                case 5:
                    System.out.println("Bạn đã chọn chức năng 5.");
                    CN5(arrNV);
                    break;

                case 6:
                    System.out.println("Bạn đã chọn chức năng 6.");
                    CN6(arrNV);
                    break;

                case 7:
                    System.out.println("Bạn đã chọn chức năng 7.");
                    CN7(arrNV);
                    break;

                case 8:
                    System.out.println("Bạn đã chọn chức năng 8.");
                    CN8(arrNV);
                    break;

                case 9:
                    System.out.println("Bạn đã chọn chức năng 9.");
                    CN9(arrNV);
                    break;

                default:
                    System.out.println("Thoát khỏi chương trình!");
                    System.exit(0);

            }
        } while (true);
    }//end main

    static void CN1(ArrayList<NhanVien> arrNV) {

        Scanner sc = new Scanner(System.in);

        String check;

        do {

            System.out.println("Nhập mã NV: ");
            String maNV = sc.nextLine();
            System.out.println("Nhập tên NV: ");
            String tenNV = sc.nextLine();
            System.out.println("Nhập lương NV: ");
            Double luong = Double.parseDouble(sc.nextLine());
            System.out.println("Chức vụ: \n\t1.Trưởng Phòng \n\t2.Nhân Viên Tiếp Thị    \n\t3.Nhân Viên Hành Chính");
            int cv = Integer.parseInt(sc.nextLine());

            if (cv == 1) {
                System.out.println("Tiền trách nhiệm: ");
                Double trachNhiem = sc.nextDouble();
                NhanVien nv = new TruongPhong(trachNhiem, luong, maNV, tenNV);
                arrNV.add(nv);

            } else if (cv == 2) {
                System.out.println("Tiền doanh số: ");
                Double doanhSo = sc.nextDouble();
                System.out.println("Tiền hoa hồng: ");
                Double HueHong = sc.nextDouble();
                NhanVien nx = new TiepThi(doanhSo, HueHong, luong, maNV, tenNV);
                arrNV.add(nx);

            } else {
                NhanVien nn = new NhanVienHanhChinh(luong, maNV, tenNV);
                arrNV.add(nn);
            }

            System.out.println("Bạn có muốn nhập tiếp nữa không? y/n");
            check = sc.nextLine();
            sc.nextLine();

        } while (check.equalsIgnoreCase("y"));
    }//end nhap

    static void CN2(ArrayList<NhanVien> arrNV) {

        for (NhanVien nhanVien : arrNV) {
            nhanVien.xuatTT();

        }
        if (arrNV.isEmpty()) {
            System.out.println("Không có dữ liệu.");
        }
    }

    static void CN3(ArrayList<NhanVien> arrnv) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập mã nhân viên cần tìm: ");
        String maNV = scanner.nextLine();
        boolean timThay = false;

        for (NhanVien nhanVien : arrnv) {

            if (nhanVien.getMaNV().equalsIgnoreCase(maNV)) {
                timThay = true;
                nhanVien.xuatTT();
            }

        }
        if (!timThay) {
            System.out.println("Ko tìm thấy nhân viên: " + maNV);
        }
    }

    static void CN4(ArrayList<NhanVien> arrnv) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập mã nhân viên cần xóa: ");
        String maNV = scanner.nextLine();
        boolean kt = false;

        for (NhanVien nhanVien : arrnv) {

            if (nhanVien.getMaNV().equalsIgnoreCase(maNV)) {
                arrnv.remove(nhanVien);
                System.out.println("Đã xóa nhân viên: " + maNV);
                kt = true;
                break;
            }

        }

        if (!kt) {
            System.out.println("Không tìm thấy mã nhân viên: " + maNV);
        }
    }

    static void CN5(ArrayList<NhanVien> arrnv) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã nhân viên cần cập nhật: ");
        boolean timThay = false;
        int index = 0;
        String maNV = sc.nextLine();

        for (NhanVien nv : arrnv) {

            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                timThay = true;
                System.out.println("Cập nhật thông tin nhân viên\n(ấn enter nếu muốn giữ lại thông tin cũ): ");
                System.out.println("Mã nhân viên: " + nv.getMaNV() + ": ");
                String maNVnew = sc.nextLine();

                if (!maNVnew.equalsIgnoreCase("")) {
                    System.out.println("Cập nhật mã nhân viên mới: " + maNVnew);
                    nv.setMaNV(maNVnew);
                }

                System.out.println("Tên nhân viên: " + nv.getHoTen() + ": ");
                String hoTennew = sc.nextLine();

                if (!hoTennew.equalsIgnoreCase("")) {
                    System.out.println("Cập nhật tên nhân viên mới: " + hoTennew);
                    nv.setHoTen(hoTennew);
                }

                System.out.println("Lương nhân viên: " + nv.getLuong() + ": ");
                String luongNew = sc.nextLine();

                if (luongNew.equalsIgnoreCase("")) {
                    System.out.println("Cập nhật lương mới: " + luongNew);
                    nv.setLuong(Double.parseDouble(luongNew));
                }

                if (nv instanceof TruongPhong) {
                    System.out.println("Lương trách nhiệm: " + ((TruongPhong) nv).getTrachNhiem());
                    String trachNhiemnew = sc.nextLine();

                    if (!trachNhiemnew.equalsIgnoreCase("")) {
                        System.out.println("Cập nhật lương trách nhiệm mới: " + trachNhiemnew);
                        ((TruongPhong) nv).setTrachNhiem(Double.parseDouble(trachNhiemnew));

                    } else if (nv instanceof TiepThi) {
                        System.out.println("Doanh số: " + ((TiepThi) nv).getDoanhso() + ": ");
                        String doanhSonew = sc.nextLine();
                        if (!doanhSonew.equalsIgnoreCase("")) {
                            System.out.println("Cập nhật doanh số mới: " + doanhSonew);
                            ((TiepThi) nv).setDoanhso(Double.parseDouble(doanhSonew));

                        }
                        System.out.println("Hoa hồng: " + ((TiepThi) nv).getHueHong() + ": ");
                        String hoaHongnew = sc.nextLine();
                        if (!hoaHongnew.equalsIgnoreCase("")) {
                            System.out.println("Cập nhật hoa hồng: " + hoaHongnew);
                            ((TiepThi) nv).setHueHong(Double.parseDouble(hoaHongnew));

                        }
                    }
                }
                arrnv.set(index, nv);
            } else {
                index++;
            }

        } //end for
        if (!timThay) {
            System.out.println("Không tìm thấy mã nhân viên: " + maNV);
        }

    }

    static void CN6(ArrayList<NhanVien> arrNV) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Khoảng lương cần tìm: ");
        System.out.println("Lương min: ");
        Double luongMin = Double.parseDouble(sc.nextLine());
        System.out.println("Lương max: ");
        Double luongMax = Double.parseDouble(sc.nextLine());
        boolean timThay = false;

        for (NhanVien nv : arrNV) {

            if (nv.getLuong() >= luongMin && nv.getLuong() <= luongMax) {
                System.out.println("======================");
                timThay = true;
                nv.xuatTT();

            }
            if (!timThay) {
                System.out.println("Không tìm thấy nhân viên có lương: " + luongMin + "đến: " + luongMax);

            }

        }

    }

    static void CN7(ArrayList<NhanVien> arrNV) {

        Collections.sort(arrNV, (arg0, arg1) -> arg0.getHoTen().compareTo(arg1.getHoTen()));
    }

    static void CN8(ArrayList<NhanVien> arrNV) {

        Collections.sort(arrNV, (o0, o1) -> o0.getThuNhap().compareTo(o1.getThuNhap()));

    }

    static void CN9(ArrayList<NhanVien> arrNV) {

        Collections.sort(arrNV, (o0, o1) -> o1.getThuNhap().compareTo(o0.getThuNhap()));

        for (int i = 0; i < 5 && i < arrNV.size(); i++) {
            System.out.println("==================");
            arrNV.get(i).xuatTT();

        }
    }

}
