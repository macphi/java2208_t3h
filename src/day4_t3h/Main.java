package day4_t3h;

public class Main {
    public static void main(String[] args) {
        Oto honDa = new Oto(); // 1 the hien (doi tuong, instance) cua lop (class)
        honDa.bienSoXe = "30G-123456";
        honDa.hangXe = "HONDA";
        Oto toyota = new Oto();
        toyota.bienSoXe = "30H-56799";
        toyota.hangXe = "Toyota";
        honDa.chayXeTrenDuong(100);
        toyota.chayXeTrenDuong(200);
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        System.out.println("Nhap so a: ");
        a.nhapPhanSo();
        System.out.println("Nhap so b: ");
        b.nhapPhanSo();
        PhanSo t = a.tru(b);
        a.rutGonPhanSo();
        System.out.print(" + ");
        b.rutGonPhanSo();
        System.out.print(" = ");
        t.rutGonPhanSo();
    }
}
