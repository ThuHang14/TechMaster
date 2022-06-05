import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Service service = new Service();
    ArrayList<Product> products = service.getAllProduct();

    public void Menu(){
        System.out.println("1 In thông tin dựa trên danh mục. ");
        System.out.println("2 In thông tin các sản phẩm dựa theo hãng ");
        System.out.println("3 In thông tin sản phẩm dựa trên mức giá.");
        System.out.println("4 (tìm kiếm)");
        System.out.println("5 Liệt kê mỗi danh mục có bao nhiêu sản phẩm.");
    }

    public void mainMenu(){
        Type type = null;
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (true){
            Menu();
            int a = Integer.parseInt(sc.nextLine());
            switch (a){
                case 1 :
                    type();
                    break;

                case 2 :
                    hang();
                    break;

                case 3 :
                    gia();
                    break;
                case 4 :
                    System.out.println(" nhap ten can tim ");
                    String name = sc.nextLine();
                    service.ten(products,name);
                    break;
                case 5 :
                    soLuong();
                    break;
                case 0 :
                    System.exit(0);
                    check = false;
                    break;
                default:
                    System.out.println(" k co lua chon nay ");
                    break;

            }
        }
    }

    public void loai(){
        System.out.println("1 dien thoai ");
        System.out.println("2 apple ");
        System.out.println("3 laptop");
        System.out.println("4 phu kien.");
        System.out.println("0 thoat");
        System.out.println("ban chon ");
    }

    public Type type() {
        Type type = null;
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check) {
            loai();
            int a = Integer.parseInt(sc.nextLine());
            switch (a) {
                case 1:
                    service.getType(products, Type.Dien_Thoai);
                    break;

                case 2:
                    service.getType(products, Type.Apple);
                    break;

                case 3:
                    service.getType(products, Type.Laptop);
                    break;
                case 4:
                    service.getType(products, Type.Phu_Kien);
                    break;

                case 0:
                    check = false;
                    break;
                default:
                    System.out.println(" k co lua chon nay ");
                    break;

            }
        }
        return null;
    }

    public void menuHang(){
        System.out.println("1 samsung ");
        System.out.println("2 xiaomi ");
        System.out.println("3 oppo");
        System.out.println("4 huawei");
        System.out.println("0 thoat");
        System.out.println("ban chon ");
    }

    public hang hang(){
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check){
            menuHang();
            int a = Integer.parseInt(sc.nextLine());
            switch (a){
                case 1 :
                    service.getHang(products,hang.Samsung);
                    break;

                case 2 :
                    service.getHang(products,hang.xiaomi);
                    break;

                case 3 :
                    service.getHang(products,hang.oppo);
                    break;
                case 4 :
                    service.getHang(products,hang.huawei);
                    break;

                case 0 :
                    check = false;
                    break;
                default:
                    System.out.println(" k co lua chon nay ");
                    break;

            }
        }
        return null;
    }

    public void menuGia(){
        System.out.println("1 Dưới 2 triệu ");
        System.out.println("2 Từ 2 - 4 triệu ");
        System.out.println("3 Từ 4 - 7 triệu");
        System.out.println("4 Từ 7 - 13 triệu");
        System.out.println("5 Trên 13 triệu");
        System.out.println("0 thoat");
        System.out.println("ban chon ");
    }

    public void gia(){
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check){
            menuGia();
            int a = Integer.parseInt(sc.nextLine());
            switch (a){
                case 1 :
                    service.getGia(products,0,2000000);
                    break;

                case 2 :
                    service.getGia(products,2000000,4000000);
                    break;

                case 3 :
                    service.getGia(products,4000000,7000000);
                    break;
                case 4 :
                    service.getGia(products,7000000,13000000);
                    break;
                case 5 :
                    service.getGia(products,13000000,999999999);
                    break;

                case 0 :
                    check = false;
                    break;
                default:
                    System.out.println(" k co lua chon nay ");
                    break;

            }
        }
    }

    public void soLuong() {
        System.out.print("phu kien ");
        service.getsoLuong(products,Type.Phu_Kien);
        System.out.print("laptop ");
        service.getsoLuong(products,Type.Laptop);
        System.out.print("apple ");
        service.getsoLuong(products,Type.Apple);
        System.out.print("dien thoai ");
        service.getsoLuong(products,Type.Dien_Thoai);
    }

}
