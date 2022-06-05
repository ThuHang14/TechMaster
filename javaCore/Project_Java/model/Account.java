package DoAn_Java.model;

public class Account {
    private String phone;
    private String pass;

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "phone='" + phone + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    public Account(String phone, String pass) {
        this.phone = phone;
        this.pass = pass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
