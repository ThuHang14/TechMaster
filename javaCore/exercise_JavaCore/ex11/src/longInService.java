
import java.util.Scanner;

public class longInService {
Scanner sc = new Scanner(System.in);
LongIn longIn = new LongIn("Abc","123456","acb@gmail.com");

 public void longinUser(){
        boolean check = true;
        while (true){

            System.out.println("username :");
            sc.nextLine();
            String inputUsername = sc.nextLine();

            if ( longIn.getUserName().equals(inputUsername)){
                System.out.println(" da tim thay ten nguoi dung ");
                longinPass();
                 check = false;
                 break;
                 }
            else
            {
                System.out.println(" nhap sai ten nguoi dung \n \t ------- nhap lai : ");
            }
        }
}

public void longinPass(){
     boolean checks = true;
    while (true){

        System.out.println("pass :");
        String pass = sc.nextLine();

        if (longIn.getPassWord().equals(pass)){
             String inputUsername = longIn.getUserName();
            System.out.println("Chao mung "+inputUsername);
            checks = false;
            break;
        }
        else {
            System.out.println(" sai pass \n \t ----- nhap lai");
        }
    }
}

public void updateMail(String mail){
     longIn.setEmail(mail);

}

public void updatePass(String pass){

   longIn.setPassWord(pass);

}

public void updateUser(String userName){
     longIn.setUserName(userName);
}

    public void menuLongin(){
        System.out.println("1 - Đăng nhập ");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Thay đổi username");
        System.out.println("0 - Đăng xuất");

    }

    public void longins(){
        boolean icheck = true;
        while (icheck){
            menuLongin();
            int a = Integer.parseInt(sc.nextLine());
            switch (a){
                case 1 :
                    longinUser();
                    break;
                case 2 :
                    System.out.println("Thay đổi email");
                    sc.nextLine();
                    String mail = sc.nextLine();
                    updateMail(mail);
                    System.out.println("_______cap nhat thanh cong __________");
                    break;
                case 3 :
                    System.out.println("Thay đổi mật khẩu");
                    sc.nextLine();
                    String pass = sc.nextLine();
                    updatePass(pass);
                    System.out.println("_______cap nhat thanh cong __________");
                    break;
                case 4 :
                    System.out.println("Thay đổi username");
                    sc.nextLine();
                    String userName = sc.nextLine();
                    updatePass(userName);
                    System.out.println("_______cap nhat thanh cong __________");
                    break;
                case 0 :
                    icheck = false;
                    break;
                default:
                    System.out.println("khong co lua chon nay");
                    break;

            }
        }
    }

    public void account(){
        System.out.println("nhap mail :");
        sc.nextLine();
     String email = sc.nextLine();
     if (longIn.getEmail().equals(email)){
         System.out.println("dat lai mat khau ");
         sc.nextLine();
         String pass = sc.nextLine();
         longIn.setPassWord(pass);
         System.out.println("   ------------------> cap nhap thanh cong" );
         longinUser();
     }
     else {
         System.out.println("chưa tồn tại tài khoản");
     }
    }


}
