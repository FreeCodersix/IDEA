package com.smallsix.jdbc.test;

import com.smallsix.jdbc.util.JDBC_Util;
import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class DBCPTest {
    /*public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost/jdbc_dao";
        String user = "root";
        String pwd = "061898";
        String driverName = "com.mysql.jdbc.Driver";

        //创建连接池
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(driverName);
        ds.setUsername(user);
        ds.setPassword(pwd);
        ds.setUrl(url);

        //获取连接
        Connection conn = ds.getConnection();

        String sql = "select * from account";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            String name = rs.getString("name");
            double money = rs.getDouble("money");
            System.out.println(name + "  " + money);
        }
        JDBC_Util.close(conn,ps,rs);

    }*/


    public static List<String> query(List<String> list) throws Exception {
        String url = "jdbc:mysql://localhost/jdbc_dao";
        String user = "root";
        String pwd = "061898";
        String driverName = "com.mysql.jdbc.Driver";

        //创建连接池
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(driverName);
        ds.setUsername(user);
        ds.setPassword(pwd);
        ds.setUrl(url);

        //获取连接
        Connection conn = ds.getConnection();

        String sql = "select * from Score_name ORDER BY score DESC ";

        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String name = rs.getString("name");
            int score = rs.getInt("score");
            if (name == null) {
                name = "一位不愿意透露姓名的玩家";
            }
            if (score != 0) {
                list = Tools.foo(name, score);
            }
        }
        JDBC_Util.close(conn, ps, rs);
        return list;
    }

    public static void main(String[] args) throws Exception {
        List<String> lists = new LinkedList<String>();
        lists = query(lists);
        for (String string: lists){
            System.out.println(string);
        }
    }

    public static void update(int newScore) throws Exception {
        String url = "jdbc:mysql://localhost/jdbc_dao";
        String user = "root";
        String pwd = "061898";
        String driverName = "com.mysql.jdbc.Driver";

        //创建连接池
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(driverName);
        ds.setUsername(user);
        ds.setPassword(pwd);
        ds.setUrl(url);

        //获取连接
        Connection conn = ds.getConnection();

        String sql = "INSERT  INTO Score_name(NAME,score) VALUES (?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "李白");
        ps.setInt(2, 20);
        ps.executeUpdate();
        ResultSet rs = ps.executeQuery();

        JDBC_Util.close(conn, ps, rs);

    }
}


