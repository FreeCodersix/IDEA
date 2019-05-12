package com.smallsix.jdbc.test;

import com.smallsix.jdbc.util.JDBC_Util;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionTest {
    public static void main(String[] args) throws Exception {
        /**
         1.检查用户账户余额
         2.减少用户账户1000
         3.增加用户账户1000
         */
        Connection conn = JDBC_Util.getConn();
        String sql = "select * from account where name = ? and money > ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,"zs");
        ps.setInt(2, 1000);
        ResultSet rs = ps.executeQuery();
        if(!rs.next()){
            throw  new RuntimeException("没钱了");
        }


        try {
            conn.setAutoCommit(false);
            sql = "UPDATE account SET money = money - ? WHERE NAME = ?";
            ps = conn.prepareStatement(sql);
            ps.setDouble(1,1000);
            ps.setString(2,"zs");
            ps.executeUpdate();

            sql = "UPDATE account SET money = money + ? WHERE NAME = ?";
            ps = conn.prepareStatement(sql);
            ps.setDouble(1,1000);
            ps.setString(2,"ls");
            ps.executeUpdate();

            conn.commit();
        }catch (Exception e){
            e.printStackTrace();
            conn.rollback();
        }finally {
            JDBC_Util.close(conn,ps,rs);
        }
    }
}
