package DoAn_Java.service;

import DoAn_Java.ArrayList.gender;
import DoAn_Java.ArrayList.shift;
import DoAn_Java.ArrayList.checkin;
import DoAn_Java.Controller.Menu;
import DoAn_Java.model.Account;
import DoAn_Java.model.In_Out;
import DoAn_Java.model.Staff;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class StaffService {
    Scanner sc = new Scanner(System.in);


    public void showAllStaff(ArrayList<Staff> a){
        a.stream().forEach(s-> System.out.println(s));
    }

    public Staff createNewStaff(){
            String id = (String.valueOf(0));
            System.out.println("Nhập tên : ");
            String name = sc.nextLine();
            System.out.println("Nhập giới tính : ");
            gender gender = chooseGender();
            System.out.println("Nhập năm sinh : ");
            int birth = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập quê quán: ");
            String homeTown = sc.nextLine();
            System.out.println("Nhập ca làm : ");
            shift shift = chooseShift();

            return new Staff(id, name, gender, birth, homeTown, shift);
    }

    public gender chooseGender(){
        gender gender = null;
        Menu.menu3();
        int choose = Integer.parseInt(sc.nextLine());
        boolean isCheck = false;
        while (!isCheck){
            switch (choose){
                case 1:
                    gender = gender.Nữ;
                    isCheck = true;
                    break;
                case 2:
                    gender = gender.Nam;
                    isCheck = true;
                    break;
                case 3:
                    gender = gender.Khác;
                    isCheck = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    isCheck = true;
                    break;

            }
        }
        return gender;
    }


    public shift chooseShift(){
        shift shift = null;
        Menu.menu4();
        int choose = Integer.parseInt(sc.nextLine());
        boolean isCheck = false;
        while (!isCheck){
            switch (choose){
                case 1:
                    shift = shift.Ca_sáng;
                    isCheck = true;
                    break;
                case 2:
                    shift = shift.Ca_tối;
                    isCheck = true;
                    break;
                case 3:
                    shift = shift.Full;
                    isCheck = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    isCheck = true;
                    break;

            }
        }
        return shift;
    }

    public void addNewProduct(ArrayList<Staff> a){
        if (a.add(createNewStaff())){
            System.out.println("Thêm thành công");
        }else {
            System.out.println("Thêm thất bại");
        }
    }

    public static Staff getIDStaff(ArrayList<Staff> a, String id){
        for (Staff s : a
             ) {
            if (id.equals(s.getId())){
                return s;
            }
        }
        return null;
    }

    public void deleteStaff(ArrayList<Staff> a){
        System.out.println("Nhập id nhân vien cần xóa: ");
        String id = (sc.nextLine());
        getIDStaff(a,id);
        if (a.remove(getIDStaff(a,id))){
            System.out.println("Xóa thành công");
        }else {
            System.out.println("Thất bại");
        }
    }

    public void updateStaff(ArrayList<Staff> a){
        System.out.println("Nhập id nhân viên cần sửa : ");
        String id = (sc.nextLine());
        getIDStaff(a,id);
        System.out.println("Kết quả tìm kiếm :");
        System.out.println(getIDStaff(a,id));

        if (getIDStaff(a,id) == null){
            System.out.println("Không hợp lệ ");
        }
        else {
        System.out.println("Nhập ca làm mới: ");
        shift shifts = chooseShift();

        getIDStaff(a,id).setShift(shifts);
        System.out.println(" sau cập nhật: ");
        System.out.println(getIDStaff(a,id));}

    }

    public void getShift(ArrayList<Staff> a ,shift shift){
        for (Staff s : a
             ) {
            if (s.getShift().equals(shift)){
                System.out.println(s);
            }
        }
    }
    public void printShift(ArrayList<Staff> a){
        boolean isContinue = true;
        while (isContinue){
            Menu.menu4();
            System.out.println("0 - Quay về trang chủ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    getShift(a,shift.Ca_sáng);
                    break;
                case 2:
                   getShift(a,shift.Ca_tối);
                    break;
                case 3:
                    getShift(a,shift.Full);
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    isContinue = false;
                    break;
            }
        }
    }
    //update (check-in) ( check-out)


    public In_Out chooseCome(ArrayList<Staff> a, String id,ArrayList<In_Out> in_outs){
        checkin checkin = null;
        Menu.menu13();
        int choose = Integer.parseInt(sc.nextLine());
        boolean isCheck = false;
        while (!isCheck){
            switch (choose){
                case 1:
//                    checkin = checkin.CHECK_IN;
                    checkIn(a,id,in_outs);
                    isCheck = true;
                    break;
                case 2:
//                    checkin = checkin.CHECK_OUT;
                  checkOut(a,id,in_outs);
                    isCheck = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    isCheck = true;
                    break;

            }
        }

        return null;
                //new checkTime(getIDStaff(a,id).getId(),getIDStaff(a,id).getName(),case 1,case 2);
    }

    public void staffLogin(ArrayList<Staff> a, String id, Account account) {
  AccountService.longin(account);
    }
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public void checkIn(ArrayList<Staff> a, String id,ArrayList<In_Out> in_outs){
        String timein =LocalDateTime.now().format(formatter);
        String checkins = StaffService.getIDStaff(a,id).getId()+"  -  "+StaffService.getIDStaff(a,id).getName()+"  -  "+"check_in : "+"  -  "+timein;
        System.out.println(checkins);

        in_outs.add(new In_Out(StaffService.getIDStaff(a,id),timein,"--"));
    }
    public void checkOut(ArrayList<Staff> a, String id,ArrayList<In_Out> in_outs){
        for ( In_Out n : in_outs
             ) {
        String timeout = LocalDateTime.now().format(formatter);
        String checkins = StaffService.getIDStaff(a,id).getId()+"  -  "+StaffService.getIDStaff(a,id).getName()+"  -  "+"check_out : "+"  -  "+timeout;
        if(n.getStaff().equals(id))
         n.setCheckOut(timeout);
            System.out.println(checkins);
        }
    }
}
