package day4_t3h;

import java.util.Scanner;

public class PhanSo {
    int mauSo;
    int tuSo;

    void ganTuSo(int tuSo){
        this.tuSo=tuSo;

    }
    void nhapPhanSo() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (b == 0) {
            System.out.println("Mau so phai khac 0");
            b = scanner.nextInt();
        }
        this.tuSo = a;
        this.mauSo = b;
    }

    void rutGonPhanSo() {
        int UCLN;
        int a = this.tuSo;
        int b = this.mauSo;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        UCLN = a;
        System.out.print(this.tuSo / UCLN + " / " + this.mauSo / UCLN);
    }

    PhanSo cong(PhanSo other) {
        PhanSo tong = new PhanSo();
        tong.tuSo = this.tuSo * other.mauSo + this.mauSo * other.tuSo;
        tong.mauSo = this.mauSo * other.mauSo;
        return tong;
    }
    PhanSo tru(PhanSo other) {
        PhanSo hieu = new PhanSo();
        hieu.tuSo = this.tuSo * other.mauSo - this.mauSo * other.tuSo;
        hieu.mauSo = this.mauSo * other.mauSo;
        return hieu;
    }
    void inRaManHinh() {
        System.out.println("Phan so la " + this.tuSo + " / " + this.mauSo);
    }
}
