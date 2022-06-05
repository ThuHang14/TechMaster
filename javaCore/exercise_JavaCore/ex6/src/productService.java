import java.util.Scanner;

public class productService {
    public Product input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("- Nhập id : ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.printf("- Nhập tên sản phẩm : ");
        String ten = sc.nextLine();
        System.out.printf("- Nhập số lượng : ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.printf("- Nhập đơn vị : ");
        String donVi = sc.nextLine();
        System.out.printf("- Giá nhâp của sản phẩm : " );
        int giaNhap = sc.nextInt();
        System.out.printf("- Giá bán của sản phẩm : ");
        int giaBan = sc.nextInt();
        System.out.printf("- Số lượng đã bán ra : ");
        int soLuongBan = sc.nextInt();
        Product newProduct = new Product(id,ten,soLuong,donVi,giaNhap,giaBan,soLuongBan);
return newProduct;

    }

    public double laiSp(int giaBan,int giaNhap,int soLuongBan){
        return (giaBan - giaNhap)* soLuongBan;
    }


public Product[] forProduct(int size){
        Product[] products = new Product[size];
        for(int i = 0;i<size; i++){
            System.out.println("\n Sản phẩm thứ : "+(i+1));
            products[i] = input();
        }
        return products;
}

    public void show(Product[] products){
        for(Product s : products){
            System.out.println(s + "\n"+"\t Lãi của sản phẩm : "+ +laiSp(s.gaiBan,s.giaNhap,s.soLuongBan)+" VNĐ");
        }
    }



































}
