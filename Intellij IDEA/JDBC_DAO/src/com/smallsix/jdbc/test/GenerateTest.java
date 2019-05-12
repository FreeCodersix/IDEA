package com.smallsix.jdbc.test;

import com.smallsix.jdbc.util.JDBC_Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class GenerateTest {
    public static void main(String[] args) throws Exception {
        //获取自动生成的主键
        Connection conn = JDBC_Util.getConn();
        String sql = "insert into student (name,age) values (?,?)";
        PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1,"李白");
        ps.setInt(2,20);
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if(rs.next()){
            int id = rs.getInt(1);
            System.out.println(id);
        }
        JDBC_Util.close(conn,ps,rs);
    }
    void get() throws Exception {
        //获取自动生成的主键
        Connection conn = JDBC_Util.getConn();
        String sql = "insert into student (name,age) values ('张三',30)";
        PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if(rs.next()){
            int id = rs.getInt(1);
            System.out.println(id);
        }
        JDBC_Util.close(conn,ps,rs);
    }
}
