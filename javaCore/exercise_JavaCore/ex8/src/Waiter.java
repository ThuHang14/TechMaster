import java.util.Iterator;
import java.util.Scanner;

public class Waiter extends Employee{
    private int compensate;

    public Waiter() {
    }


    @Override
    public String toString() {
        return super.toString() + " - "+compensate;
    }

    @Override
    public long calculatorSalary() {
       return compensate + getBasicSalary();
    }

  

    public void inputWaiter(){
        super.nhap();
        System.out.print("  + compensate : ");
        Scanner sc = new Scanner(System.in);
        compensate = sc.nextInt();
        System.out.println("-------> Salary : " + calculatorSalary());
    }

    public void showWaiter(){
        Waiter w = new Waiter();
        Scanner sc = new Scanner(System.in);
        System.out.println("1- nhap so nhan vien ban :");
        int soNhanVienBan = sc.nextInt();
        int[] nhanVienBan = new int[soNhanVienBan];

        System.out.println("    *   nhap thong tin cho nhan vien ban");
        for (int i = 0; i < soNhanVienBan; i++) {
            System.out.println(" -  nhap thong tin nhan vien ban thu "+ (i+1) + " : ");
            w.inputWaiter();
          }
    }
    public void ql(){
        System.out.println("nhan vien kuong cao nhat :");

    }


    public Waiter(int id, String name, int age, int basicSalary, int compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public int getCompensate() {
        return compensate;
    }

    public void setCompensate(int compensate) {
        this.compensate = compensate;
    }
}
