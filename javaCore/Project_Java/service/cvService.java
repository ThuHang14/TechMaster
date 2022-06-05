package DoAn_Java.service;

import DoAn_Java.Controller.Menu;
import DoAn_Java.ArrayList.gender;
import DoAn_Java.ArrayList.shift;
import DoAn_Java.model.Cv;
import DoAn_Java.model.Staff;

import java.util.ArrayList;
import java.util.Scanner;


public class cvService {
   Scanner sc = new Scanner(System.in);

    public void getYearBirth(int year1,int year2,ArrayList<Cv> cv){
        cv.stream().filter(year->year.getBirth()>= year1 && year.getBirth()<=year2)
                .forEach(s -> System.out.println(s));
    }

    public gender chooseGenderCV(){
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
    public void getGenderCV(ArrayList<Cv> cv, gender gender){
        cv.stream().filter(gen->gen.getGender().equals(gender))
                .forEach(s-> System.out.println(s));
    }
    public void printGenderCV(ArrayList<Cv> cv){
        boolean isContinue = true;
        while (isContinue){
            Menu.menu3();
            System.out.println("0 - Quay về trang chủ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    getGenderCV(cv, gender.Nữ);
                    break;
                case 2:
                    getGenderCV(cv, gender.Nam);
                    break;
                case 3:
                    getGenderCV(cv, gender.Khác);
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

    public Cv getIDCV(ArrayList<Cv> cv,String id){
        for (Cv s : cv
        ) {
            if (s.getId().equals(id)){
                return s;}
        }
        return null;
    }
    public Staff staffAddNewCV(ArrayList<Cv> c, String id){

        return new Staff(getIDCV(c,id).getId(),getIDCV(c,id).getName(),getIDCV(c,id).getGender(),getIDCV(c,id).getBirth(),getIDCV(c,id).getHomeTown(),getIDCV(c,id).getShift());
    }

    public void addNewCV(ArrayList<Cv> cv,String id,ArrayList<Staff> a){
        if (getIDCV(cv,id) != null){
        Staff add = staffAddNewCV(cv,id);
        if (a.add(add)){
            cv.remove(getIDCV(cv,id));
            System.out.println("Tuyển thành công");
        }
        else{
            System.out.println("Thử lại");
        }}
        else {
            System.out.println("Nhập sai ID");
        }
    }

    public void showCV(ArrayList<Cv> cv){
        cv.stream().forEach(s-> System.out.println(s));
    }


    public void getShiftCV(ArrayList<Cv> a ,shift shift){
        for (Cv s : a
        ) {
            if (s.getShift().equals(shift)){
                System.out.println(s);
            }
        }
    }
    public void printShiftCV(ArrayList<Cv> a){
        boolean isContinue = true;
        while (isContinue){
            Menu.menu4();
            System.out.println("0 - Quay về trang chủ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    getShiftCV(a,shift.Ca_sáng);
                    break;
                case 2:
                    getShiftCV(a,shift.Ca_tối);
                    break;
                case 3:
                    getShiftCV(a,shift.Full);
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
}
