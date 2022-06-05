import java.util.Scanner;

public class array4 {
    public static String[] arr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("- Nhập số phần tử của mảng : ");
        int n = Integer.parseInt(sc.nextLine());
        String [] arr = new String[n];
        for(int i = 0; i <n ; i++){
            System.out.println("nhập vào phần tử thứ "  + i + " trong mảng : ");
            arr[i] = sc.nextLine();
        }
        return arr;
    }

   public static String count(String[] arr){
         int count = 0;
        String search = "java";
       for(int i = 0;i < arr.length;i++){
           if (arr[i].equalsIgnoreCase(search)){
               count++;
           }
//         System.out.println(" so phan tu "+ search+" co trong mang "+i);

       }
       System.out.println("\t- Số lần phần tử \"java\" xuất hiện trong mảng : "+count);
       return search;
   }

   
    public static void inputS(String[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-Nhập chuỗi muốn kiểm tra : ");
        String a = sc.next();
        boolean chuoi = true;
        int count = 0;
        for(int i=0; i<arr.length;i++){
            if(a.trim().equalsIgnoreCase(arr[i].trim())){
                System.out.println("\t Chuỗi vừa nhập xuất hiện ở vị trí : " + i + " trong mảng");
                chuoi = true;
                count ++;
            }
            if(!chuoi) {
                System.out.println(" \t Chuỗi vừa nhập không có trong mảng");
            }
        }
        System.out.println("số lần chuỗi vừa nhập xuất hiện trong mảng : "+ count);

    }
    //
}
