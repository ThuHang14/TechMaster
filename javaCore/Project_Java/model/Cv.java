package DoAn_Java.model;
import DoAn_Java.ArrayList.gender;
import DoAn_Java.ArrayList.shift;
import Util.Util;

public class Cv {
    private String id ;
    private String name;
    private gender gender;
    private int Birth;
    private String homeTown;
    private shift shift;
    private int experience;

    @Override
    public String toString() {
        return "UV"+id +
                ", " + Util.uppercaseName(name) +
                ", " + gender +
                ", " + Birth +
                ", " + Util.uppercaseName(homeTown) +
                "\t ✖✖ Ca có thể làm : " + shift
                +" - Kinh nghiệm làm việc : "+experience +" tháng";
    }

    public Cv(String id, String name, gender gender, int birth, String homeTown,shift shift, int experience) {
        this.id = String.valueOf(Util.randomNumber(1,100));
        this.name = name;
        this.gender = gender;
        Birth = birth;
        this.homeTown = homeTown;
        this.shift = shift;
        this.experience = experience;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public gender getGender() {
        return gender;
    }

    public void setGender(gender gender) {
        this.gender = gender;
    }

    public int getBirth() {
        return Birth;
    }

    public void setBirth(int birth) {
        Birth = birth;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public shift getShift() {
        return shift;
    }

    public void setShift(shift shift) {
        this.shift = shift;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
