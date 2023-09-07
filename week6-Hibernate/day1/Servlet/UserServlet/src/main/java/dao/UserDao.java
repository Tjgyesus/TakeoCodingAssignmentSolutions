package dao;

import com.takeo.userservlet.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
    public int registerUser(User user) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO User" +
                "  (id, name, address) VALUES " +
                " (?, ?, ?);";

        int result = 0;
        Class.forName("org.postgresql.Driver");
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Pass1");

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(6, user.getAddress());


            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            e.printStackTrace();
        }
        return result;
    }

}
