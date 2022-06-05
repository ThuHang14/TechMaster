package DoAn_Java.service;

import DoAn_Java.ArrayList.type;
import DoAn_Java.Controller.Menu;
import DoAn_Java.model.Product;
import Util.Util;
import java.util.*;



public class ProductService {
    Scanner sc = new Scanner(System.in);

    public void showAllProduct(ArrayList<Product> p){
        p.stream().forEach(s-> System.out.println(s));
    }

    public type chooseType(){
        type type = null;
        Menu.menu5();
        int choose = Integer.parseInt(sc.nextLine());
        boolean isCheck = false;
        while (!isCheck){
            switch (choose){
                case 1:
                    type = type.Đồ_gia_dụng;
                    isCheck = true;
                    break;
                case 2:
                    type = type.Thời_trang;
                    isCheck = true;
                    break;
                case 3:
                    type = type.Thực_Phẩm;
                    isCheck = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    isCheck = true;
                    break;
            }
        }
        return type;
    }
    public Product chooseID(ArrayList<Product> p,String id){
        for (Product s : p
        ) {
            if (Objects.equals(s.getId(), id)){
                return s;
            }
        }
        return null;
    }

    public Product createProduct(){

        int id = Integer.parseInt(String.valueOf((0)));
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        System.out.println("Chọn thể loại");
        type type = chooseType();
        System.out.println("Giá bán");
         long sellPrice = Integer.parseInt(sc.nextLine());
        System.out.println("Giá nhập");
         long buyPrice =Integer.parseInt(sc.nextLine());
        System.out.println("Số lượng đã bán");
         int sellNumber=Integer.parseInt(sc.nextLine());
        System.out.println("Tồn kho");
         int inventoryNumber = Integer.parseInt(sc.nextLine());

         return new Product(id,name,type,sellPrice,buyPrice,sellNumber,inventoryNumber);
    }
    public void addNewProduct(ArrayList<Product> p){
        if (p.add(createProduct())){
            System.out.println("Thêm thành công");
        }
        else {
            System.out.println("Thêm thất bại 🥊");
        }
    }

    public void deleteProduct(ArrayList<Product> p){
        System.out.println("Nhập ID sản phẩm 🔍");
        String id = sc.nextLine();
        System.out.println("Kết quả tìm kiếm  ");
        System.out.println(chooseID(p,id));
        if (p.remove(chooseID(p,id))){
            System.out.println("Xóa thành công");
        }
        else {
            System.out.println("Xóa thất bại");
        }
    }

    public long interestProduct(ArrayList<Product> p) {
        System.out.println("Lãi thu được 📈");
        long interest = 0;
        for (Product s : p
        ) {
            long n = s.getSellPrice() - s.getBuyPrice();
             interest = s.getSellNumber() * n;
            System.out.println( "SP"+s.getId() +"\t \t" + s.getName()+"\t \t" + Util.formatMoney(interest));
        }
        return interest;

    }
    public void searchName(ArrayList<Product> p,String Name){
        int count = 0;
        for (Product s : p
             ) {
            if (Name.equalsIgnoreCase(s.getName())){
                count ++;
                System.out.println(s);
            }
        }
        System.out.println(count + " sản phẩm được tìm thấy ");
    }

