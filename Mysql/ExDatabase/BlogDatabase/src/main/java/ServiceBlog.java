import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServiceBlog {
    Conect conect = new Conect();
    Connection conn = conect.connec();

    public void statusPublic(){
        String query = "SELECT * FROM `post` WHERE status = 'public'";
        try {
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            while(result.next()){
                System.out.println(result.getInt("id") +
                result.getString("title")+
                result.getString("description")+
              result.getString("thumnail")+
                 result.getString("create_at")+
               result.getString("status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void sql(String query){
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            System.out.println("thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Modalss> blogTag(){
        List<Modalss> list = new ArrayList<>();
        String query = "SELECT p.id ,p.title ,p.content ,a.name AS author,JSON_ARRAYAGG(t.name) AS category ,p.create_at \n" +
                "FROM post p \n" +
                "INNER JOIN author a ON a.id = p.id_author \n" +
                "INNER JOIN post_tag pt ON pt.id_post = p.id \n" +
                "INNER JOIN tag t ON t.id = pt.id_tag \n" +
                "WHERE p.id = 1";
        try {
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);

            while(result.next()){
                int id = result.getInt("id");
                String   title = result.getString("title");
                String   content = result.getString("content");
                String  description = result.getString("author");
                String   thumnail = result.getString("category");
                LocalDate  create_at = (LocalDate.parse(result.getString("create_at")));

                list.add(new Modalss(id,title,content,description,thumnail,create_at));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void show(List<Modalss> modals){
        modals.stream().forEach(s-> System.out.println(s));
    }
}
