package controller;

import Service.Arraylists;
import Service.Service;

import java.security.Provider;
import java.util.Scanner;

public class controller<E> {
    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu();
    Arraylists<E> arraylists = new Arraylists<E>();

     Service service = new Service();

    public void Menu1(){
        boolean check = true;
        while (check){
            menu.Menu1();
            int a = Integer.parseInt(sc.nextLine());
            switch (a){
                case 1: //textbook
                    Arraylists.show(arraylists.getTextbook());
                    break;
                case 2://newspaper
                    Arraylists.show(arraylists.getNewspaper());

                    break;
                case 3://ebook
                    Arraylists.show(arraylists.getEbook());

                    break;
                case 0:
                    check = false;
                    break;
                default:
                    System.out.println("khong co lua chon nay");
            }
        }

    }

    public void mainMenu(){
        boolean check = true;
        while (check){
            menu.mainMenu();
            int a = Integer.parseInt(sc.nextLine());
            switch (a){
                case 1: Menu1();
                    break;
                case 2:
                    System.out.println("category:");
                    String category = sc.nextLine();
                    service.search(arraylists,category);
                    break;
                case 3:
                    System.out.println("name :");
                    String name = sc.nextLine();
                    service.search(arraylists,name);

                    break;
                case 4:
                    System.out.println( service.sortDownload());
                    break;
                case 5:
                    System.out.println(service.getYear());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("khong co lua chon nay");
            }
        }

    }
}
