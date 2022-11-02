package day8_t3h.iso;

public class NuocCham extends AbtractISO {

    @Override
    protected void chuanBiVatLieu() {
        System.out.println("Ca tuoi ");
    }

    @Override
    protected void sanXuatCongNghiep() {
        System.out.println("Ca ngam muon u trong 3 thang");
    }

    @Override
    protected void atvs() {
        System.out.println("Khong chat kich thich");
    }
}
