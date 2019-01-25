<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>
</head>
<body>
<form name="registerFrm" id="registerFrm" action="doUserCreate.jsp" method="post">
    <table class="tb" border="0"  cellspacing="5" cellpading="0" align="center">
         <tr><td align="center" colspan="2" style="text-align: center;"class="text_tabledetail2">用户注册</td></tr>
         <tr>
             <td class="text_tabledetail2">用户名</td>
             <td><input type="text" name="username" value=""/></td>
         </tr> 
          <tr>
             <td class="text_tabledetail2">密码</td>
             <td><input type="password" name="password" value=""/></td>
         </tr> 
          <tr>
             <td class="text_tabledetail2">确认密码</td>
             <td><input type="password" name="con_password" value=""/></td>
         </tr> 
         <tr>
             <td class="text_tabledetail2">email</td>
             <td><input type="text" name="email" value=""/></td>
         </tr> 
          <tr>
             <td class="text_tabledetail2">爱好</td>
             <td><input type="checkbox" name="hobby" value="swim"/>游泳</td>
             <td><input type="checkbox" name="hobby" value="read"/>阅读</td>
             <td><input type="checkbox" name="hobby" value="climb"/>爬山</td>
             <td><input type="checkbox" name="hobby" value="travel"/>旅游</td>
         </tr> 
      <tr>
             <td style="text-align:center;" colspan="2" >
             <button type="submit" class="page-btn" name="save">注册</button>
             <button type="button" class="page-btn" name="return" onclick="javascript:location.href='<%=request.getContextPath()%>'">确定</button>
         </tr> 
    </table>
    </form>
    <% 
    out.print(session.getId());
     Object omess = request.getAttribute("mess");
    if(omess!=null){
    	out.println(omess.toString());
    }
    %>
    <!-- 请求转发 -->
    <%-- <jsp:forward page="01.jsp"></jsp:forward> --%>
</body>
</html>