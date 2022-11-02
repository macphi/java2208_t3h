package day5_t3h.baitap;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // block static
//    static {
//        // Chay trong khoi lenh nay truoc khi vao ham main
//        System.out.println("Chay static");
//    }
//    private static String a;
//    // class static
//    static class StaticExample {
//        String a;
//    }
    // Ham chay chuong trinh chinh
    public static void main(String[] args) {
    //Main.StaticExample;
//        a = " abc";
//        System.out.println(a);
//        int x = 19;
//        x = 0;
//        System.out.println("10/x = " +10/0);
        Scanner scanner = new Scanner(System.in);
        QuanLySach quanLySach = new QuanLySach(); // danh sach tai lieu
        int input = -1;
        while (input != 0) {
            System.out.println("----------Menu------------");
            System.out.println("Go 1 de them tai lieu");
            System.out.println("Go 2 de xoa tai lieu");
            System.out.println("Go 3 de tim kiem tai lieu");
            System.out.println("Go 0 de thoat");
            input = scanner.nextInt();
            scanner.nextLine();
            while (input > 3 || input < 0) {
                System.out.println("Nhap lai tu 1 - 3 ");
                input = scanner.nextInt();
                scanner.nextLine();
            }
            if (input == 1) quanLySach.themMoiTaiLieu(scanner);
            else if (input == 2) quanLySach.xoaTaiLieu(scanner);
            else if (input == 3) quanLySach.hienThiDanhSach(scanner);
            else break;
        }

//        TaiLieu tl_1 = new TaiLieu("1234", "Kim Dong", 123);
//        TaiLieu tl_2 = new TaiLieu("1234", "Kim Dong", 123);
//        TaiLieu tl_3 = tl_1;
//        ArrayList<TaiLieu> danhSachTaiLieu = new ArrayList();
//        danhSachTaiLieu.add(tl_1);
        // De so sanh 2 doi tuong ta dung ham equals
        // Lam the nao de sung dung duoc ham equals
//        if (tl_1.getMaTaiLieu().equals(tl_2.getMaTaiLieu())) {
//            System.out.println("Tai lieu trung ma");
//        } else {
//            System.out.println("Tai lieu khac ma");
//        }
//        for (int i = 0; i < danhSachTaiLieu.size(); i++) {
//            if (danhSachTaiLieu.get(i).getMaTaiLieu().equals(tl_2.getMaTaiLieu())){
//                System.out.println("Tai lieu trung ma");
//                break;
//            }
//        }
//        if (tl_1.equals(tl_2)){
//            System.out.println("tl_1 bang tl_2");
//        }else {
//            System.out.println("tl_1 khong bang tl_2");
//        }
//        if (danhSachTaiLieu.contains(tl_2)){
//            System.out.println("Danh sach chua ma tl_2");
//        }else {
//            System.out.println("Danh sach khong chua ma tl_2");
//        }
    }
}
