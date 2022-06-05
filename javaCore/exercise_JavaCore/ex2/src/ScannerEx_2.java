
import java.util.Objects;
import java.util.Scanner;


public class ScannerEx_2 {
    public static void chuoiss() {
        Scanner scanner = new Scanner(System.in);
        String chuoi1, chuoi2;
        System.out.println(" Nhập vào chuỗi 1 ");
        chuoi1 = scanner.nextLine();
        System.out.println(" Nhập vào chuỗi 2 ");
        chuoi2 = scanner.nextLine();
        String ss = Objects.equals(chuoi1, chuoi2) ? "chuỗi 1 bằng chuỗi 2 " : "chuỗi 1 không bằng chuỗi 2";
        //        System.out.println((chuoi1.equals(chuoi2))?"Hai chuỗi bằng nhau":"Hai chuỗi không bằng nhau");
        //        String rs = rdNumber % 2==0 ? rdNumber + " là số chẵn" : rdNumber +" là số lẻ";
        System.out.println(" Kết quả so sánh :\n" + ss );

        System.out.println((chuoi1.length()==chuoi2.length())?"Hai chuỗi có chiều dài bằng nhau":"Hai chuỗi có chiều dài khác nhau");



    }

    public static void diemTb() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap diem ly thuyet");
        double lyThuyet = sc.nextDouble();
        System.out.println(" Nhap diem thuc hanh");
        double thucHanh = sc.nextDouble();
        double diemTb = (thucHanh + lyThuyet)/2;
        System.out.println(" Ket Qua :"+diemTb);
        if (diemTb <6){
            System.out.println(" -> Trượt ");}
        else{
            System.out.println(" -> Đỗ "); }
    }

}



