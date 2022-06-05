package DoAn_Java.model;

public class In_Out {
    private Staff staff;
    private String checkIn ;
    private String checkOut;

    public In_Out() {

    }

    @Override
    public String toString() {
        return staff.getId() + " - " +
                staff.getName() + " - " +
                " check in : "+
                checkIn + " - " +
                " check out :" +
                checkOut + "sum "+(checkIn + checkOut);
    }

    public In_Out(Staff staff, String checkIn, String checkOut) {
        this.staff = staff;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }
}
