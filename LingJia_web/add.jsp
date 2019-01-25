<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加页面</title>
</head>
<body>
	<form action="dopage/doAdd.jsp" method="post">
		编号：<input type="text" name="eid"><br><br>
		名字：<input type="text" name="ename"><br><br>
		年龄：<input type="number" name="age"><br><br>
		部门：
			<select name="did">
				<option value="001">开发部</option>
				<option value="002">实施部</option>
				<option value="003">测试部</option>
			</select><br><br>
		<input type="submit" value="保存">&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" onclick="javascript:history.back()" value="返回">
	</form>
</body>
</html>