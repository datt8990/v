/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi07;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class demoslide4 {
    private String Hoten;
    private double diem;
// constructor không tham số
    public demoslide4() {
    }
// constructor có tham số
    public demoslide4(String Hoten, double diem) {
        this.Hoten = Hoten;
        this.diem = diem;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    
   public void nhap(){
       Scanner nhap = new Scanner(System.in);
       System.out.println("Ho ten : ");
       Hoten = nhap.nextLine();
       System.out.println("Diem: ");
       diem = nhap.nextDouble();
       
   }
   public void xuat(){
       System.out.println("Ho ten: "+Hoten);
       System.out.println("Diem: "+diem);
   }
   public void xeploai(){
       if (diem>=8) {
           System.out.println("Gioi");
       }else if(diem>=7){
           System.out.println("Kha");
       }else{
           System.out.println("TB");
       }
   }
   
}
