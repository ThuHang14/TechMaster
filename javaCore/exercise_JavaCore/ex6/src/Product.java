
public class Product {
    public int id;
    public String ten;
    public int soLuong;
    public String donVi;
    public int giaNhap,gaiBan,soLuongBan;

    @Override
    public String toString() {
        return "--> Product : " +
                "id : " + id + " / Sản phẩm : " + ten ;

    }

    public Product(int id, String ten, int soLuong, String donVi, int giaNhap, int gaiBan, int soLuongBan) {
        this.id = id;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donVi = donVi;
        this.giaNhap = giaNhap;
        this.gaiBan = gaiBan;
        this.soLuongBan = soLuongBan;
    }
























































}

