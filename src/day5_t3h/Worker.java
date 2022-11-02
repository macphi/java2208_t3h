package day5_t3h;

import java.util.Scanner;

public class Worker extends Person{
    String congTy;
    long luong;

    @Override
    public void nhapThongTin(Scanner scanner) {
        // supper ham goi cua thang cha
        super.nhapThongTin(scanner);
        System.out.println(" ten cong ty: ");
        this.congTy = scanner.nextLine();
        System.out.println("Nhap luong: ");
        this.luong = scanner.nextLong();
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Cong ty: " + congTy + "\n luong " + luong);
    }

    public String getCongTy() {
        return congTy;
    }

    public void setCongTy(String congTy) {
        this.congTy = congTy;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
}
