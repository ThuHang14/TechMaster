package DoAn_Java.ArrayList;

import DoAn_Java.model.Staff;


import java.util.ArrayList;

public class staffArray {
    public ArrayList<Staff> getAllStaff(){
        ArrayList<Staff> a = new ArrayList<>();
        a.add(new Staff("","Nguyễn Thị Anh",gender.Nữ,1992,"Hải Dương",shift.Ca_sáng));
        a.add(new Staff("","Mạc Thị Bưởi",gender.Nữ,1984,"Hải Phòng",shift.Ca_tối));
        a.add(new Staff("","Trần Văn Sáng",gender.Nam,1999,"Hà Giang",shift.Full));
        a.add(new Staff("","Ngọa Văn Á",gender.Khác,2000,"Dak Lak",shift.Ca_sáng));
        a.add(new Staff("","Nguyễn Thị Linh",gender.Nữ,1992,"Phú Thọ",shift.Ca_sáng));
        a.add(new Staff("","Trần Văn Bình",gender.Nam,1999,"Bắc Giang",shift.Full));

        return a;
    }

}
