import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();
        List<Users> usersList = new ArrayList<>();
        List<Users> list = service.getList(usersList);
       // service.show(list);

                System.out.println("name = ?");
                String users = sc.nextLine();
                System.out.println("mail = ?");
                String mail = sc.nextLine();
                System.out.println("pass = ?");
                String pass = sc.nextLine();

               service.longIn(list,users,mail,pass) ;

            }
        }
