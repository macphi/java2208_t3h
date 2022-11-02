package day4_t3h;

// Tao class
// Tao 1 kieu du lieu moi do nguoi dung tu dinh nghia
// Huong den doi tuong thuc te cang gan voi ngon ngu tu nhien cang tot
public class Oto {
    //1: Cac dac diem cua doi tuong -> thuoc tinh
    // Dat ten cac danh tu
    String bienSoXe;
    String hangXe;
    //2: Cac hanh dong cua doi tuong -> phuong thuc (giong ham)
    // dat ten thuong cac danh dong tu
    void chayXeTrenDuong() {
        System.out.println("Xe" + hangXe + " bien so" + bienSoXe + " dang chay");
    }
    void chayXeTrenDuong(int vanToc) {
        System.out.println("Xe" + hangXe + " bien so" + bienSoXe + " dang chay "+ vanToc + "km");
    }
}
