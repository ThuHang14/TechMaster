package DoAn_Java.model;
import DoAn_Java.ArrayList.type;
import Util.Util;

public class Product {
    private String id;
    private String name;
    private type type;
    private long sellPrice,buyPrice;
    private int sellNumber,inventoryNumber;

    @Override
    public String toString() {
        return "SP"+id+
                " | \t " + Util.uppercaseName(name) +
                " | \t " + type +
                " | \t " + Util.formatMoney( sellPrice) +
                " | \t " + Util.formatMoney( buyPrice) +
                " | \t " + sellNumber +
                " | \t " + inventoryNumber ;
    }



    public Product(int id, String name,type type, long sellPrice, long buyPrice, int sellNumber, int inventoryNumber) {
        this.id = String.valueOf((Util.randomNumber(1,100)));
        this.name = name;
        this.type = type;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.sellNumber = sellNumber;
        this.inventoryNumber = inventoryNumber;
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

    public type getType() {
        return type;
    }

    public void setType(type type) {
        this.type = type;
    }

    public long getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(long sellPrice) {
        this.sellPrice = sellPrice;
    }

    public long getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(long buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellNumber() {
        return sellNumber;
    }

    public void setSellNumber(int sellNumber) {
        this.sellNumber = sellNumber;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }
}
