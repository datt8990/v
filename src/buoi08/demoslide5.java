/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi08;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class demoslide5 {
    public static void main(String[] args) {
       ArrayList<Double> nhap = new ArrayList<Double>();
       double tong= 0.0;
       nhap.add(5.6);
       nhap.add(7.92);
       nhap.add(2.1);
       nhap.add(8.3);
       nhap.add(9.0);
       
        for (Double x : nhap) {
            tong+=x;
            
        }
        System.out.println("Tong la: "+tong);
    }
}
