package Model;

import java.time.LocalDate;

public class Newspaper {

    private int id;
    private String name;
    private String category;
    private String publishing;
    private LocalDate date;
    private int amount;
    private int numberPage;

    public Newspaper(String id, String name, String category, String abc, LocalDate now, int amount, int numberPage) {
    }

    @Override
    public String toString() {
        return id + " _ " + numberPage + " _ " + category + " _ " + date + " _ " + amount + " _ " + numberPage;
    }

    public Newspaper(String id, String name, String category, String publishing, int date, int amount, int numberPage) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.category = category;
        this.publishing = publishing;
        this.date = LocalDate.ofEpochDay(date);
        this.amount = amount;
        this.numberPage = numberPage;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
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

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }


}
