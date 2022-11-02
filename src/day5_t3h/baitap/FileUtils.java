package day5_t3h.baitap;

import day5_t3h.baitap.*;

import java.io.*;
import java.util.ArrayList;

public class FileUtils {
    public static void luuDanhSachTaiLieuTheoDuongDan(ArrayList taiLieus, String path) {
        try {
            // B1 Tao doi tuong luong va lien ket nguoi du lieu
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // B2 Ghi mang doi tuong vao file
            oos.writeObject(taiLieus);
            // B3 Dong luong
            fos.close();
            oos.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file:" + ex);
        }
    }

    public static ArrayList docDanhSachTaiLieuTheoDuongDan(String path) {
        try {
            // B1 Tao doi tuong luong va lien ket nguoi du lieu
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            // B2 Doc du lieu
            ArrayList result = (ArrayList) ois.readObject();
            // B3 Dong luong
            fis.close();
            ois.close();
            return result;
        } catch (IOException ex) {
            System.out.println("Loi ghi file:" + ex);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    static final String SACH_PATH = "C:\\Users\\macph\\OneDrive\\Máy tính\\demo2208\\sach.bin";
    static final String BAO_PATH = "C:\\Users\\macph\\OneDrive\\Máy tính\\demo2208\\bao.bin";
    static final String TAP_CHI_PATH = "C:\\Users\\macph\\OneDrive\\Máy tính\\demo2208\\tap_chi.bin";

    public static void luuDanhSachTaiLieu() {
        ArrayList<TaiLieu> taiLieus = QuanLySach.getDanhSachTaiLieu();
        if (taiLieus == null || taiLieus.size() == 0) return;
        ArrayList<Sach> saches = new ArrayList<>();
        ArrayList<Bao> baos = new ArrayList<>();
        ArrayList<TapChi> tapChis = new ArrayList<>();
        for (int i = 0; i < taiLieus.size(); i++) {
            if (taiLieus.get(i).getLoaiTaiLieu().equals(LoaiTaiLieu.SACH))
                saches.add((Sach) taiLieus.get(i));
            if (taiLieus.get(i).getLoaiTaiLieu().equals(LoaiTaiLieu.BAO))
                baos.add((Bao) taiLieus.get(i));
            if (taiLieus.get(i).getLoaiTaiLieu().equals(LoaiTaiLieu.TAP_CHI))
                tapChis.add((TapChi) taiLieus.get(i));
        }
        luuDanhSachTaiLieuTheoDuongDan(saches, SACH_PATH);
        luuDanhSachTaiLieuTheoDuongDan(baos, BAO_PATH);
        luuDanhSachTaiLieuTheoDuongDan(tapChis, TAP_CHI_PATH);
    }

    public static ArrayList<TaiLieu> docDanhSachTaiLieu() {
        ArrayList<Sach> saches = (ArrayList<Sach>) docDanhSachTaiLieuTheoDuongDan(SACH_PATH);
        ArrayList<Bao> baos = (ArrayList<Bao>) docDanhSachTaiLieuTheoDuongDan(BAO_PATH);
        ArrayList<TapChi> tapChis = (ArrayList<TapChi>) docDanhSachTaiLieuTheoDuongDan(TAP_CHI_PATH);
        ArrayList<TaiLieu> taiLieus = new ArrayList<>();
        if (saches != null)
            taiLieus.addAll(saches);
        if (baos != null)
            taiLieus.addAll(baos);
        if (tapChis != null)
            taiLieus.addAll(tapChis);
        return taiLieus;
    }

}
