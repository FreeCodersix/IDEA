package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "connection.connection.connection:mysql://localhost:3306/smallsix";
        String user = "root";
        String password = "061898";
        Connection connection = DriverManager.getConnection(url,user,password);
        System.out.println(connection);
        Thread.sleep(50000);
    }
}
