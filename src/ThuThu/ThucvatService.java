/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuThu;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ThucvatService {

    ArrayList<ThucVat> x = new ArrayList<>();

    public void Nhaptt(ThucVat tv) {
        x.add(tv);
    }

    public ArrayList<ThucVat> Xuattt() {
        return x;
    }
}
