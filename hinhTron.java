/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5_c2;

/**
 *
 * @author phankhang
 */
public class hinhTron {
    public float hinhTron;
    public double dienTich;
    
    public hinhTron(float hinhTron, double dienTich){
        this.dienTich = dienTich;
        this.hinhTron = hinhTron;
    }
    public float gethinhTron(){
        return hinhTron;
    }
    public void sethinhTron(float hinhTron){
        this.hinhTron = hinhTron;
    }
    public double getdienTich(){
        return dienTich;
    }
    public void setdienTich(double dienTich){
        this.dienTich = dienTich;
    }
}