    public void getType(ArrayList<Product> a , type type){
        for (Product s : a
        ) {
            if (s.getType().equals(type)){
                System.out.println(s);
            }
        }
    }
    public void printType(ArrayList<Product> a){
        boolean isContinue = true;
        while (isContinue){
            Menu.menu5();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    getType(a,type.Đồ_gia_dụng);
                    isContinue = false;
                    break;
                case 2:
                    getType(a,type.Thời_trang);
                    isContinue = false;
                    break;
                case 3:
                    getType(a,type.Thực_Phẩm);
                    isContinue = false;
                default:
                    System.out.println("Null");
            }

        }}

    public void updatePrice(ArrayList<Product> p){
        System.out.println("Nhập ID sản phẩm cần sửa giá  ");
        String id = sc.nextLine();
            System.out.println("Kết quả tìm kiếm ");
            System.out.println(chooseID(p, id));
            if (chooseID(p,id) == null){
                System.out.println("Không có sản phẩm phù hợp 🧶");
            }
            else {
            System.out.println("Nhập giá bán mới 🎢");
            long price = sc.nextLong();
            chooseID(p, id).setSellPrice(price);
            System.out.println("Sản phẩm sau cập nhật 🔊");
            System.out.println(chooseID(p, id));
        }

    }
    public void numberProduct(ArrayList<Product> p){
        int count = 0;
        for (Product s : p
             ) {
         int number = s.getInventoryNumber();
            if (number <= 5){
                count++;
            }
            System.out.println("SP"+s.getId() +"\t \t" + s.getName()+"\t \t" +number);

        }
        System.out.println("📣 📣 📣  "+count+" Sản phẩm sắp hết cần nhập thêm ");

    }
    public ArrayList<Product> bestSeller(ArrayList<Product> p){
            p.sort(new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return o2.getSellNumber() - o1.getSellNumber();
                }
            });
        return p;
        //cach 2
//        p.stream().sorted((o1,o2)->o2.getSellNumber()-o1.getSellNumber())
//                .limit(3)
//                .forEach(s-> System.out.println(s));
    }

    ////////////////////////////////////////
    // Bill

//    historyArray historyArray = new historyArray();
//    ArrayList<TransactionHistory> histories = historyArray.getAllHistory();
//
//
//    public TransactionHistory inputBuy(ArrayList<Product> p){
//        printType(p);
//        System.out.println("Nhập id sản phẩm sẽ nhập thêm");
//        String id = sc.nextLine();
//        if ( chooseID(p,id) != null) {
//            System.out.println("Số lượng nhập thêm");
//            int a = Integer.parseInt(sc.nextLine());
//            int amount = a + chooseID(p, id).getInventoryNumber();
//           chooseID(p, id).setInventoryNumber(amount);
//            System.out.println("Hoàn tất . \n Sản phẩm đã được cập nhập");
//            System.out.println(chooseID(p, id));
//
//            long money = (a * chooseID(p, id).getBuyPrice());
//
//            return new TransactionHistory("Nhập __ ",chooseID(p, id).getId(), chooseID(p, id).getName(), LocalDate.now(), a, "Số tiền cần trả cho nhà cung cấp : ", money);
//        }
//        else {
//            System.out.println("không thấy sản phẩm phù hợp");
//        }
//        return null;
//    }
//    public void buy(ArrayList<Product> p){
//        TransactionHistory add = inputBuy(p);
//        histories.add(add);
//    }
//
//    public TransactionHistory inputSell(ArrayList<Product> p){
//        printType(p);
//        System.out.println("Nhập id sản phẩm muốn xuất đi");
//        String id = sc.nextLine();
//        if ( chooseID(p,id) != null) {
//            chooseID(p,id);
//            System.out.println("Số lượng xuất đi ");
//            int a = Integer.parseInt(sc.nextLine());
//
//            int amount =chooseID(p, id).getInventoryNumber() - a;
//
//            if (amount <0){
//                System.out.println("Không đủ sản phẩm để xuất đi");
//            }
//            else {
//                chooseID(p, id).setInventoryNumber(amount);
//                System.out.println("Sản phẩm còn lại ");
//                System.out.println(chooseID(p,id));
//
//                long money =((long) a *  chooseID(p, id).getSellPrice());
//                return new TransactionHistory("Xuất __ ",chooseID(p, id).getId(),chooseID(p, id).getName(),LocalDate.now(),a,"Số tiền thu được : ",money);
//            }
//            return null;}
//
//        else {
//            System.out.println("không thấy sản phẩm phù hợp");
//        }
//        return null;
//    }
//
//    public void sell(ArrayList<Product> p){
//        TransactionHistory add = inputSell(p);
//        histories.add(add);
//    }
//
//    public void printHistory() {
//        System.out.println("Lịch sử giao dịch : ");
//        for (TransactionHistory s : histories
//        ) {
//            System.out.println(s);
//        }
//        System.out.println("...");
//    }



}
