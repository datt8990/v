package demoslide6;

import java.util.Scanner;

public class DemoRegex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String email = "";

        System.out.println("Nhập email: ");
        email = sc.nextLine();
        boolean check = false;
        String reEmail = "\\w+@\\w+\\.\\w+";
        if (email.matches(reEmail)) {
            check = true;
            System.out.println("Email hợp lệ: "+email);
        }else{
            check = false;
            System.out.println("Email không hợp lệ.");
        }
            
        
    }
}
