<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>

	这是首页
	<% 
	//session是单用户的  多页面可共享的 session保存在服务器端的  每个session有一个唯一的id
     out.print(session.getId());
     Object oUsername = session.getAttribute("username");
    if(oUsername!=null){
    	out.println("欢迎您，"+oUsername);
    	%>
    	<a href="loginout.jsp">注销</a>
    	<%
    }else{
    	%>
	<%out.print("没有东西"); %>
	<%
    }
    %>
    <a href="01.jsp">跳转</a>
    
    
    <%
    //统计该页面的访问次数
         Object count = application.getAttribute("count");
         if(count==null){
        	//第一次访问该页面时需要创建一个存储访问次数的变量 并将其放进application
        	application.setAttribute("count", 1);
         }else{
        	//非第一次访问 去application中先将记录次数的变量拿出来，+1将最新的访问次数放进application中
        	Integer i = (Integer)count;
        	application.setAttribute("count", i+1);
         }
         Integer icount = (Integer)application.getAttribute("count");
         out.println("次数"+count);
    %>
</body>
</html>