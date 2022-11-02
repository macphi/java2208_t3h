package day8_t3h;

import day8_t3h.iso.AbtractISO;
import day8_t3h.iso.BanhKeo;
import day8_t3h.iso.BanhMy;
import day8_t3h.iso.NuocCham;

public class Main {
    // Banh my, banh sinh nhat, banh bao
    // Tieu chuan ISO - san xuat san pham (1: Chuan bi vat lieu, 2: San xuat, 3: An toan ve sinh rac thai cong nghiep)
    public static void main(String[] args) {
        AbtractISO banhMy = new BanhMy();
        AbtractISO banhKeo = new BanhKeo();
        AbtractISO nuocCham = new NuocCham();

        banhMy.sanXuat();
        System.out.println("=====================");
        banhKeo.sanXuat();
        System.out.println("=====================");
        nuocCham.sanXuat();
    }
}
