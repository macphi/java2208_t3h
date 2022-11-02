package day8_t3h.iso;

public class BanhKeo extends AbtractISO {
    @Override
    protected void chuanBiVatLieu() {
        System.out.println("Duong, bot keo");
    }

    @Override
    protected void sanXuatCongNghiep() {
        System.out.println("Dun soi hop chat roi dong cung");
    }

    @Override
    protected void atvs() {
        System.out.println("Khong chat bao quan");
    }
}
