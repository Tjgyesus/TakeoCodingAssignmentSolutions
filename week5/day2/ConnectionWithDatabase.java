package day2;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionWithDatabase {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "Pass1";

        Connection connection = null;
       try {
           Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url,user,password);
            if(connection != null){
                System.out.println("Connected");}
            else{
                System.out.println("Failed to connect");
            }

        } catch (SQLException e) {
           System.out.println(e.getMessage());
        }

    }
}




