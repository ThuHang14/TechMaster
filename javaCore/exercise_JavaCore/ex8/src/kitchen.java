import java.util.Scanner;

public class kitchen extends Employee{
    private int serviceCharge;

    public kitchen() {

    }

    @Override
    public String toString() {
        return super.toString() + " - "+serviceCharge;
    }

    @Override
    public long calculatorSalary() {
         return serviceCharge + getBasicSalary();
    }

    public void inputKitchen(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("    + serviceCharge : ");
        serviceCharge = sc.nextInt();
        System.out.println("-------> Salary : " + calculatorSalary());

    }

    public void showKitchen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("2- nhap so nhan vien bep : ");
        int soNhanVienBep = sc.nextInt();
        int[] nhanVienBep = new int[soNhanVienBep];

        System.out.println("    *   nhap thong tin cho nhan vien bep");
        for (int i = 0; i < soNhanVienBep; i++) {
            System.out.println(" -  nhap thong tin nhan vien bep thu "+ (i+1) + " : ");
            kitchen k = new kitchen();
            k.inputKitchen();
        }
    }

    public kitchen(int id, String name, int age, int basicSalary, int serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public int getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
}
