package controrller;

import Service.CustomerService;
import Service.SoNguyenTo;
import View.Customer;


import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);
    CustomerService customer = new CustomerService();
    ArrayList<Customer> array = customer.getAllCustomer();

    public void Menu1(){
        boolean icheck = true;
        while (icheck){
            Menu.Menu1();
            int a = Integer.parseInt(sc.nextLine());
            switch (a){
                case 0:
                    System.exit(0);
                    break;
                case 1 :
                    boolean checks = true;
                    while (checks) {
                        System.out.println("nhap so muon kiem tra");
                    String input = sc.nextLine();
                    if (input.equalsIgnoreCase("X")){
                        checks = false;
                        Menu1();
                    }
                    else {
                            int n = Integer.parseInt(input);
                            boolean check = true;
                            SoNguyenTo.soNguyTo(n, check);
                        }
                    }


                case 2 :
                    Menu2();
                        break;
                default:
                    System.out.println("khong co lua chon nay 🧛‍️");


            }
        }
    }

    public void Menu2(){
        boolean icheck = true;
        while (icheck){
            Menu.Menu2();
            int a = Integer.parseInt(sc.nextLine());
            switch (a){
                case 0:
                    icheck = false;
                    break;
                case 1 :
                        customer.show(array);
                    break;

                case 2 :
                    customer.chooseGender(array);
                    break;
                case 3 :
                    customer.newCustomers();
                    if(array.add(customer.newCustomers())){
                        System.out.println("ok");
                    }else {
                        System.out.println("Thu lai");
                    }
                    break;
                case 4:
                    System.out.println("id tim kiem");
                    String id = sc.nextLine();
                    customer.searchID(array,id);
                    break;
                default:
                    System.out.println("khong co lua chon nay 🧛‍️");

            }
        }
    }

}
