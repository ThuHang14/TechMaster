import java.util.Scanner;

public class Maths {
    Scanner sc = new Scanner(System.in);
    public void soNguyenTo(int number){
        if (number <= 1)
            System.out.println("khong la so nguyen to");

        for (int i = 2; i <number-1 ; i++) {
            if (number % i ==0){
                System.out.println("la so nguyen to");
            }
        }

    }
}
