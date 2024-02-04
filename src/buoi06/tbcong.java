/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi06;

/**
 *
 * @author admin
 */
public class tbcong {
    public static void main(String[] args) {
        int trungbinhcong,tong=0;
        int i =27;
        int dem = 0;
        while (i<=250) {
          if(i%3==0){
              tong +=  i ;
              dem++;
          }            
          
           i++;
           
        }
            trungbinhcong= tong/dem;
            System.out.println(trungbinhcong);
    }
}
