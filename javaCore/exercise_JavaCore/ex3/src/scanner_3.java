import java.text.DecimalFormat;
import java.util.Scanner;

public class scanner_3 {
    public static void ex1() {
        System.out.println("You only live once, but if you do it right, once is enough.");
        String chuoi = "You only live once, but if you do it right, once is enough.";
        char kyTu = 'o';
        int count = 0;
        System.out.println("Những vị trí ký tự \"o\" xuất hiện : ");

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                System.out.print("\t"+i);
                count++;
                 }
            }
        System.out.println(" \n Số lần ký tự \"o\" xuất hiện : " +count);
    }
    public static void ex2(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ax + b = 0");
        double a, b,nghiem;
        System.out.println(" Nhập vào a : " );
        a = sc.nextDouble();
        System.out.println(" Nhập vào b : ");
        b = sc.nextDouble();
        nghiem = -b / a;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        if(a == 0){
             if(b == 0){
                 System.out.println("\t Phương trình có vô số nghiệm  ");
             }
             else{
                 System.out.println("\t Phương trình vô nghiệm");
             }
         }
         else {
                 System.out.println("\t Phương trình có một nghiệm x = " + decimalFormat.format(nghiem) );
         }





    }
}
