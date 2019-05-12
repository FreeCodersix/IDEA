package jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertClass {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/smallsix";
        String user = "root";
        String pwd = "061898";

        Connection conn = null;
        Statement statement = null;
        try {
            //1.加载注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            //2.连接数据库
            conn = DriverManager.getConnection(url, user, pwd);

            //3.创建SQL语句
            String sql = "insert into stu values(1,'zs',18)";
            statement = conn.createStatement();

            //4.执行SQL语句
            int row = statement.executeUpdate(sql);
            System.out.println(row);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //5.释放资源
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
