package apitests;

import java.sql.*;

public class RoughWorkTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = null;
        connection = DriverManager.getConnection("jdbc://mysql://localhost:3306","root","root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("");

    }
}
