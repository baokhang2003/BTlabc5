/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5_c2;

/**
 *
 * @author phankhang
 */
public class hinhChunhat {
    public float hinhChunhat;
    public double dienTich;
    
    public hinhChunhat(float hinhChunhat, double dienTich){
        this.dienTich = dienTich;
        this.hinhChunhat = hinhChunhat;
    }
    public float gethinhChunhat(){
        return hinhChunhat;
    }
    public void sethinhChunhat(float hinhChunhat){
        this.hinhChunhat = hinhChunhat;
    }
    public double getdienTich(){
        return dienTich;
    }
    public void setdienTich(double dienTich){
        this.dienTich = dienTich;
    }
}