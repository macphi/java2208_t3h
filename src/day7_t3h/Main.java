package day7_t3h;

import day5_t3h.baitap.TaiLieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CheckedException {
//        try { // Muon pass qua chuc nang trong block try
//            testCheckedException();
//        } catch (CheckedException e) {
//            // Neu co loi chui vao catch va van chay het
//            e.printStackTrace();
//        } finally {
//            System.out.println("END GAME chay trong finally");
//        }

        NgayTrongTuanEnum thu = NgayTrongTuanEnum.THU_2;
        switch (thu) {
            case THU_2:
                System.out.println("Thu 2");
                break;
            case THU_3:
                System.out.println("Thu 3");
                break;
            case THU_4:
                System.out.println("Thu 4");
                break;
            case THU_5:
                System.out.println("Thu 5");
                break;
            case THU_6:
                System.out.println("Thu 6");
                break;
            case THU_7:
                System.out.println("Thu 7");
                break;
            default:
                System.out.println("Cuoi tuan");
                break;
        }

//        testCheckedException(); // Neu dung throw thi chuong trinh se dung o day
//        testUncheckedException(); // Dung chuong trinh o day
//        final String a = "t3h"; // Bien a la final -> a khong duoc phep thay doi dia chi
////        a = "abc";
//        final TaiLieu taiLieu = new TaiLieu();
////        taiLieu = new TaiLieu();
//        taiLieu.setMaTaiLieu("123");
//        taiLieu.setMaTaiLieu("456");
        System.out.println("Ket thuc chuong trinh");
    }

    static void testCheckedException() throws CheckedException {
        Scanner scanner = new Scanner(System.in);
        int nhap = scanner.nextInt();
        if (nhap == 0) {
            throw new CheckedException("Nhap bang 0 can than khi chia cho 0");
        }
        System.out.println("So vua nhap la: " + nhap);
    }

    static void testUncheckedException() {
        Scanner scanner = new Scanner(System.in);
        int nhap = scanner.nextInt();
        if (nhap == 0) {
            throw new UnCheckedException("Nhap bang 0 can than");
        }
        System.out.println("So vua nhap la: " + nhap);
    }
}
