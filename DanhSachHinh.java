/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5_c2;

import java.util.ArrayList;

/**
 *
 * @author phankhang
 */
public class DanhSachHinh {
    private ArrayList<Hinh>DSHinh;
    
    public DanhSachHinh(){
        this.DSHinh = new ArrayList<>();
    }
    
    public DanhSachHinh(ArrayList<Hinh> DSHinh) {
        super();
        this.DSHinh = DSHinh;
    }
    public void  AddDSHinh(DSHinh ds){
        this.DSHinh.add(ds);
    }
    
    public void XuatDSHinh(){
        for(Hinh hinh : DSHinh){
            System.out.println(DSHinh);
        }
    }
}