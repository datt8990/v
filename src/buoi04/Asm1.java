/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi04;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Asm1 {
    
        static int soluongnguoi;
        static String[] hoten;
        static double[] luong;
        static String[] vitri;
   
        
        public static void main(String[] args) {
        
        
            int chon;
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
            
            do {
            System.out.println("Mời bạn chọn chức năng:");    
            Scanner nhap = new Scanner(System.in);
            chon = nhap.nextInt();
           
            switch (chon) {
                case 1:
                    System.out.println("Bạn chọn chức năng 1.");
                    chucnang1(); 
                    
                    break;
                case 2:
                    System.out.println("Bạn đã chọn chức năng 2.");
                    chucnang2();                     
                            
                    break;
                
                case 3:
                        System.out.println("Bạn đã chọn chức năng 3.");  
                    chucnang3();
                    break; 
                case 4:
                        System.out.println("Bạn đã chọn chức năng 4.");  
                    chucnang4(); 
                    break; 
                case 5:
                        System.out.println("Bạn đã chọn chức năng 5."); 
                    chucnang5();    
                    break; 
                case 6:
                        System.out.println("Bạn đã chọn chức năng 6.");   
                    chucnang6();   
                    break; 
                case 7:
                        System.out.println("Bạn đã chọn chức năng 7.");  
                    chucnang7();   
                    break; 
                case 8:
                        System.out.println("Bạn đã chọn chức năng 8."); 
                    chucnang8();   
                    break; 
                case 9:
                        System.out.println("Bạn đã chọn chức năng 9."); 
                    chucnang9();   
                    break; 
                default: 
                        System.out.println("Thoát khỏi chương trình!"); 
                        System.exit(0);
                        
            }
        } while (true);
        }
    static void chucnang1 (){
                    Scanner nhap = new Scanner(System.in);
                    System.out.println("Nhập số lượng người:");
                    soluongnguoi = nhap.nextInt();
                    nhap.nextLine();
                    hoten = new String[soluongnguoi];
                    
                    for (int i = 0; i < soluongnguoi; i++) {
                        System.out.println("Nhập tên người thứ " + (i + 1) + ":");
                        hoten[i] = nhap.nextLine();
                    }
                    luong = new double[soluongnguoi];
                    nhap.nextLine();
                    for (int i = 0; i < soluongnguoi; i++) {
                        System.out.println("Nhập luong người thứ " + (i + 1) + ":");
                        luong[i] = nhap.nextDouble();
                        
            
        }
                    vitri = new String[soluongnguoi];
                    nhap.nextLine();
                    for (int i = 0; i < soluongnguoi; i++) {
                        System.out.println("Nhập vị trí người thứ " + (i + 1) + ":");
                        vitri[i] = nhap.nextLine();
                    }
                    
    }
    static void chucnang2(){
                    if(soluongnguoi>0){
                    System.out.println("Danh sách tên đã nhập là:");
                    for (int i = 0; i < soluongnguoi; i++) {
                        System.out.println(hoten[i]);
                    }
                    System.out.println("Danh sách luongư của từng người đã nhập là:");
                    for (int i = 0; i < soluongnguoi; i++) {
                        System.out.println(luong[i]);
                    }
                    System.out.println("Danh sách vị trí đã nhập là:");
                    for (int i = 0; i < soluongnguoi; i++) {
                        System.out.println(vitri[i]);
                    }
                    
                    }else{
                      System.out.println("Chưa có dữ liệu nhân viên");      
                    }       
    }
    static void chucnang3(){}
    static void chucnang4(){}
    static void chucnang5(){}
    static void chucnang6(){}
    static void chucnang7(){}
    static void chucnang8(){}
    static void chucnang9(){}
    
    }  
    
