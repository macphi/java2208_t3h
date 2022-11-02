package day5_t3h;

import java.util.Scanner;

public class Student extends Person {
    String truongHoc;
    String lop;
    String maSoSv;

    // ghi de len ham cua thang cha
    // chi xa ra trong moi quan he con cha
    @Override
    public void nhapThongTin(Scanner scanner) {
        // supper ham goi cua thang cha
        super.nhapThongTin(scanner);
        System.out.println("Nhap ten truong: ");
        this.truongHoc = scanner.nextLine();
        System.out.println("Nhap ma sv: ");
        this.maSoSv = scanner.nextLine();
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Truong hoc: " + truongHoc + "\n ma sinh vien " + maSoSv);
    }

    public String getTruong() {
        return truongHoc;
    }

    public void setTruong(String truong) {
        this.truongHoc = truong;
    }


    public String getMaSoSv() {
        return maSoSv;
    }

    public void setMaSoSv(String maSoSv) {
        this.maSoSv = maSoSv;
    }
}
