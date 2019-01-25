<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>
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
    //表单post方式提交的中文乱码处理
    request.setCharacterEncoding("utf-8");
    //response.setCharacterEncoding("utf-8");相应也改成中文 可加可不加
    
   
    
    //获取用户注册的数据:用户名 密码 email 爱好
    String userName = request.getParameter("username");
    
    
    String pwd = request.getParameter("password");
    String email = request.getParameter("email");
    //获取表单的复选框的值
    String[]hobbys = request.getParameterValues("hobby"); 
    %>
    用户名：
    <%
    if(userName!=null && !userName.equals("")){
    	 /* 表单get方式提交中文乱码处理
        byte[] userNames = userName.getBytes("ISO-8859-1");
        userName = new String(userNames,"utf-8"); */
        //userName = new String(userName.getBytes("ISO-8859-1"),"UTF-8");
        if(userName.equals("admin")){
        	//用户注册失败跳转会注册页面
        	request.setAttribute("mess","注册失败请更换用户名");//在一次请求的范围内
        	request.getRequestDispatcher("userCreate.jsp").forward(request, response); //转发 的跳转 forward是携带 
        }else{
        	//注册成功跳转到首页
        	//request.setAttribute("mess","注册成功！");//是两次请求
        	
        	/* String info = "成功";
        	info = URLEncoder.encode(info, "utf-8"); */
        	
        	session.setAttribute("username", userName);
        	//设置session的过期  这是服务器清除
        	//session.setMaxInactiveInterval(5);
        	
        	//使用cookie记录用户名，实现自动填写用户名功能
        	Cookie cookie = new Cookie("username",userName);
        	cookie.setMaxAge(60*60);
        	response.addCookie(cookie);
        	
        	response.sendRedirect("index.jsp");//重定向 的跳转   request.getContexPath()+/index.jsp" 不在同一页面下的跳转
        }
        //重定向是客户端行为 转发是服务器行为
    %>
    
    <%
    }else{
    	out.println("用户名未填写！");
    }
    %><br/>
    用户密码：<%=pwd %><br/>
    用户Email:<%=email %><br/>
    用户爱好：<br/>
    <%
    if(hobbys!=null && hobbys.length!=0){
    	//用户选择了爱好，将爱好获得并输出
    	for(String hobby:hobbys){
    		out.println(hobby+"<br/>");
    	}
    }else{
    	out.println("您没有选择任何爱好！");
    }
    %><br/>
</body>
</html>