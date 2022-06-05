import java.util.Scanner;

public class coltroler {
    longInService l = new longInService();
    RegisterService r = new RegisterService();
    Scanner sc = new Scanner(System.in);


    public void Menu(){
    System.out.println(" 1 - Đăng nhập ");
    System.out.println("2 - Quên tài khoản");
    System.out.println("3 - Đăng ký");
    System.out.println("0 - thoat");

    }
public void mainMenu(){
    while (true){
        Menu();
        int a = Integer.parseInt(sc.nextLine());
        switch (a){
            case 1 :
                l.longins();
                break;
            case 2 :
                l.account();
                break;
            case 3 :
                r.register();
                break;
            case 0 :
                System.exit(0);
                break;
            default:
                System.out.println("khong co lua chon nay");
                break;
        }
    }
    }
}
