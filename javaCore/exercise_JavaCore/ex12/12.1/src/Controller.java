import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner (System.in);
    Service service =new Service();
    Account account = service.account;

    public void mainMenu(){
        System.out.println("1 - Truy vấn số dư tài khoản");
        System.out.println("2 - Chuyển tiền");
        System.out.println("3 - Xem lịch sử giao dịch");

    }
    public void Menu(){

        boolean check = true;
        while (check){
            mainMenu();
            int a = Integer.parseInt(sc.nextLine());
            switch (a){
                case 1 :
                    service.balance(account);
                    break;
                case 2 :
                    service.bank();
                    break;
                case 3:
                    ArrayList<bankservice> bank = service.bank();
                    service.history(bank);
                    break;
                default:
                    System.out.println("k co lua chon nay");
            }
        }
    }

    public void mainBank(){
        System.out.println("1 - BIDV");
        System.out.println("2 - MB");
        System.out.println("3 - CAKE");
        System.out.println("4 - VP");
        System.out.println("5 - TP");

    }


}
