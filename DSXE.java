/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chay;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DINH CHAU
 */
public class DSXE {
    ArrayList<Vehicle> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void Nhap(){
             while(true){
                 System.out.println("Nhap Ten Chu Xe: ");
                 String TenChuXe = sc.nextLine();
                 System.out.println("Nhap Loai Xe: ");
                 String LoaiXe = sc.nextLine();
                 System.out.println("Nhap Dung Tich: ");
                 int Dungtich = sc.nextInt();
                 System.out.println("Nhap Tri Gia: ");
                 double TriGia = sc.nextDouble();
                 Vehicle ve = new Vehicle(TenChuXe, LoaiXe, Dungtich, TriGia);
                 ve.getThue();
                 ds.add(ve);
              
              System.out.println("Nhap xe tiep theo:(Yes or No) ");
              sc.nextLine();
              if(sc.nextLine().equals("No")){
                break;
            }
          }
    }
    
    public void Xuat(){
        System.out.println(String.format("| %-20s | %-20s  | %-10s  | %-20s  | %-15s"
                , "Ten chu xe", "Loai Xe", "Dung Tich", "Tri Gia", "Thue Phai Nop"));
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        for(Vehicle c : ds){
            System.out.println(String.format("| %-20s  | %-20s  | %-10d  | %-20.2f | %-15.2f |", c.getTenChuXe()
                    , c.getLoaiXe(), c.getDungtich()
                    , c.getTriGia(), c.getThue()));
        }
    }
    
}
