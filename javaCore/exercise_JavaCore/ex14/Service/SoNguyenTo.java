package Service;


public class SoNguyenTo {
    public static void soNguyTo(int n, boolean check) {

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println(n + " la so nguyen to");
        }
        else if(check ==false) {
            System.out.println(n + " khong la so nguyen to");
        }

    }



}

