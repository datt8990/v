
package demoslide6;

import java.util.Scanner;


public class demoslide6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userName = "";

        String passWord = "";

        System.out.println("User name: ");
        userName = sc.nextLine();
        System.out.println("Pass word: ");
        passWord = sc.nextLine();

        if (userName.equalsIgnoreCase("hello") && passWord.length() >= 6) 
            
            System.out.println("Login succcessful!");
         else
            
            System.out.println("Login failt!");
        

    }
}
