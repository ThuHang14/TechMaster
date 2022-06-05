package controller;

import Model.Ebook;
import Model.Newspaper;
import Model.Textbook;

public class Menu {
    public void Menu1(){
        System.out.println("1 - Textbook");
        System.out.println("2 - Newspaper");
        System.out.println("3 - Ebook");
        System.out.println("0 - exit");
    }

    public void mainMenu(){
        System.out.println("1 - danh sach");
        System.out.println("2 - searchName");
        System.out.println("3 - Search category");
        System.out.println("4 - search downloads");
        System.out.println("5 - search year 2022");
        System.out.println("0 - exit");
    }
}
