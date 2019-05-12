<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/8
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<h3>客户信息添加</h3>
<form target="ifrm" name="ss" action="<c:url value='/SaveServlet' />" method="post">
    姓名:<input type="text" name="name"/><br/>
    年龄:&nbsp;<input type="text" name="age"/><br/>
    地址:<input type="text" name="addr"/><br/><br/>
    <input type="button" value="添加" onclick="save();"/> &nbsp;&nbsp;
    <input type="button" value="取消" onclick="window.close();"/><br/>
</form>

<iframe name="ifrm" style="display:none;"></iframe>

<script type="text/javascript">
    function save(){
        document.forms['ss'].submit();
    }

    //该方法由后台返回的saveback.jsp(在iframe中,子页)反调这里(父页)
    function realSave(obj){
        //window.returnValue="aa";
        //window.close();
        window.returnValue=obj;
        window.close();
    }
</script>
</body>
</html>

