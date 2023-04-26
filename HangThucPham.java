/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chay.tp;


import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author DINH CHAU
 */
public class HangThucPham {
    	private String maHang;
	private String tenHang = "xxx";
	private double donGia = 0;
	private LocalDate ngaySanXuat = LocalDate.now();
	private LocalDate ngayHetHan;

	public String getMaHang() {
		return maHang;
	}

	public void setTenHang(String tenHang) {
		if (tenHang != null && !tenHang.equals("")) {
			this.tenHang = tenHang;
		} else {
			this.tenHang = "xxx";
		}
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setDonGia(double donGia) {
		if (donGia >= 0) {
			this.donGia = donGia;
		} else {
			this.donGia = 0;
		}
	}

	public double getDonGia() {
		return donGia;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isBefore(LocalDate.now())) {
			this.ngaySanXuat = ngaySanXuat;
		} else {
			this.ngaySanXuat = LocalDate.now();
		}
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	
	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		if (maHang != null && !maHang.equals("")) {
			this.maHang = maHang;
		} else {
			throw new IllegalArgumentException("Mã hàng không được để trống!");
		}

		if (tenHang != null && !tenHang.equals("")) {
			this.tenHang = tenHang;
		}

		if (donGia >= 0) {
			this.donGia = donGia;
		}

		if (ngaySanXuat.isBefore(LocalDate.now())) {
			this.ngaySanXuat = ngaySanXuat;
		}

		this.ngayHetHan = ngayHetHan;
	}

	
	public HangThucPham(String maHang) {
		this.maHang = maHang;
	}

	public boolean daHetHan() {
		if (ngayHetHan != null) {
			return ngayHetHan.isBefore(LocalDate.now());
		} else {
			return false;
		}
	}

	public String toString() {
		String hethan = "Chua het han";
		if (ngayHetHan != null && ngayHetHan.isBefore(LocalDate.now())) {
		hethan = "Da het han";
		}
		NumberFormat nf = NumberFormat.getInstance();
		nf.setGroupingUsed(true);
		String dongia = nf.format(donGia);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		return 
        String.format("| %-15s | %-25s | %-15s | %-20s | %-20s | %-10s |%n", maHang, tenHang, dongia,
                ngaySanXuat.format(formatter), ngayHetHan.format(formatter), hethan)
        .replaceFirst("\\|", " ").replaceFirst("\\|", " ").replaceFirst("\\|", " ").replaceFirst("\\|", " ")
        .replaceFirst("\\|", " ").replaceFirst("\\|", " ");
    }
}
