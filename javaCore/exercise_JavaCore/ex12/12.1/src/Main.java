

public class Main {
    public static void main(String[] args) {
        Service service =new Service();
        Account account = service.account;
        Service.longin(account);

        Controller controller =new Controller();
        controller.Menu();

    }
    }
