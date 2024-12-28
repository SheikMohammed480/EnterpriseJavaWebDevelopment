<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>the value</h1>
<%!String n1="sheik";
	String n2="mohammed";
	
	String getFirstName()
	{
		return n1;
		
	}
	String getLastName()
	{
		return n2;
	}

%>
FirstName:
<%=n1 %>
<br>
LastName:
<%=n2 %>
<br>
<%= getFirstName()
%>
<%= getLastName() %>
</body>
</html>