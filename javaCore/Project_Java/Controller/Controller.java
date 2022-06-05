package DoAn_Java.Controller;

import DoAn_Java.ArrayList.*;
import DoAn_Java.model.*;
import DoAn_Java.service.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Controller {
    Scanner sc = new Scanner(System.in);
    StaffService staffService = new StaffService();
    Staff s = new Staff();
    DoAn_Java.ArrayList.staffArray staffArray = new staffArray();
    ArrayList<Staff> a = staffArray.getAllStaff();

    DoAn_Java.ArrayList.productArray productArray = new productArray();
    ArrayList<Product> p = productArray.getAllProduct();
    ProductService productService = new ProductService();

    DoAn_Java.service.cvService cvService = new cvService();
    DoAn_Java.ArrayList.cvArray cvArray = new cvArray();
    ArrayList<Cv> c = cvArray.getAllCv();


    Bill bill = new Bill();
    DoAn_Java.ArrayList.historyArray historyArray = new historyArray();
    ArrayList<TransactionHistory> histories = historyArray.getAllHistory();

    CustomerService customerService = new CustomerService();

    In_Out inOut = new In_Out();
    in_outArray in_out = new in_outArray();
    ArrayList<In_Out> arrayIn = in_out.arrayCheck();

    public void menu2(){//staff admin
        boolean check = true;
        while (check){
            Menu.menu2();
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1 :
                    staffService.showAllStaff(a);
                    break;
                case 2 :
                    staffService.addNewProduct(a);
                    break;
                case 3:
                    staffService.deleteStaff(a);
                    break;
                case 4:
                    staffService.updateStaff(a);
                    break;
                case 5 :
                    staffService.printShift(a);
                    break;
                case 6 :
                    arrayIn.forEach(a-> System.out.println(a));
                    break;
                case 0:
                    check = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;


            }
        }
    }

    public void menu6(){//product admin
        boolean check = true;
        while (check){
            Menu.menu6();
            int choose = Integer.parseInt(sc.nextLine());

            switch (choose){
                case 1 :
                    productService.showAllProduct(p);
                    break;
                case 2 :
                    productService.addNewProduct(p);
                    break;
                case 3:
                   productService.deleteProduct(p);
                    break;
                case 4:
                    productService.interestProduct(p);
                    break;
                case 5 :
                    System.out.println("Nhập tên sản phẩm muốn tìm");
                    String name = sc.nextLine();
                    productService.searchName(p,name);
                    break;
                case 6 :
                    productService.printType(p);
                    break;
                case 7 :
                    productService.updatePrice(p);
                    break;
                case 8:
                    productService.numberProduct(p);
                    break;
                case 9:
//                    for ( Product m : productService.bestSeller(p)
//                    ) {
//                        for (int i = 0; i <3 ; i++) {
//                             System.out.println(p.get(i));
//                        }
//                        break;
//                    }
                    productService.bestSeller(p).stream().limit(3).forEach(s-> System.out.println(s));

                    break;
                case 0:
                    check = false;
                    break;
                default:
                    System.out.println("Không có lụa chọn này");
                    break;
            }
        }
    }

    public void menu1(){//main admin
        boolean check = true;
        while (check){
            Menu.menu1();
            int choose = Integer.parseInt(sc.nextLine());

            switch (choose){
                case 1 :
                    menu2();
                    break;
                case 2 :
                    menu6();
                    break;
                case 3:
                    menu8();
                    break;
                case 4 :
                    bill.printHistory(histories);
                    break;
                case 5 :
                    menu9();
                    break;
                case 0:
                    check = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }
    }

    public void menu8(){//bill admin
        boolean checks = true;
        while (checks){
            Menu.menu8();
            int choose = Integer.parseInt(sc.nextLine());

            switch (choose){
                case 1 :
                  bill.buy(p,histories);
                    break;
                case 2 :
                    bill.sell(p,histories);
                    break;
                case 0:
                    checks = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;


            }
        }
    }

    public void menu9(){//cv admin
        boolean check = true;
        while (check){
            Menu.menu9();
            int choose = Integer.parseInt(sc.nextLine());

            switch (choose){
                case 1 :
                   cvService.showCV(c);
                    break;
                case 2 :
                    System.out.print("lọc từ năm : ");
                    int year1 = Integer.parseInt(sc.nextLine());
                    System.out.print("  Đến năm : ");
                    int year2 = Integer.parseInt(sc.nextLine());
                    cvService.getYearBirth(year1,year2,c);
                    break;
                case 3:
                    cvService.printGenderCV(c);
                    break;
                case 4 :
                    cvService.printShiftCV(c);
                    break;
                case 5 :
                    System.out.print("ID của ứng viên muốn tuyển : ");
                    String id = sc.nextLine();
                    cvService.addNewCV(c, (id),a);
                    break;
                case 0:
                    check = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }
    }

    public void menu10(){//main menu
        boolean check = true;
        while (check){
            Menu.menu10();
            int choose = Integer.parseInt(sc.nextLine());

            switch (choose){
                case 1 :
                  //  Account accountAdmin = new Account("admin1","123");
                   // AccountService.longin(accountAdmin);
                    menu1();
                    break;
                case 2 :
                    menu11();
                    break;
                case 3 :
                    productService.printType(p);
                    break;
                case 4:
                    customerService.addCV(c);
                    break;
                case 0:
                    System.out.println("BYE");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }
    }


    public void menu11(){//Staff longin
        boolean checks = true;
        while (checks){
            Menu.menu11();
            int choose = Integer.parseInt(sc.nextLine());

            switch (choose){
                case 1 :
                    System.out.print("ID của ban : ");
                    String id = sc.nextLine();
                    String passID = StaffService.getIDStaff(a, id).getId() + "123";
                    Account StaffAccount = new Account(StaffService.getIDStaff(a, id).getId(),passID);
                    staffService.staffLogin(a,id,StaffAccount);
                    System.out.println("NV"+StaffService.getIDStaff(a, id));
                    Menu12();
                    break;
                case 0:
                    checks = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;


            }
        }
    }

    public void Menu12(){
        boolean check = true;
        while (check){
            Menu.menu12();
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1 :
                    System.out.print("xác nhận lại ID : ");
                    String id = sc.nextLine();
                    staffService.chooseCome(a,id,arrayIn);
                    break;
                case 2 :
                    staffService.printShift(a);
                    break;
                case 3:
                    productService.printType(p);
                    break;
                case 4 :
                    menu8();
                    break;
                case 5 :
                    bill.printHistory(histories);
                    break;
                    case 6 :
                        productService.numberProduct(p);
                    break;
                case 7 :
//                    for ( Product m : productService.bestSeller(p)
//                    ) {
//                        for (int i = 0; i <3 ; i++) {
//                            System.out.println(p.get(i));
//                        }
//                        break;
//                    }
                    productService.bestSeller(p).stream().limit(3).forEach(s-> System.out.println(s));
                    break;
                case 0:
                    check = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }
    }


}
