public class Account {
    private String phone;
    private String pass;
    private long balance;

    public Account(String phone, String pass, long balance) {
        this.phone = phone;
        this.pass = pass;
        this.balance = balance;
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

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "phone='" + phone + '\'' +
                ", pass='" + pass + '\'' +
                ", balance=" + balance +
                '}';
    }
}
