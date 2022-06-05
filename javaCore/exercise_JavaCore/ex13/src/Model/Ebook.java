package Model;

import java.time.LocalDate;

public class Ebook {
    private int id;
    private String name;
    private String category;
    private String publishing;
    private LocalDate year;
    private int amount;
    private String  img;
    private int downloads;

    @Override
    public String toString() {
        return id+ " _ " +name+ " _ " +category+ " _ " +publishing+ " _ " +year+ " _ " +amount+ " _ " +img+ " _ " +downloads;
    }

    public Ebook(String id, String name, String category, String publishing, int year, int amount, String img, int downloads) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.category = category;
        this.publishing = publishing;
        this.year = LocalDate.ofEpochDay(year);
        this.amount = amount;
        this.img = img;
        this.downloads = downloads;
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

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }
}
