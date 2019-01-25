<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	111111111
	<%
	Object oUsername = session.getAttribute("username");
	if (oUsername != null) {
		out.println("欢迎您，" + oUsername);
	} else {
%>
	<%
		out.print("没有东西");
	%>
	<%
		}
	%>
</body>
</html>