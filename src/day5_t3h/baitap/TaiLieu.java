package day5_t3h.baitap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;

public class TaiLieu implements Serializable {
    private String maTaiLieu;
    private String nhaXuatBan;
    int soPhatHanh;
    protected LoaiTaiLieu loaiTaiLieu;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String nhaXuatBan, int soPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soPhatHanh = soPhatHanh;
    }

    public LoaiTaiLieu getLoaiTaiLieu() {
        return loaiTaiLieu;
    }

    public void setLoaiTaiLieu(LoaiTaiLieu loaiTaiLieu) {
        this.loaiTaiLieu = loaiTaiLieu;
    }

    public void nhapThongTin(Scanner scanner, ArrayList<TaiLieu> danhSachTaiLieu) {
        System.out.println("Nhap thong tin ma tai lieu: ");
        this.maTaiLieu = scanner.nextLine();
        while (danhSachTaiLieu.contains(this)) {
            System.out.println("Nhap lai thong tin ma tai lieu: ");
            this.maTaiLieu = scanner.nextLine();
        }
        // them chinh no
        QuanLySach.getDanhSachTaiLieu().add(this);
        System.out.println("Nhap thong tin nha xuat ban: ");
        this.nhaXuatBan = scanner.nextLine();
        System.out.println("Nhap thong tin so phat hanh: ");
        this.soPhatHanh = scanner.nextInt();
        scanner.nextLine();
    }

    public String info() {
        StringBuilder builder = new StringBuilder(); // Cong chuoi
        builder.append("Ma: ").append(maTaiLieu)
                .append(", NXB: ").append(nhaXuatBan)
                .append(",So PH: ").append(soPhatHanh);
        return builder.toString();
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // so sanh ve
        if (o == null) return false;
        TaiLieu taiLieu = (TaiLieu) o;
        return Objects.equals(maTaiLieu, taiLieu.maTaiLieu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maTaiLieu);
    }
}
