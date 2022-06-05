import java.util.Scanner;
import java.util.regex.Pattern;

public class RegisterService {
    Scanner sc = new Scanner(System.in);

    public void newMail() { //test3-1@gmail.com
        boolean check = true;
        while (true) {
            System.out.println("nhap mail");
            String mail = sc.nextLine();

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

    public void newUser() {
        boolean check = true;
        while (true) {
            System.out.println("nhap username");
            String name = sc.nextLine();

            Pattern pattern = Pattern.compile("^[a-z0-9._-]{3,15}$");
            if (pattern.matcher(name).find()) {
                System.out.println("tao thanh cong");

                check = false;
                break;
            } else {
                System.out.println(" khong hop le \n \t ----------> tao lai");
            }

        }
    }

    public void newPass() {
        boolean check = true;
        while (true) {
            System.out.println("nhap pass");
            String pass = sc.nextLine();

            Pattern pattern = Pattern.compile("^[a-zA-Z0-9._-]{7,15}$");
            if (pattern.matcher(pass).find()) {
                System.out.println("tao thanh cong");

                check = false;
                break;
            } else {
                System.out.println(" khong hop le \n \t ----------> tao lai");
            }

        }
    }

    public void register(){
        System.out.println("Tạo một tài khoản mới");
        newMail();
        newUser();
        newPass();
        System.out.println("Đăng kí thành công");

    }
}

