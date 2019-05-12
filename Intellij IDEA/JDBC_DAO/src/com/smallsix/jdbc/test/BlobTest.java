package com.smallsix.jdbc.test;

import com.smallsix.jdbc.util.JDBC_Util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class BlobTest {
    public static void main(String[] args) throws Exception {
        Connection conn = JDBC_Util.getConn();
        String sql = "select * from student where id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,1);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            Blob blob = rs.getBlob("img");

            InputStream in = blob.getBinaryStream();
            Files.copy(in, Paths.get("C:/Users/Administrator.PC-20190314POGY/Desktop/fcc.png"));
        }
        JDBC_Util.close(conn,ps,rs);
    }
    void write() throws Exception {
        Connection conn = JDBC_Util.getConn();
        String sql = "UPDATE student SET img = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        FileInputStream in = new FileInputStream("C:/Users/Administrator.PC-20190314POGY/Desktop/fcc.png");

        ps.setBlob(1,in);
        ps.executeUpdate();
        JDBC_Util.close(conn,ps,null);
    }
}
