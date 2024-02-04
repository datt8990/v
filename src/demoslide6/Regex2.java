package demoslide6;

import java.util.Scanner;

public class Regex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maSV = "";
        String matKhau = "";
        String hoTen = "";
        String email = "";
        String sdt = "";
        String soXeMay = "";
        String soCMND = "";
        String web = "";

        System.out.println("Nhập mã SV: ");
        maSV = sc.nextLine();
        String reMaSV = "[A-Z]{5}";
        if (!maSV.matches(reMaSV)) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }QUAN

        System.out.println("Nhập mật khẩu: ");
        matKhau = sc.nextLine();
        String reMatKhau = ".{6,}";
        if (!matKhau.matches(reMatKhau)) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }

        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
        String reHoten = "[a-zA-Z]+";
        if (!hoTen.matches(reHoten)) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }

        System.out.println("Nhập email: ");
        email = sc.nextLine();
        String reEmail = "\\w+@\\w+\\.\\w+";
        if (email.matches(reEmail)) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }

        System.out.println("Nhập sdt sg : ");
        sdt = sc.nextLine();
        String reSDT = "^0\\d{9}$";
        if (sdt.matches(reSDT)) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }

        System.out.println("Nhập số xe máy sài gòn: ");
        soXeMay = sc.nextLine();
        String reSoXeMay = "^5[A-Z0-9]{4,5}$";
        if (!soXeMay.matches(reSoXeMay)) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }

        System.out.println("Nhập số CMND: ");
        soCMND = sc.nextLine();
        String reSoCMND = "^\\d{10}$";
        if (!soCMND.matches(reSoCMND)) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }

        System.out.println("Nhập mã website: ");
        web = sc.nextLine();
        String reWeb = "!^(http|https):\\/\\/[a-zA-Z0-9]+([-.]{1}[a-zA-Z0-9]+)*\\.[a-zA-Z]{2,}(:[0-9]{1,5})?(\\/.*)?$";
        if (web.matches(reWeb)) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }
    }
}
