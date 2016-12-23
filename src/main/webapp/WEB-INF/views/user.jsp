<%--
  Created by IntelliJ IDEA.
  User: yl1346
  Date: 2016/12/23
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
<c:forEach  items="${total}" var="user">
<tr>
    <td>姓名：${user.name}</td>
    <td>ID：${user.userid}</td>
    <td>密码：${user.password}</td>
    <td>年龄：${user.age}</td>
    <td><a href="http://localhost:8080/user/${user.userid}.form">删除</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>
