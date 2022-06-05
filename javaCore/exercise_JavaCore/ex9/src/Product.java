
public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private double price;
    private int amount;
    private type type;
    private int sellNumber;

    public Product() {
    }

    public Product(int id, String name, double price, int amount, type type, int sellNumber) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.type = type;
        this.sellNumber = sellNumber;
    }

    public Product(int id, String name, double price, int amount, String type, int sellNumber) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public type getType() {
        return type;
    }

    public void setType(type type) {
        this.type = type;
    }

    public int getSellNumber() {
        return sellNumber;
    }

    public void setSellNumber(int sellNumber) {
        this.sellNumber = sellNumber;
    }

    //        Locale localeVN = new Locale("vi", "VN");
//        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
//        String str = numberFormat.format(price);


    @Override
    public String toString() {
        return "       - "+ id + " _ " + name + " _ " +price + " _ " +amount + " _ " +type + " _ " +sellNumber;
    }

    @Override
    public int compareTo(Product o) {
        return (int) (this.price - o.price);
    }
}
