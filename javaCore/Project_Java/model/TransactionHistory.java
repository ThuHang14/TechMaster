package DoAn_Java.model;

import Util.Util;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TransactionHistory {
    private String type;
    private String id;
    private String name;
    private LocalDate date;
    private int amount;
    private String content;
    private long money;

    public TransactionHistory(String type, String id, String name, LocalDateTime date, int amount, String content, long money) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.date = LocalDate.from(date);
        this.amount = amount;
        this.content = content;
        this.money = money;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return type+ id +
                " __ " + name +
                " __ " + Util.formatDate(date) +
                " __ " + amount +  " __ " + content +
                " _💸 _ "+  Util.formatMoney(money) ;
    }
}
