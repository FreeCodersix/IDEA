package com.smallsix.jdbc.dao.impl;

//import com.smallsix.jdbc.dao.IStudentDao;
import com.smallsix.jdbc.domain.Student;
import com.smallsix.jdbc.util.JDBC_Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements IStudentDao{

   /* @Override
    public void save(Student stu) {

        Connection conn = null;
        PreparedStatement ps = null;
        try{
            *//*
            //1.加载驱动
            Class.forName(JDBC_Util.driverName);

            //2.连接数据库
            conn = DriverManager.getConnection(JDBC_Util.url,JDBC_Util.user,JDBC_Util.pwd);
            *//*

            //加载驱动并连接数据库，作用等同1,2
            conn = JDBC_Util.getConn();

            //3.创建SQL语句
            //3.1写SQL语句
            String sql = "insert into student values(?,?,?)";
            //3.2创建管道
            ps = conn.prepareStatement(sql);
            ps.setInt(1,stu.getId());
            ps.setString(2,stu.getName());
            ps.setInt(3,stu.getAge());
            //4.执行SQL语句
            ps.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBC_Util.close(conn,ps,null);
        }
    }

    @Override
    public void update(int id,Student stu) {

        Connection conn = null;
        PreparedStatement ps = null;
        try{
            *//*
            //1.加载驱动
            Class.forName(JDBC_Util.driverName);

            //2.连接数据库
            conn = DriverManager.getConnection(JDBC_Util.url,JDBC_Util.user,JDBC_Util.pwd);
            *//*

            //加载驱动并连接数据库，作用等同1,2
            conn = JDBC_Util.getConn();

            //3.创建SQL语句
            //3.1写SQL语句
            String sql = "update student set name = ? , age =? WHERE id = ?";
            //3.2创建管道
            ps = conn.prepareStatement(sql);
            ps.setString(1,stu.getName());
            ps.setInt(2,stu.getAge());
            ps.setInt(3,id);
            //4.执行SQL语句
            ps.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBC_Util.close(conn,ps,null);
        }
    }

    @Override
    public void delete(int id) {

        Connection conn = null;
        PreparedStatement ps = null;
        try{
            *//*
            //1.加载驱动
            Class.forName(JDBC_Util.driverName);

            //2.连接数据库
            conn = DriverManager.getConnection(JDBC_Util.url,JDBC_Util.user,JDBC_Util.pwd);
            *//*

            //加载驱动并连接数据库，作用等同1,2
            conn = JDBC_Util.getConn();

            //3.创建SQL语句
            //3.1写SQL语句
            String sql = "delete from student WHERE id = ?";
            //3.2创建管道
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            //4.执行SQL语句
            ps.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBC_Util.close(conn,ps,null);
        }
    }

    @Override
    public Student get(int id) {

        Connection conn = null;
//        Statement st = null;
        PreparedStatement ps = null;
        ResultSet row = null;
        try{
            *//*
            //1.加载驱动
            Class.forName(JDBC_Util.driverName);

            //2.连接数据库
            conn = DriverManager.getConnection(JDBC_Util.url,JDBC_Util.user,JDBC_Util.pwd);
            *//*

            //加载驱动并连接数据库，作用等同1,2
            conn = JDBC_Util.getConn();

            //3.创建SQL语句
            //3.1写SQL语句
            String sql = "SELECT * FROM STUDENT WHERE id = ?";
            //3.2创建管道

            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            //4.执行SQL语句
            row = ps.executeQuery();
            if(row.next()){
                Student student = new Student();
                student.setAge(row.getInt("age"));
                student.setId(row.getInt("id"));
                student.setName(row.getString("name"));
                return student;
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBC_Util.close(conn,ps,row);
        }
        return null;
    }

    @Override
    public List<Student> getAll() {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet row = null;
        try{
           *//*
            //1.加载驱动
            Class.forName(JDBC_Util.driverName);

            //2.连接数据库
            conn = DriverManager.getConnection(JDBC_Util.url,JDBC_Util.user,JDBC_Util.pwd);
            *//*

            //加载驱动并连接数据库，作用等同1,2
            conn = JDBC_Util.getConn();

            //3.创建SQL语句
            //3.1写SQL语句
            String sql = "SELECT * FROM student";
            //3.2创建管道
            ps = conn.prepareStatement(sql);
            //4.执行SQL语句
            row = ps.executeQuery();

            List<Student> list = new ArrayList<Student>();
            while(row.next()){
                Student student = new Student();
                student.setAge(row.getInt("age"));
                student.setId(row.getInt("id"));
                student.setName(row.getString("name"));
                list.add(student);
            }
            return list;

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBC_Util.close(conn,ps,row);
        }
        return null;
    }*/
}
