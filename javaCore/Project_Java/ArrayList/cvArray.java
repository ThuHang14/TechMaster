package DoAn_Java.ArrayList;
import DoAn_Java.model.Cv;

import java.util.ArrayList;

public class cvArray {
    public ArrayList<Cv> getAllCv(){
        ArrayList<Cv> cv = new ArrayList<>();
        cv.add(new Cv("","Nguyễn Thu Xanh",gender.Nữ,1992,"Hải Dương",shift.Ca_sáng,5));
        cv.add(new Cv("","Trần thị Mỹ", gender.Nữ,1995,"Hải Phòng",shift.Ca_tối,0));
        cv.add(new Cv("","Quang Văn Bi",gender.Nam,1980,"Nam Định",shift.Full,2));
        cv.add(new Cv("","Lê Văn Him",gender.Khác,1985,"Sài Gòn",shift.Ca_sáng,25));
        cv.add(new Cv("","Nguyễn Thị Kay",gender.Nữ,2000,"Bạc Liêu",shift.Ca_sáng,8));
        cv.add(new Cv("","Đinh Quang Dưa",gender.Khác,1975,"Hải Dương",shift.Ca_tối,10));

        return cv;
    }
}
