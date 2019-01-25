<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%
   //用户注销这个会话
   session.invalidate(); //全部失效 或者修改配置文件
   //session.removeAttribute("username");某一个属性用这个操作  
   response.sendRedirect("index.jsp");
   %>
</body>
</html>