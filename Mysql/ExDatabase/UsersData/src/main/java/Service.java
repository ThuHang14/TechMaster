import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Service {
    Conect conect = new Conect();
    Connection conn = conect.connect();

    public List<Users> getList( List<Users> list){
        String query = "SELECT * FROM `users` ";
        try {
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);

            while(result.next()){
                int id = result.getInt("id");
                String   username = result.getString("username");
                String   email = result.getString("email");
                String  password = result.getString("password");

                list.add(new Users(id,username,email,password));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void show(List<Users> modals){
        modals.stream().forEach(s-> System.out.println(s));
    }


    public void longIn(List<Users> usersList,String usersName,String mail,String pass){
        int count = 0;
        String query = "select u.username ,u.email ,u.password \n" +
                " from users u \n" +
                " WHERE u.username = " +
                "'"+ usersName +"'"+
                "and u.email = " +
                "'"+  mail +"'"+
                "and u.password = " +
                "'"+ pass+"'";

        try {
            Statement stm = conn.createStatement();
            ResultSet resultSet =stm.executeQuery(query);
            while (resultSet.next()){
                System.out.println(
                    resultSet.getString("username"));
                count = 1;
}
        } catch (SQLException e) {
            System.out.println("nhap sai");
            e.printStackTrace();
        }
        if (count == 1){
            System.out.println("dang nhap thanh cong");
        }
        else {
            System.out.println("thu lai");
        }
    }


}
