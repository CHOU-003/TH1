/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chay.tp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author DINH CHAU
 */
public class DanhSach {
      private ArrayList<HangThucPham> dsHang;

    ArrayList<HangThucPham> ds = new ArrayList<>();

    public void nhapHang() {
        Scanner sc = new Scanner(System.in);
        String maHang;
        boolean trungMaHang;
        do {
            System.out.print("Nhap ma hang: ");
            maHang = sc.nextLine();

            // Kiểm tra xem mã hàng đã tồn tại trong danh sách hay chưa
            trungMaHang = false;
            for (HangThucPham htp : ds) {
                if (htp.getMaHang().equals(maHang)) {
                    trungMaHang = true;
                    System.out.println("Ma hang da ton tai trong danh sach, vui long nhap lai!");
                    break;
                }
            }
        } while (trungMaHang);

        System.out.print("Nhap ten hang: ");
        String tenHang = sc.nextLine();

        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();

        boolean validNgaySanXuat = false;
        LocalDate ngaySanXuat = null;
        while (!validNgaySanXuat) {
            System.out.print("Nhap ngay san xuat (dd/mm/yyyy): ");
            String ngaySanXuatStr = sc.next();
            try {
                ngaySanXuat = LocalDate.parse(ngaySanXuatStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                validNgaySanXuat = true;
            } catch (DateTimeParseException e) {
                System.out.println("Ngay san xuat khong dung dinh dang, vui long nhap lai!");
            }
        }

        boolean validNgayHetHan = false;
        LocalDate ngayHetHan = null;
        while (!validNgayHetHan) {
            System.out.print("Nhap ngay het han (dd/mm/yyyy): ");
            String ngayHetHanStr = sc.next();
            try {
                ngayHetHan = LocalDate.parse(ngayHetHanStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                if (ngayHetHan.isBefore(ngaySanXuat)) {
                    System.out.println("Ngay het han phai sau ngay san xuat, vui long nhap lai!");
                } else {
                    validNgayHetHan = true;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Ngay het han khong dung dinh dang, vui long nhap lai!");
            }
        }

        HangThucPham htp = new HangThucPham(maHang, tenHang, donGia, ngaySanXuat, ngayHetHan);
        ds.add(htp);

        System.out.println("Da them hang thanh cong!");
    }


    public void xuatHang() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach hang rong!");
        } else {
        	 System.out.println( String.format("| %-15s | %-25s | %-15s | %-20s | %-20s | %-10s |%n", "Ma hang", "Ten hang", "Don gia",
                     "Ngay san xuat", "Ngay het han", "Ghi Chu") + 
                     "================================================================================================================================"+ "\n");
            for (HangThucPham htp : ds) {
                System.out.println(htp);
            }
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;

        do {
            System.out.println("\n== MENU ==");
            System.out.println("1. Nhap hang");
            System.out.println("2. Xuat hang");
            System.out.println("3. Thoat");

            System.out.print("Nhap lua chon cua ban: ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    nhapHang();
                    break;
                case 2:
                    xuatHang();
                    break;
                case 3:
                    System.out.println("Da thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai!");
            }
        } while (luaChon != 3);
    }
}
