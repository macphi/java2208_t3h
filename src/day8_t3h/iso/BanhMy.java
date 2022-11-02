package day8_t3h.iso;

public class BanhMy extends AbtractISO {

    @Override
    protected void chuanBiVatLieu() {
        System.out.println("Bot my, bo, sua: ");
        System.out.println("Hello world");
    }

    @Override
    protected void sanXuatCongNghiep() {
        System.out.println("Nuong trong lo 200 do C");
    }

    @Override
    protected void atvs() {
        System.out.println("Khong pham mau chat bao quan");
    }
}
