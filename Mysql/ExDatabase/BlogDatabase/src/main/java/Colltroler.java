import java.util.List;
import java.util.Scanner;

public  class Colltroler {
    public static void subMenu(){
        System.out.println("\n 1. Lấy thông tin của tất cả các bài viết gồm: id, title, description, thumbnail, create_at của các bài viết có status = public");
        System.out.println(" 2. Lấy ra id, title, content, author_name, tag, create_at của bài viết có id = 1");
        System.out.println(" 3. Cập nhật title và content của bài viết có id = 1");
        System.out.println(" 4. Xóa bài viết có id = 1;");
        System.out.println(" 5. Thêm bài viết mới \n");
    }

    public static void mainMenu(){

        boolean check = true;
        while (check){
            subMenu();

            ServiceBlog serviceBlog = new ServiceBlog();
            Scanner sc = new Scanner(System.in);

        String queryDelete = "DELETE FROM `post` WHERE id = 1";
        String queryAdd = "INSERT INTO `post` (`id`, `title`, `content`, `description`, `thumnail`, `id_category`, `id_author`, `create_at`, `status`) VALUES (NULL, '1', '2', '3', '4', '5', '39', '2022-03-10', 'hidden');";
        String queryUpdate = "UPDATE `post` SET `title` = '[new2]' , `content` = '[newww]'  WHERE id = 1 ";

            int a= Integer.parseInt(sc.next());
            switch (a){
                case 0 :
                    System.exit(0);
                    break;
                    case 1 :
                        serviceBlog.statusPublic();
                    break;
                    case 2 :
                        List<Modalss> list = serviceBlog.blogTag();
                        serviceBlog.show(list);
                    break;
                    case 3 :
                        serviceBlog.sql(queryUpdate);
                    break;
                    case 4 :
                        serviceBlog.sql(queryDelete);
                    break;
                case 5 :
                    serviceBlog.sql(queryAdd);
                    break;
                default:
                    System.out.println("k co lua chon nay");
                    break;
            }
        }
    }
}
