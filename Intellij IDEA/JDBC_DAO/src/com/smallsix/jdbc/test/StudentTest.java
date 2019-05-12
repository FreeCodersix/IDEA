/*
package com.smallsix.jdbc.test;

import com.smallsix.jdbc.dao.IStudentDao;
import com.smallsix.jdbc.dao.impl.StudentDaoImpl;
import com.smallsix.jdbc.domain.Student;
import org.junit.Test;

import java.util.List;

public class StudentTest {

    public static void main(String[] args) {

    }

    @Test
    public void save(){
        Student stu = new Student();
        stu.setId(1);
        stu.setName("鲁班");
        stu.setAge(18);
        IStudentDao dao = new StudentDaoImpl();
        dao.save(stu);
    }

    @Test
    public void Updata(){
        Student stu = new Student();
        stu.setName("鲁班");
        stu.setAge(18);
        IStudentDao dao = new StudentDaoImpl();
        dao.update(2,stu);
    }

    @Test
    public void delete(){
        IStudentDao dao = new StudentDaoImpl();
        dao.delete(2);
    }

    @Test
    public void get(){
        IStudentDao dao = new StudentDaoImpl();
        Student stu = dao.get(1);
        System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAge());
    }

    @Test
    public void getAll(){
        IStudentDao dao = new StudentDaoImpl();
        List<Student> list = dao.getAll();
        int i=0;
        while(i<list.size()){
            System.out.println(list.get(i).getId()+" "+list.get(i).getName()+" "+list.get(i).getAge());
            i++;
        }
    }
}
*/
