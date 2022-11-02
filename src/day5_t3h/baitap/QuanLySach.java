package day5_t3h.baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    /*
     * @param scanner
     * @return true neu them thanh cong, false neu them that bai
     */
    private final static ArrayList<TaiLieu> danhSachTaiLieu = new ArrayList<>();
    {
        danhSachTaiLieu.addAll( FileUtils.docDanhSachTaiLieu());
    }
    public static ArrayList<TaiLieu> getDanhSachTaiLieu() {
        return danhSachTaiLieu;
    }



    public boolean themMoiTaiLieu(Scanner scanner) {
        TaiLieu tailieu = null;
        int nhap = 0;
        System.out.println("Nhap 1 de them sach: ");
        System.out.println("Nhap 2 de them bao: ");
        System.out.println("Nhap 3 de them tap chi: ");
        nhap = scanner.nextInt();
        scanner.nextLine();
        while (nhap > 3 || nhap < 1) {
            System.out.println("Nhap lai tu 1 - 3");
            ;
        }
        if (nhap == 1) tailieu = new Sach();
        else if (nhap == 2) tailieu = new Bao();
        else tailieu = new TapChi();
        tailieu.nhapThongTin(scanner, danhSachTaiLieu);
        FileUtils.luuDanhSachTaiLieu();
        return true;
    }

    public TaiLieu xoaTaiLieu(Scanner scanner) {
        System.out.println("Nhap ma tai lieu can xoa");
        String maTaiLieu = scanner.nextLine();
        TaiLieu tl = new TaiLieu();
        tl.setMaTaiLieu(maTaiLieu);
        if (!danhSachTaiLieu.contains(tl)) {
            System.out.println("Khong ton tai ma du lieu can xoa");
            return null;
        } else {
            danhSachTaiLieu.remove(tl);
        }
        return tl;
    }

    public void hienThiDanhSach(Scanner scanner) {
        System.out.println("Nhap cum tu can tim kiem ( all neu hien thi tat ca )");
        String maTaiLieu = scanner.nextLine();
        for (TaiLieu tl : danhSachTaiLieu) {
            if ("all".equalsIgnoreCase(maTaiLieu)
                    || tl.getMaTaiLieu().contains(maTaiLieu)) {
                System.out.println(tl.info());
            }
        }
    }
}
