/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi03;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class CautrucIf {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int number=0;
        System.out.print("Nhập vào 1 số nguyên :");
        try {
            number = nhap.nextInt();
        } catch (Exception e) {
            System.out.println("Phải nhập là số nguyên");
        }
        //ktra số vừa 
        if(number%2==0){
            System.out.println("Đây là số chẵn.");
            
        }else{
            System.out.println("Đây là số lẻ.");
            
        }
        }
    }
/*Cấu trúc if..else
if(Đk){
cv1
}else{
cv2
}
- nếu đk trong if đúng => thực hiện cv1
- nếu đk trong if sai => thực hiện cv2
*/
