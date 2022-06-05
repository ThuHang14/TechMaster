package DoAn_Java.service;

import DoAn_Java.model.Cv;

import DoAn_Java.ArrayList.gender;
import DoAn_Java.ArrayList.shift;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
    Scanner sc = new Scanner(System.in);
   StaffService staffService = new StaffService();

    public Cv customerCV(){
        String id = String.valueOf(0);
        System.out.println("nhập Họ và Tên :");
        String name = sc.nextLine();
        System.out.println("Chọn giới tính");
        gender gender =  staffService.chooseGender();
        System.out.println("Năm sinh");
        int birth =Integer.parseInt(sc.nextLine());
        System.out.println("Quên quán");
        String homTown = sc.nextLine();
        shift shift = staffService.chooseShift();
        System.out.println("số tháng làm công việc cũ");
        int experience = sc.nextInt();
        return new Cv(id,name,gender,birth,homTown,shift,experience);
    }
    public void addCV(ArrayList<Cv> cv){
        if (cv.add(customerCV())){
            System.out.println("Đăng kí ứng tuyển thành công");
        }
        else {
            System.out.println("Thất bại");
        }
    }

}
