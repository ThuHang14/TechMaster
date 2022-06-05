import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    public ArrayList<Product> getAllProduct(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,"dien thoai","dien thoai thong minh",10000000,5,5,hang.Samsung,Type.Dien_Thoai));
        products.add(new Product(2,"dien thoai","dien thoai thong minh",9000000,51,45,hang.huawei,Type.Dien_Thoai));
        products.add(new Product(3,"laptop","laptop",30000000,45,35,hang.Samsung,Type.Laptop));
        products.add(new Product(4,"but","but thong minh",2000000,59,15,hang.oppo,Type.Phu_Kien));
        products.add(new Product(5,"ban chai","ban chai thong minh",250000,58,15,hang.xiaomi,Type.Apple));
        products.add(new Product(6,"op dien thoai","op dien thoai thong minh",100000,575,95,hang.Samsung,Type.Phu_Kien));

        return products;
    }

public void getType( ArrayList<Product> products,Type type){
    for (Product p: products
         ) {
        if (p.getDanhmuc().equals(type)){
            System.out.println(p);
        }
    }
}
public void getHang(ArrayList<Product> products,hang hang){
    for (Product p: products
         ) {
        if (p.getHang().equals(hang)){
            System.out.println(p);
        }
    }
}

    public void getGia(ArrayList<Product> products,long gia,long gias){
        for (Product p: products
        ) {
            if (p.getGia() > gia && p.getGia() <gias){
                System.out.println(p);
            }
        }
    }

    public void ten(ArrayList<Product> products,String ten){
        int count = 0;
        for (Product p: products
        ) {
            if (ten.equalsIgnoreCase(p.getTen())){
                count ++;
                System.out.println(p);
            }
        }
        System.out.println(count +" ket qua duoc tim thay");
    }

    public void getsoLuong( ArrayList<Product> products,Type type){
        int soLuong = 0;
        for (Product p: products
        ) {
            if (p.getDanhmuc().equals(type)){
                soLuong++;
            }
        }
        System.out.println(soLuong);
    }
}
