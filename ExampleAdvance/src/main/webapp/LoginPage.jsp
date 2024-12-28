<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
	background-image:url('img.jpg');
	background-repeat:no-repeat;
	background-position:center;
	background-size:cover;
	height:550px;
	background-attachment:fixed;
}
h4,h1,h3{
color:skyblue;
}
button{
	color:skyblue;
	background-color:grey;
}
p{
	color:green;
}
input{	
	width:10%;
	height:7px;
	background-color:transparent;
	
}
</style>
</head>
<body>
<center>
<b><h1>Login</h1>
</center>
<br>
<form action="LoginControl" method="post">
<h4>USERNAME:<input type="text" name="username"/><br></h4>
<h4>PASSWORD:<input type="password" name="password"/><br></h4>
<button name="btn-login">Login</button>
</b>
<h3>you don't have an account? register first!!!
<a href="RegisterPage.jsp">Register</a></h3>
</form>
</body>
</html>