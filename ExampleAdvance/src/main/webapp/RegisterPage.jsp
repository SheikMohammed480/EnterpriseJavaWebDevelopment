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
<h1><b>Register</h1></center>
<br>
<form action="RegisterControl" method="post">
<h4>FirstName:  <input type="text" name="firstName"/></h4><br>
<h4>LastName:   <input type="text" name="lastName"/></h4><br>
<h4>Username:   <input type="text" name="username"/></h4><br>
<h4>Password:   <input type="password" name="password"/></h4><br>
<button name="btn-register">     Register</button>
</b>
<p><h3>you have an account? then <a href="LoginPage.jsp"><p>Login</p></a></h3>
</form>
</body>
</html>