package jdbc.dao;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setId(4);
        stu.setName("李白");
        stu.setAge(18);
        StudentDao dao = new StudentDao();
        dao.save(stu);
    }
}
