package Model;

import java.time.LocalDate;

public class Textbook {
    private int id;
    private String name;
    private String category;
    private String publishing;
    private LocalDate year;
    private int amount;
    private int numberPage;
    private String author;

    public Textbook(String id, String name, String category, String publishing, int year, int amount, int numberPage, String author) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.category = category;
        this.publishing = publishing;
        this.year = LocalDate.ofEpochDay(year);
        this.amount = amount;
        this.numberPage = numberPage;
        this.author = author;
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

    public int getYear() {
        return year.getYear();
    }

    public void setYear(LocalDate year) {
        this.year = LocalDate.ofEpochDay(year.getYear());
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return id + " _ " +name+ " _ " +category+ " _ " +publishing+ " _ " +year.getYear()+ " _ " +amount+ " _ " +numberPage+ " _ " +author;
    }
}
