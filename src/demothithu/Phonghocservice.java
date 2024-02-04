/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demothithu;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Phonghocservice {

    ArrayList<Phonghoc> ListPH = new ArrayList<>();

    public void nhapphonghoc(Phonghoc ac) {
        ListPH.add(ac);
    }

    public ArrayList<Phonghoc> xuatphonghoc() {
        return ListPH;

    }

}
