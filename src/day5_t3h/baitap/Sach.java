package day5_t3h.baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    @Override
    public void nhapThongTin(Scanner scanner, ArrayList<TaiLieu> danhSachTaiLieu) {
        loaiTaiLieu = loaiTaiLieu.SACH;
        super.nhapThongTin(scanner, danhSachTaiLieu);
        System.out.println("Nhap ten tac gia: ");
        this.tenTacGia = scanner.nextLine();
        System.out.println("Nhap so trang: ");
        this.soTrang = scanner.nextInt();
        scanner.nextLine();

    }

    @Override
    public String info() {
        StringBuilder builder = new StringBuilder(super.info());
        builder.append(", Ten tac gia: ").append(tenTacGia)
                .append(", So trang: ").append(soTrang);
        return builder.toString();
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
