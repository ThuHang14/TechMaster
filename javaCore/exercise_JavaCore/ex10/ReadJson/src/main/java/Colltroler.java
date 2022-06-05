import java.util.ArrayList;
import java.util.Scanner;

public class Colltroler  {
    Service service = new Service();
    ArrayList<Movie> movies = service.getAllMovie();
    Scanner sc = new Scanner(System.in);
      public void show() {
          service.show(movies);
      }

      public void Menu(){
          System.out.println("0 - Liệt kê tất cả phim : ");
          System.out.println("1 - Sắp xếp phim theo năm xuất bản");
          System.out.println("2 - Sắp xếp phim theo tên");
          System.out.println("3 - Tìm phim theo tên");
          System.out.println("4 - Lấy ra 3 phim có lượt xem cao nhất");
          System.out.println("5 - Tìm phim theo thể loại");
          System.out.println("6 - Thoát chương trình");
          System.out.print("Lựa chọn của bạn là :");

      }

      public void Mainmenu(){

          boolean check = true;
          while (true){
              Menu();
              int a = sc.nextInt();
              switch (a){
                  case 6:
                      System.exit(0);
                      break;
                  case 0 :
                      service.show(movies);
                      break;
                  case 1 :
                      System.out.println("      *   danh sach sau xap xep nam  *       ");
                      service.sortYear(movies);
                      show();

                      break;
                  case 2 :
                      System.out.println("      *   danh sach sau xap xep ten  *       ");
                      service.sortTitle(movies);
                      show();
                      break;
                  case 3 :
                      System.out.println("      *   nhap phim can tim       *   ");
                      sc.nextLine();
                      String name = sc.nextLine();
                      service.searchTitle(movies,name);
                      show();
                      break;
                  case 4 :
                      System.out.println("      *   3 phim co luot xem cao nhat         *    ");
                      for ( Movie m : service.sortView(movies)
                           ) {
                          for (int i = 0; i <3 ; i++) {
                              System.out.println(movies.get(i));
                          }
                          break;
                      }
                      break;
                  case 5 :
                      System.out.println("      *   nhap the loai muon tim      *       ");
                      sc.nextLine();
                      String category = sc.nextLine();
                      service.categorySearch(movies,category);
                      show();
                      break;
                  default:
                      System.out.println("___________Không có lựa chọn này___________");
                      break;
              }
          }
      }
}
