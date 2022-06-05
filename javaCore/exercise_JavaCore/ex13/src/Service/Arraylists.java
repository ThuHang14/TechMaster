package Service;

import Model.Ebook;
import Model.Newspaper;
import Model.Textbook;
import Validate.Validate;
import controller.MyGeneric;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.IntFunction;

public class Arraylists<E> extends ArrayList {

public ArrayList<Textbook> getTextbook(){
    ArrayList<Textbook> list = new ArrayList<>();
    list.add(new Textbook(Validate.randomId(3),"khoa hoc","giao duc","abc",2021,2,90,"GD VN"));
    list.add(new Textbook(Validate.randomId(3),"de men phieu luu ky ","phieu luu","def",2022,2,90,"To Hoai"));
    list.add(new Textbook(Validate.randomId(3),"doraemon ","truyen tranh","fhg",2018,2,90,"kim dong"));
    return list;
}
    public ArrayList<Newspaper> getNewspaper(){
        ArrayList<Newspaper> list2 = new ArrayList<>();
        list2.add(new Newspaper(Validate.randomId(3)," mau 1","khoa 1","abc", LocalDate.parse(Validate.formatDate(LocalDate.ofEpochDay(20/2/2021))),2,190));
        list2.add(new Newspaper(Validate.randomId(3)," mau 2","khoa 2","abc", LocalDate.parse(Validate.formatDate(LocalDate.ofEpochDay(20/05/1982))),20,60));
        list2.add(new Newspaper(Validate.randomId(3)," mau 3","khoa 3","abc", LocalDate.parse(Validate.formatDate(LocalDate.ofEpochDay(20/1/2021))),12,1000));
        list2.add(new Newspaper(Validate.randomId(3)," mau 4","khoa 4","abc", LocalDate.parse(Validate.formatDate(LocalDate.ofEpochDay(20/2/2022))),22,1409));

        return list2;
    }
    public ArrayList<Ebook> getEbook(){
        ArrayList<Ebook> list3 = new ArrayList<>();
        list3.add(new Ebook(Validate.randomId(3),"E1","I1","abc1",2021,2,"img1",200));
        list3.add(new Ebook(Validate.randomId(3),"E2","I2","abc2",1982,2,"img2",20000));
        list3.add(new Ebook(Validate.randomId(3),"E3","I3","abc3",2002,2,"img3",1000));
        list3.add(new Ebook(Validate.randomId(3),"E4","I4","abc4",2022,2,"img4",90000));

        return list3;
    }

    public static <E> void show(ArrayList<E> arr){
        for (E A: arr
             ) {
            System.out.println(arr);
        }
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        return super.toArray(generator);
    }

//public MyGeneric<E> getAll(){
//
//    MyGeneric<Textbook> textbookMyGeneric = new MyGeneric<Textbook>();
//    textbookMyGeneric.setVariable(new Textbook(Validate.randomNumber(3,3),"van mau","khoa hoc","abc",2021,2,90,"kim dong"));
//    textbookMyGeneric.setVariable(new Textbook(Validate.randomNumber(3,3),"van mau","khoa hoc","abc",2021,2,90,"kim dong"));
//
//    MyGeneric<Newspaper> newspaperMyGeneric = new MyGeneric<Newspaper>();
//    newspaperMyGeneric.setVariable(new Newspaper(Validate.randomNumber(3,3),"van mau","khoa hoc","abc",20,2,90));
//
//    MyGeneric<Ebook> ebookMyGeneric = new MyGeneric<Ebook>();
//    ebookMyGeneric.setVariable(new Ebook(Validate.randomNumber(3,3),"van mau","khoa hoc","abc",2021,2,"img1",20));
//
//    return null;
//}


}
