package Validate;

import Service.CustomerService;
import View.Customer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexUtil {
    Scanner sc = new Scanner(System.in);

   //
    public static void newMail( String mail) {
        boolean check = true;
        while (true) {
            System.out.println("nhap mail");

            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); //khoi tao regex
            //ktra co matcher hay khong
            if (pattern.matcher(mail).find()) {
                System.out.println("tao mail thanh cong");
                check = false;
                break;
            } else {
                System.out.println("mail khong hop le \n \t -----------> tao lai");
            }

        }
    }

    public static void newId(String id) {
        CustomerService customer = new CustomerService();
        ArrayList<Customer> array = customer.getAllCustomer();

        for ( Customer c: array
        ) {
            boolean check = true;
            while (true) {
                System.out.println("nhap Id");
                Pattern pattern = Pattern.compile("[KH]\\d{9}");
                if (pattern.matcher(id).find() && !id.equals(c.getId())) {
                    System.out.println("tao thanh cong");
                    check = false;
                    break;
                } else {
                    System.out.println(" khong hop le");
                    check = false;
                    break;
                }

            }
        }


    }

    public static void newPhone( String phone) {
        boolean check = true;
        while (true) {
            System.out.println("nhap phone");

            Pattern pattern = Pattern.compile("0[981735](\\d|\\s|-|\\.){10}");
            if (pattern.matcher(phone).find()) {
                System.out.println("tao thanh cong");

                check = false;
                break;
            } else {
                System.out.println(" khong hop le \n \t ----------> tao lai");
            }

        }
    }

}
