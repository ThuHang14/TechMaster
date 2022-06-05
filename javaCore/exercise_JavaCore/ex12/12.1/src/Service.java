import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Service {
   Scanner sc = new Scanner (System.in);
    Account account = new Account("0123456789","12345Abc",5000000);

    public static void longin(Account account){
        Scanner sc = new Scanner (System.in);
        boolean check = true;
        while (check){
            System.out.println("phone :");
            String phone = sc.nextLine();
            if (phone.equals(account.getPhone())){

                checkPass(account);
                check = false;
            }

            else {
                System.out.println("nhap sai \n \t thu lai ");
            }
        }
    }

    public static void checkPass(Account account){
        Controller controller =new Controller();
        Scanner sc = new Scanner (System.in);


        boolean ischeck = true;
        while (ischeck){
            System.out.println("pass :");
            String pass = sc.nextLine();

            if (pass.equals(account.getPass())){
                ischeck = false;
                controller.mainMenu();
            }

            else {
                System.out.println("nhap sai \n \t thu lai ");
            }
        }
    }

    public void balance(Account account){
        System.out.println("so du tai khoan :"+account.getBalance());
    }

    public ArrayList<bankservice> bank(){
        System.out.println("lựa chọn ngân hàng bạn muốn chuyển tiền đến");
        chooseBank();
        System.out.println("nhập số tài khoản");
            String stk = sc.nextLine();
            numberAccount(stk);
        System.out.println("Nhập số tiền bạn muốn chuyển");
            long number = sc.nextLong();
            transferMoney(number);
        System.out.println("Nhập mô tả");
        String m = sc.nextLine();
        System.out.println("chuyển tiền thành công ");

        ArrayList<bankservice> bank = new ArrayList<>();
        bank.add(new bankservice(chooseBank(),m,stk,number));

        return bank;
    }


    public Bank chooseBank(){
        boolean icheck = true;
        while (icheck){
            Controller c = new Controller();
            c.mainBank();
            int a = Integer.parseInt(sc.nextLine());
            switch (a){
                case 1 :
                    Bank bidv = Bank.BIDV;
                    icheck = false;
                    break;
                case 2 :
                    Bank mb  = Bank.MB;
                    icheck = false;
                    break;
                case 3 :
                    Bank cake  = Bank.CAKE;
                    icheck = false;
                    break;
                case 4 :
                    Bank vp  = Bank.VP;
                    icheck = false;
                    break;
                case 5 :
                    Bank tp  = Bank.TP;
                    icheck = false;
                    break;
            }
        }
        return null;
    }



    public void numberAccount(String number){
        boolean a = true;
        while (a){
            try {
                Pattern pattern = Pattern.compile("\"^[0-9]{8,16}$\"");
                if (!pattern.matcher(number).find()){
                    System.out.println("khong hop le");
                }
            } catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số");
            }
        }
    }

    public void transferMoney(long money){
        boolean check = true;
    while (check){
    try{
        if (money<50000){
            System.out.println("Số tiền chuyển tối thiểu 50,000 VNĐ");
        }else if (money>(account.getBalance()-50000)){
            System.out.println("Số dư tài khoản không đủ");
        }else {
            check=false;
        }
    }catch (NumberFormatException e){
        System.out.println("Vui lòng nhập số");
    }
}

    }

public void history(ArrayList<bankservice> bank){
    for (bankservice  b: bank
         ) {
        System.out.println("b");
    }
}
}
