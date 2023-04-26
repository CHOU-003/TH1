/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chay;

import java.util.Formatter;
/**
 *
 * @author DINH CHAU
 */
public class Vehicle {
    private String TenChuXe;
    private String LoaiXe;
    private int Dungtich;
    private double TriGia;
    
    public Vehicle(){}
    

    public Vehicle(String TenChuXe, String LoaiXe, int Dungtich, double TriGia) {
        this.TenChuXe = TenChuXe;
        this.LoaiXe = LoaiXe;
        this.Dungtich = Dungtich;
        this.TriGia = TriGia;
    }
    
    public void setTenChuXe(String TenChuXe){
        this.TenChuXe = TenChuXe;
    }
    
    public String getTenChuXe(){
        return TenChuXe;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String LoaiXe) {
        this.LoaiXe = LoaiXe;
    }

    public int getDungtich() {
        return Dungtich;
    }

    public void setDungtich(int Dungtich) {
        this.Dungtich = Dungtich;
    }

    public double getTriGia() {
        return TriGia;
    }

    public void setTriGia(double TriGia) {
        this.TriGia = TriGia;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "TenChuXe=" + TenChuXe + ", LoaiXe=" + LoaiXe + ", Dungtich=" + Dungtich + ", TriGia=" + TriGia + '}';
    }
    
     public double getThue(){
        double Thue;{
        if(getDungtich() < 100){
            Thue = getTriGia() * 0.01;
        } else if(getDungtich() <= 200){
            Thue = getTriGia() * 0.03;
        }else{
            Thue = getTriGia() * 0.05;
           
        }
       }
        return  Thue;
    }
    
    

}
