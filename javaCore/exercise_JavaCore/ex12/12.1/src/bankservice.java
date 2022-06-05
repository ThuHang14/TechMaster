public class bankservice {
    private String bank;
    private String type;
    private int number;
    private long money;

    public bankservice(String bank, String type, int number, long money) {
        this.bank = bank;
        this.type = type;
        this.number = number;
        this.money = money;
    }

    public bankservice(Bank chooseBank, String m, String stk, long number) {
    }


    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "bankservice{" +
                "bank='" + bank + '\'' +
                ", type='" + type + '\'' +
                ", number=" + number +
                ", money=" + money +
                '}';
    }
}
