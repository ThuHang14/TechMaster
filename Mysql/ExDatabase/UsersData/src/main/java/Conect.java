import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conect {
    String localHost = "localhost:800";
    String data = "users";
    String name = "root";
    String pass = "123";

    String url = "jdbc:mysql://"+localHost+"/"+data;

    public Connection connect(){
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url,name,pass);
            System.out.println("ok");
        } catch (SQLException e) {
            System.out.println("noooooo");
            e.printStackTrace();
        }
        return conn;
    }
}
