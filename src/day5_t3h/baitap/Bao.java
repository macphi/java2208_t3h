package day5_t3h.baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    @Override
    public void nhapThongTin(Scanner scanner, ArrayList<TaiLieu> danhSachTaiLieu) {
        loaiTaiLieu = loaiTaiLieu.BAO;
        super.nhapThongTin(scanner, danhSachTaiLieu);
        System.out.println("Nhap thong tin ngay phat hanh: ");
        this.ngayPhatHanh = scanner.nextLine();
    }

    @Override
    public String info() {
        StringBuilder builder = new StringBuilder(super.info());
        builder.append(", Ngay phat hanh: ").append(ngayPhatHanh);
        return builder.toString();
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
}
