package day5_t3h.baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    @Override
    public void nhapThongTin(Scanner scanner, ArrayList<TaiLieu> danhSachTaiLieu) {
        loaiTaiLieu = loaiTaiLieu.TAP_CHI;
        super.nhapThongTin(scanner, danhSachTaiLieu);
        System.out.println("Nhap thong tin so phat hanh: ");
        this.soPhatHanh = scanner.nextInt();
        System.out.println("Nhap so thang phat hanh: ");
        this.thangPhatHanh = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String info() {
        StringBuilder builder = new StringBuilder(super.info());
        builder.append(", So phat hanh: ").append(soPhatHanh)
                .append(", Thang phat hanh: ").append(thangPhatHanh);
        return builder.toString();
    }

    @Override
    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    @Override
    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
}
