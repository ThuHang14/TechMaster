package DoAn_Java.service;

import java.util.Scanner;

import DoAn_Java.model.Account;
public class AccountService {

    Scanner sc = new Scanner(System.in);


    public AccountService(String id, String passID) {
    }


    public static void longin(Account account){

        Scanner sc = new Scanner (System.in);
        boolean check = true;
        while (check){
            System.out.println("Name :");
            String phone = sc.nextLine();
            if (phone.equals(account.getPhone())){
                checkPass(account);
                check = false;
            }

            else {
                System.out.println("không hợp lệ \n \t Thử lại ");
            }
        }
    }

    public static void checkPass(Account account){
        Scanner sc = new Scanner (System.in);

        boolean ischeck = true;
        while (ischeck){
            System.out.println("pass :");
            String pass = sc.nextLine();

            if (pass.equals(account.getPass())){
                System.out.println("Chào Mừng 🙋‍️🙋‍️");
                ischeck = false;
                break;
            }
            else if (pass.equalsIgnoreCase("x"))
            {
                System.out.println("nhập mã OTP :");
                String otp = sc.nextLine();
                System.out.println("Đặt lại mật khẩu ");
                String newPass = sc.nextLine();
                account.setPass(newPass);
                longin(account);
                break;
            }

            else {
                System.out.println("Nhập sai \n \t Thử lại hoặc chọn x để setPass");
            }
        }
    }
}
