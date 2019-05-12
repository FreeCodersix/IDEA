package SS;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        //此时应该要把账号密码封装成JavaBean 访问后台数据库验证登录，这里简化了
        if(name!=null && name.startsWith("hncu") && pwd!=null &&pwd.length()>3){
            //登录成功，访问主页
            request.getSession().setAttribute("name", name);
            request.getRequestDispatcher("/jsps/table.jsp").forward(request, response);
        }else{//登录失败，重修返回登录界面
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }

    }

}
