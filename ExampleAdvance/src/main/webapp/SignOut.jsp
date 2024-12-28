<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
body{
	color:skyblue;
	background-image:url('img.jpg');
	background-repeat:no-repeat;
	background-position:center;
	background-size:cover;
	height:550px;
	background-attachment:fixed;
}
img{
	width:20%;
	height:300px;
}
a{
	color:skyblue;
	}
</style>
<body>
<% if(session.getAttribute("Login")==null||session.getAttribute("Login")=="")
	{
	
	response.sendRedirect("LoginPage.jsp");
	}%>
<center>welcome,<%=session.getAttribute("Login") %>
	<br>
	<br>
	<pre>
	<a href="Game 1.jsp"><img src="image2.jpg" alt="logical game 1"/> Game 1(Hand Cricket)</a>               <a href="Game 2.jsp"><img src="image3.jpg" alt="logical game 2"/>Game 2(Rock,paper,Scissor)</a>
	<br>
	<a href="profile.jsp">profile</a>
	<br>
	<a href="logout1.jsp">Logout</a>
	</pre>
</center>
</body>
</html>