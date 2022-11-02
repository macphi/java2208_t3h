package day5_t3h;

import java.util.Scanner;

public class Person {
    // private: chi trong class
    // public: Pham vi truy cap o bat cu dau, khong gioi han
    // defauult: trong cung pakage
    private String hoVaTen;
    private byte tuoi; // tiet kiem bo nho 1 -127
    private String ngaySinh;

    public void nhapThongTin(Scanner scanner) {
        System.out.println("Nhap ho va ten: ");
        this.hoVaTen = scanner.nextLine();
        System.out.println("Nhap ngay sinh: ");
        this.ngaySinh = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        this.tuoi = scanner.nextByte();
        scanner.nextLine(); // loai bo enter
    }

    // overload: 1'; cung ten ham cung kieu tra ve
    // 2: khac tham so truyen vao( so luong, kieu du lieu, tham so )
    // Ham khoi tao khong tham so - mac dinh
    public Person() {
    }

    //Ham khoi tao co tham so
    public Person(String hoVaTen, byte tuoi, String ngaySinh) {
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        this.ngaySinh = ngaySinh;
    }

    public Person(String hoVaTen, int tuoi, String ngaySinh) {
        this.hoVaTen = hoVaTen;
        this.tuoi = (byte) tuoi;
        this.ngaySinh = ngaySinh;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        if (hoVaTen == null) return;
        this.hoVaTen = hoVaTen;
    }

    public byte getTuoi() {
        return tuoi;
    }

    public void setTuoi(byte tuoi) {
        this.tuoi = tuoi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void show() {
        System.out.println("Ho va ten: " + hoVaTen + "\n Tuoi: " + tuoi + "\n Ngay sinh: " + ngaySinh);
    }

}
