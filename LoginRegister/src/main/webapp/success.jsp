<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Successfully Login</h1>
<%
String username=(String)request.getAttribute("myname");
String password=(String)request.getAttribute("Mypassword");
%>

UserName:<%=username%><br><br>
Password:<%=password %>


</body>
</html>