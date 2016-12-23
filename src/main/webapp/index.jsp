<%--
  Created by IntelliJ IDEA.
  User: yl1346
  Date: 2016/12/20
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h>hello word</h>
<a href="http://localhost:8080/user/test.form">查看所有用户</a>
<form action="/user/add.form" method="post">
   姓名：<input type="text" name="name">
    密码：<input type="password" name="password">
   年龄： <input type="text" name="age">
    <input type="submit" value="提交">
</form>
</body>
</html>
