<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<style>
	body {
		background-image: linear-gradient(to bottom right, rgba(255, 136, 0, 0.582) 60%, rgba(15, 221, 15, 0.521));
		background-attachment: fixed;
		text-align: center;
	}
</style>
</head>
<body>
<%String msg=(String)request.getAttribute("msg"); %>
<h1><%=msg %></h1>
<h3><a href="emaillogin.jsp" >Login</a></h3>
</body>
</html>