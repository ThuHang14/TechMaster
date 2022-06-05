import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);
    Service service ;
    ArrayList<Product> products ;



    public void menu(){
        System.out.println("-----------------------------------------");
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Xem toàn bộ sản phẩm");
        System.out.println("2 - Tìm sản phẩm theo tên");
        System.out.println("3 - Liệt kê sản phẩm theo loại mặt hàng");
        System.out.println("4 - Cập nhật thông tin sản phẩm");
        System.out.println("5 - Xóa sản phẩm");
        System.out.println("6 - Thêm sản phẩm vào danh sách");
        System.out.println("0 - Thoát chương trình");
    }

    public void categoryMenu(){
        System.out.println("Chọn danh mục sản phẩm");
        System.out.println("1 - Đồ gia dụng");
        System.out.println("2 - Thực phẩm");
        System.out.println("3 - Thời trang");
    }


    public void mainMenu(){
        boolean isContinue = true;
        while (true){
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1 :
                    service.show(products);
                    break;
                case 2 :
                    System.out.println(" nhap ten ");
                    String name = sc.nextLine();
                    System.out.println(" danh sach tim duoc ");
                    service.searchName(products,name);
                case 3 :
                    System.out.println( );
                    //service.searchType();
                    break;
                case 4 :
                    update();
                    break;
                case 5 :
                    service.delete(products);
                    break;
                case 6:
                    service.create();
                    break;
                case 7:
                    System.out.println("Danh sách sap xep: ");
                    Collections.sort(products);
                    service.show(products);
                    break;
                case 0 :
                    System.exit(0);
                    break;
                default:
                    System.out.println(" khong co lua chon nay ");
                    break;
            }

        }

    }

    public void update(){
        System.out.println("nhap id muon cap nhat");
        int id = sc.nextInt();
        sc.nextLine();
        service.getProductById(products , id);
        System.out.println(" san pham tim dduoc :");
        System.out.println(service.getProductById(products , id));
    }


}
