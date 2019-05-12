package jdbc.dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryClass {
    //1.查询多条记录
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/smallsix";
        String user = "root";
        String pwd = "061898";

        Connection conn = null;
        Statement st = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pwd);
            String sql = "SELECT * from stu";
            st = conn.createStatement();
            ResultSet row = st.executeQuery(sql);
            while (row.next()) {
                int id = row.getInt("id");
                String name = row.getString("name");
                int age = row.getInt("age");
                System.out.println("id = " + id + "  name = " + name + "  age = " + age+" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (st != null) {
                try {
                    st.close();
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

    //2.查询一条记录
    void test() {

        String url = "jdbc:mysql://localhost:3306/smallsix";
        String user = "root";
        String pwd = "061898";

        Connection conn = null;
        Statement st = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pwd);
            String sql = "SELECT * from stu WHERE id ='1'";
            st = conn.createStatement();
            ResultSet row = st.executeQuery(sql);
            if (row.next()) {
                int id = row.getInt("id");
                String name = row.getString("name");
                int age = row.getInt("age");
                System.out.println("id = " + id + "  name = " + name + "  age = " + age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (st != null) {
                try {
                    st.close();
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

    //3.查询数据库中内容的个数
    void test1() {
        String url = "jdbc:mysql://localhost:3306/smallsix";
        String user = "root";
        String pwd = "061898";

        Connection conn = null;
        Statement st = null;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pwd);
            String sql = "SELECT count(*) AS total from stu";
            st = conn.createStatement();
            ResultSet row = st.executeQuery(sql);
            if (row.next()) {
                System.out.println(row.getInt("total"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (st != null) {
                try {
                    st.close();
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
