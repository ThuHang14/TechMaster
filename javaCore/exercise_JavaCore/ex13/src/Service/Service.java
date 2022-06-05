package Service;

import Model.Ebook;
import Model.Newspaper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Service<E> {
    Arraylists<E> arraylists = new Arraylists<E>();
    //Scanner sc = new Scanner(System.in);

    public <E> void search(ArrayList<E> arr,String search){
        int count = 0;
        for (E A: arr
        ) {
            if (search.equals(arr)){
                System.out.println(A);
                count++;
            }

        }
        System.out.println(count+" ket qua duoc tim thay");
    }

    public ArrayList<Ebook> sortDownload(){
        ArrayList<Ebook> arr = arraylists.getEbook();
        for (int i = 0; i <1 ; i++) {
            Collections.sort(arr, new Comparator<Ebook>() {
                @Override
                public int compare(Ebook o1, Ebook o2) {
                    return o1.getDownloads()- o2.getDownloads();
                }
            });
            return null;
        }
       return arr;
    }

public ArrayList<Newspaper> getYear(){
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();

        ArrayList<Newspaper> newspapers = arraylists.getNewspaper();
    for (Newspaper n: newspapers
         ) {
        if (n.getDate().equals(year)){
            System.out.println(n);
        }
    }
    return newspapers;
}
}




