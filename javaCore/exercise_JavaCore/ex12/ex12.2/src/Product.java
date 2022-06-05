public class Product {
    private int maSP;
    private String ten;
    private String moTa;
    private long gia;
    private int soLuong;
    private int soLuongBan;
    private hang hang;
    private Type danhmuc;

    public Product(int maSP, String ten, String moTa, long gia, int soLuong, int soLuongBan, hang hang, Type danhmuc) {
        this.maSP = maSP;
        this.ten = ten;
        this.moTa = moTa;
        this.gia = gia;
        this.soLuong = soLuong;
        this.soLuongBan = soLuongBan;
        this.hang = hang;
        this.danhmuc = danhmuc;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public hang getHang() {
        return hang;
    }

    public void setHang(hang hang) {
        this.hang = hang;
    }

    public Type getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(Type danhmuc) {
        this.danhmuc = danhmuc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSP=" + maSP +
                ", ten='" + ten + '\'' +
                ", moTa='" + moTa + '\'' +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                ", soLuongBan=" + soLuongBan +
                ", hang='" + hang + '\'' +
                ", danhmuc=" + danhmuc +
                '}';
    }
}
