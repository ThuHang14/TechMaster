import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class Service {

    public ArrayList<Movie> getAllMovie(){
        ArrayList<Movie> movies = new ArrayList<>();
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<Movie>>(){}.getType();

            movies = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Không tìm thấy file");
        }
        return movies;
    }

    public void show(ArrayList<Movie> movies){
        for (Movie movie : movies){
            System.out.println(movie);
        }
    }
    public ArrayList<Movie> sortYear(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getYear() - o2.getYear();
            }
        });

        return movies;
    }

    public ArrayList<Movie> sortTitle(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle() .compareTo(o2.getTitle());
            }
        });

        return movies;
    }

    public void searchTitle(ArrayList<Movie> movies,String title){
        int count = 0;
        for ( Movie m : movies
             ) {
            if (m.getTitle().toLowerCase().contains(title)) {
                System.out.println(m);
                count++;
            }
        }
        System.out.println(count + " ket qua duoc tim thay");
    }
    public ArrayList<Movie> sortView(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getView()- o2.getView();
            }
        });
        return movies;
    }
    public void categorySearch(ArrayList<Movie> movies,String category){
        int count = 0;
        for ( Movie movie : movies
             ) {
            if (Arrays.toString(movie.getCategory()).toLowerCase().contains(category)) {
                System.out.println(movie);
                count++;
            }
        }
        System.out.println(count +" the loai "+ category+" duoc tim thay.");
    }
}