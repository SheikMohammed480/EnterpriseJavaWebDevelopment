<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.RegisterProject" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
body{
	background-image:url('img.jpg');
	background-repeat:no-repeat;
	background-position:center;
	background-size:cover;
	height:550px;
	background-attachment:fixed;
}
h1,h3{
	text-align:center;
	color:skyblue;
}
</style>
<body>

<h1>Profile</h1>
<h3>
<%

String firstname=(String)session.getAttribute("first");
String lastname=(String)session.getAttribute("last");
String  user=(String)session.getAttribute("Login");

out.println("<br>");

out.println("<br>");
if(firstname!=null)
out.println("FirstName:"+firstname);
out.println("<br>");
if(lastname!=null)
out.println("Lastname:"+lastname);
out.println("<br>");
if(user!=null)
out.println("UserId:"+user);
 %>
 </h3>
</body>
</html>