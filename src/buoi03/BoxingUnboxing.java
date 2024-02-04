/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi03;

/**
 *
 * @author admin
 */
public class BoxingUnboxing {
    public static void main(String[] args) {
        int number = 5;//biến nguyên thủy
        //boxing 
        Integer a= Integer.valueOf(number);//bao tường minh
        Integer b= number;//bao ngầm định
    //Unboxing
    int c = a.intValue();//mở bao tường minh
    int d = a;//mở bao ngầm định
   }
}
