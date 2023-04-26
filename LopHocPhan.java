/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaylenlop;


import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author DINH CHAU
 */
public class LopHocPhan {
    private String maLHP;
    private String tenLHP;
    private String tenGV;
    private String thongTinLopHoc;
    private ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
    Scanner sc = new Scanner(System.in);
    
    ArrayList<LopHocPhan> menu = new ArrayList<>();
    
    public LopHocPhan(){
    }

    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTinLopHoc = thongTinLopHoc;
    }
    

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongTinLopHoc() {
        return thongTinLopHoc;
    }

    public void setThongTinLopHoc(String thongTinLopHoc) {
        this.thongTinLopHoc = thongTinLopHoc;
    }

    public ArrayList<SinhVien> getDs() {
        return ds;
    }

    public void setDs(ArrayList<SinhVien> ds) {
        this.ds = ds;
    }

    @Override
    public String toString() {
        return "- Mã LHP: " + maLHP + "\n-Tên LHP: " + tenLHP + "\n- GV giang day: " + tenGV + "\n-Thông tin lop hoc: " + thongTinLopHoc + "\n.";
    }
    
    
    
    public int getSoLuongSV(){
        int count = 0;
        for(SinhVien sv : ds){
            count ++;
        }
        System.out.println("Tong so sinh vien: " + count);
        return count;
    }
    
    public void NhapGV(){
        while(true){
              System.out.println("Ma LHP: ");
              String maLHP = sc.nextLine();
              System.out.println("Ten LHP: ");
              String tenLHP = sc.nextLine();
              System.out.println("Giao Vien day: ");
              String tenGV = sc.nextLine();
              System.out.println("TT buoi hoc: ");
              String thongtinLopHoc = sc.nextLine();
              LopHocPhan lhp = new LopHocPhan(maLHP, tenLHP, tenGV, thongtinLopHoc);
              menu.add(lhp);
              
              System.out.println("Nhap GV tiep theo:(Yes or No) ");
              sc.nextLine();
              if(sc.nextLine().equals("No")){
                break;
            }
              sc.nextLine();
          }
    }
    
    public void NhapSINHV(){
        while(true){
              System.out.println("Ma SV: ");
              String MaSV = sc.nextLine();
              System.out.println("Ho ten SV: ");
              String HoTen = sc.nextLine();
              SinhVien sv = new SinhVien(MaSV, HoTen);            
              ds.add(sv);
              
              System.out.println("Nhap SV tiep theo:(Yes or No) ");
              sc.nextLine();
              if(sc.nextLine().equals("No")){
                break;
            }
              sc.nextLine();
          }
    }
    
    public void XuatGV(){
        for(LopHocPhan li : menu){
            System.out.println(li.toString());
        }
    }
    
    public void XuatSV(){
        for(SinhVien si : ds){
            System.out.println(si.toString());
        }
    }
  
}
