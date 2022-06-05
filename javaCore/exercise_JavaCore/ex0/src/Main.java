import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maths maths = new Maths();


        System.out.println("mhap so nguyen to :");
        int number = sc.nextInt();
        maths.soNguyenTo(number);

    }
}
