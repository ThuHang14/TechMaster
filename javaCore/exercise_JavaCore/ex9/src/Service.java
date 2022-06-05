
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    Product Product = new Product();
    Scanner sc = new Scanner(System.in);
    Controller controller ;

    public ArrayList<Product> getAllProduct(){
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(0, "ao tac",300000,10, type.FASHION,10));
        products.add(new Product(1, "quan",250000,12, type.FASHION,5));
        products.add(new Product(2, "noi",900000,5, type.HOUSEWARE,1));
        products.add(new Product(3, "tat",30000,10, type.FASHION,10));
        products.add(new Product(4, "carrot",10000,50, type.FOOD,50));
        products.add(new Product(5,"ao dai",980000,25, type.FASHION,25));
        return products;
    }


    public void show(ArrayList<Product> products){
        System.out.println("------------------------------------------------");
        for ( Product p: products
        ){
            System.out.println(p);

        }

    }

    public void searchName(ArrayList<Product> products,String name){
//        System.out.println("    *   Tim kiem theo ten san pham  *   ");
//        System.out.println("------------------------------------------------");
//        int count = 0;
//        System.out.println("nhap ten san pham muon tim :");
//        String search = sc.nextLine();
//        for ( Product p: products
//             ) {
//            if(p.getName().toLowerCase().contains(search.toLowerCase())){
//                count ++;
//              System.out.println(p);
//            }
//
//        }
//        System.out.println(" co "+count+" san pham duoc tim thay ");
        for ( Product p : products
             ) {
            if(p.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(p);
            }
        }
    }



    public void searchType( ArrayList<Product> products, type type){
//        System.out.println("    *   Tim kiem theo phan loai san pham    *    ");
//        System.out.println("------------------------------------------------");
//        System.out.println("1.   Do gia dung");
//        System.out.println("2.  Thuc pham");
//        System.out.println("3.  Thoi trang");
//        System.out.print("  **  lua chon cua ban  :  ");
//        int choice = Integer.parseInt(sc.nextLine());
//
//        switch (choice) {
//            case 1:
//                System.out.println("  Do gia dung :");
//                for ( Product p: products
//                ){
//                    if(p.getType().equals("Do_gia_dung")){
//                    System.out.println(p);
//                }}
//                break;
//            case 2 :
//                System.out.println(" Thuc pham :");
//                for ( Product p: products
//                ){
//                    if(p.getType().equals("Thuc_pham")){
//                        System.out.println(p);
//                    }}
//                break;
//            case 3:
//                System.out.println("Thoi trang :");
//                for ( Product p: products
//                ){
//                    if(p.getType().equals("Thoi_trang")){
//                        System.out.println(p);
//                    }
//                }
//break;
//
//            default:
//                System.out.println("khong co lua chon nay ");
//
//        }
        for (Product p: products
             ) {
            if(p.getType().equals(type));
            System.out.println(p);
        }
    }

    public Product getProductById(ArrayList<Product> products,int id){
        for (Product p : products
             ) {
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public void update(Product product , String newName,long newPrice ){

//        System.out.println("    *   Sua mot san pham    *   ");
//        System.out.println("------------------------------------------------");
//        System.out.println("nhap id cua san pham muon sua gia va ten : ");
//
//        int a = sc.nextInt();
//
//            for (Product p : getAllProduct()) {
//                if (a == p.getId()) {
//                    System.out.print("    -   sua ten : ");
//                    sc.nextLine();
//                    String name = sc.nextLine();
//                    p.setName(name);
//                    System.out.print("    -   sua gia : ");
//                    double price = sc.nextDouble();
//                    p.setPrice(price);
//
//                    System.out.println(p);
//                    break;
//                }
//            }
//
 product.setName(newName);
 product.setPrice(newPrice);
        System.out.println(" san pham sau cap nhat ");
        System.out.println(product);
    }



    public void delete(ArrayList<Product> products){
        System.out.println("    *   Xoa mot san pham    *   ");
        System.out.println("------------------------------------------------");
        System.out.print(" chon id cua san pham muon xoa :  ");
        int ids = sc.nextInt();


            Product remove = products.remove(ids);
            System.out.println("    ! xoa thanh cong "+"\n"+"  -    san pham con lai : ");

        for ( Product p : products
             ) {
            System.out.println(p);


        }

    }

        public Product create() {
//            System.out.println("    * Them mot san pham     *   ");
//            System.out.println("------------------------------------------------");
//            System.out.println("ban muon them bao nhieu san pham : ");
//            int number = sc.nextInt();
//            Product[] products1 = new Product[number];
//
//            Product newProduct = null;
//            for (int i = 0; i < number; i++) {
//                System.out.println("nhap thong tin cho san pham moi thu " + (i + 1));
//                System.out.print("    - id :");
//                int id = sc.nextInt();
//                System.out.print("    - name :");
//                sc.nextLine();
//                String name = sc.nextLine();
//                System.out.print("    - price :");
//                double price = sc.nextDouble();
//                System.out.print("    - amount : ");
//                int amount = sc.nextInt();
//                System.out.print("    - type :");
//                sc.nextLine();
//                String type = sc.nextLine();
//                System.out.print("    - sell number:");
//                int sellNumber = sc.nextInt();
//
//                newProduct = new Product(id, name, price, amount, type, sellNumber);
//                System.out.println(newProduct);
//
//            }
//            return newProduct;
            System.out.println("Nhập id: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập tên sản phẩm:");
            String name = sc.nextLine();
            System.out.println("Nhập giá bán: ");
            long price = sc.nextLong();
            System.out.println("Nhập số lượng: ");
            int amount = sc.nextInt();
            sc.nextLine();
            System.out.println("Chọn loại mặt hàng: ");
           type types =  choosetype();
            System.out.println("Nhập số lượng bán được: ");
            int sellNumber = Integer.parseInt(sc.nextLine());

            return new Product(id,name,price,amount,types,sellNumber);
    }

    public type choosetype(){
        type types = null;
        controller.categoryMenu();
        int choose = Integer.parseInt(sc.nextLine());
        boolean check = false;
        while (!check){
            switch (choose) {
                case 1 :
                    types = type.HOUSEWARE;
                    check = true;
                    break;
                case 2 :
                    types = type.FASHION;
                    check = true;
                    break;
                case 3 :
                    types = type.FOOD;
                    check = true;
                    break;
                default:
                    System.out.println(" chon sai 👩");
            }
        }
        return types;
    }

//    public void add(Product product,ArrayList<Product> products){
//        products.add(product);
//}


//    public void adds(ArrayList<Product> products){
//        System.out.println("nhap :");
//        products.add(7,new Product());
//    }


}
