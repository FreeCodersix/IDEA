package com.smallsix.jdbc.test;

import com.smallsix.jdbc.util.JDBC_Util;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginTest {
    @Test
    public void test() throws Exception {
        System.out.println(this.login("123","123"));
    }
    String login(String userName,String pwd) throws Exception {

            Connection conn = JDBC_Util.getConn();
            String sql = "select * from user where userName = ? and pwd = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,userName);
            ps.setString(2,pwd);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                JDBC_Util.close(conn,ps,rs);
                return "登录成功";
            }else{
                JDBC_Util.close(conn,ps,rs);
                return "登录失败";
            }
    }
}
