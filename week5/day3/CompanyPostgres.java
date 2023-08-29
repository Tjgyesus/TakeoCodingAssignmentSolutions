package day3;

import java.sql.*;

public class CompanyPostgres {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/db";
        String user = "postgres";
        String password = "postgres";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Postgres database!");


            createTable(connection);


            insertData(connection,1, "John", "JHN", "USA");
            insertData(connection,2, "Jane", "JAN", "USA");
            insertData(connection,1, "Doe", "DOE", "USA");
            insertData(connection,1, "Smith", "SMT", "USA");

            // Retrieve data
            retrieveData(connection);

            connection.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.err.println("Connection error: " + e.getMessage());
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS public.Company (" +
                "id INT PRIMARY KEY," +
                "name VARCHAR(255)," +
                "code VARCHAR(255),"+
                "address VARCHAR(255))";

        try (PreparedStatement statement = connection.prepareStatement(createTableSQL)) {
            statement.executeUpdate();
            System.out.println("Table created (if not exists).");
        }
    }

    private static void insertData(Connection connection, int id, String name, String code, String address) throws SQLException {
        String insertSQL = "INSERT INTO Company (id, name, code, address) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(insertSQL)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, code);
            statement.setString(4, address);
            statement.executeUpdate();
            System.out.println("Data inserted: " +name + " " + code+" "+address);
        }
    }

    private static void retrieveData(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM Comapny";

        try (PreparedStatement statement = connection.prepareStatement(selectSQL)) {
            ResultSet resultSet = statement.executeQuery();
            System.out.println("Retrieved data:");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String code = resultSet.getString("code");
                String address = resultSet.getString("address");

                System.out.println("ID: " + id + ", Name: " + name + "Code " + code+" Address "+ address);
            }
        }
    }

    private static void deleteData(Connection connection, int id, String name, String code, String address) throws SQLException {
        String deleteSQL = "DELETE from Company where id = 1";

        try (PreparedStatement statement = connection.prepareStatement(deleteSQL)) {
            statement.setInt(1, id);

            statement.executeUpdate();
            System.out.println("Data Deleted: "+ id+ " " +name + " " + code+" "+address);
        }
    }

}
