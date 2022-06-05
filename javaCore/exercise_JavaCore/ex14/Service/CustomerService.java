package Service;

import Validate.RegexUtil;
import View.Customer;
import View.GENDER;

import controrller.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
    Scanner sc = new Scanner(System.in);

    public static ArrayList<Customer> getAllCustomer(){
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("KH123456987","Denys Denizet", GENDER.Female,"1326 Brentwood Court","0956214597","ddenizet0@canalblog.com"));
        customers.add(new Customer("KH985467892","Torrance Tomaszkiewicz", GENDER.Male,"68884 Mifflin Pass","0321475825","ttomaszkiewicz2@uiuc.edu"));
        customers.add(new Customer("KH927652189","Mandel Artois", GENDER.Male,"89196 Trailsway Street","0321456999","gcarsberg6@xrea.com"));
        customers.add(new Customer("KH957135469","Grayce Carsberg", GENDER.Female,"621 Mockingbird Pass","0965262538","btesimon9@intel.com"));

        return customers;
    }

    public void show(ArrayList<Customer> customers){
        for ( Customer c : customers
        ) {
            System.out.println(c);
        }
    }

    public GENDER chooseGender(ArrayList<Customer> customers) {
        GENDER gender = null;
        Menu.Menu3();
        int choose = Integer.parseInt(sc.nextLine());
        boolean isCheck = true;
        while (isCheck){
            switch (choose){
                case 1:
                    gender = GENDER.Male;
                    getId(customers,gender);
                    break;
                case 2:
                    gender = GENDER.Female;
                    getId(customers,gender);
                    break;
                case 0:
                    isCheck = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này, vui lòng chọn lại");


            }
        }
        return gender;
    }
    public void getId(ArrayList<Customer> customers,GENDER gender){
        for ( Customer c: customers
             ) {
            if (c.getGender().equals(gender)){
                System.out.println(c);
            }
        }
    }

    public Customer newCustomers(){
        System.out.println("id :");
         String id = sc.nextLine();
        RegexUtil.newId(id);
        System.out.println("name :");
         String name = sc.nextLine();
        System.out.println("gender :");
        GENDER gender = chooseGender(getAllCustomer());
        System.out.println("adderss :");
         String address = sc.nextLine();
        System.out.println("phone :");
         String phone =sc.nextLine();
         RegexUtil.newPhone(phone);
        System.out.println("mail");
         String mail = sc.nextLine();
         RegexUtil.newMail(mail);

         return new Customer(id,name,gender,address,phone,mail);


    }

public void searchID(ArrayList<Customer> customers,String id){
    for ( Customer customer : customers
    ) {
        if (id.equals(customer.getId()) ){
            boolean check = true;
           while (check){
               Menu.Menu4();
               int a = Integer.parseInt(sc.nextLine());
               switch (a){
                   case 0:
                       check = false;
                       break;
                   case 1 :
                       String Newid = sc.nextLine();
                       updateCustomer(customer,Newid);
                       break;
                   case 2 :
                       customers.remove(id);
                       if (customers.remove(id)){
                           System.out.println("ok");
                       }
                       else {
                           System.out.println("thu lai");
                       }

                       break;
                   default:
                       System.out.println("khong co lua chon nay 🧛‍️");

               }  }
           }

        else {
            System.out.println("khong tim thay");
            break;
        }  }
    }

    public void updateCustomer(Customer customer,String id){
        customer.setId(id);
        System.out.println("ok");
        System.out.println(customer);
    }



}
