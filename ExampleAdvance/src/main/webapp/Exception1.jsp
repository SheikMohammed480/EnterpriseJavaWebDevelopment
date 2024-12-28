<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("n");
String name1=request.getParameter("n1");
int a=Integer.parseInt(name);
int b=Integer.parseInt(name1);
int c=a/b;
out.println(c);
%>
</body>
</html>