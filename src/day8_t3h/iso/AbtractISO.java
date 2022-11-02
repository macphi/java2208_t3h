package day8_t3h.iso;

// class abtract => co the dinh nghia duoc phuong thuc abtract
public abstract class AbtractISO {
    // Design pattern template
    public void sanXuat() {
        chuanBiVatLieu();
        sanXuatCongNghiep();
        atvs();
    }

    protected abstract void chuanBiVatLieu(); // Phuong thuc abtract

    protected abstract void sanXuatCongNghiep();

    protected abstract void atvs();

}
