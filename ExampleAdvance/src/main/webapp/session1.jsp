<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
	String n=request.getParameter("name");
	out.println("welcome "+n);
	session.setAttribute("name",n);
	
	String n1=(String)session.getAttribute("name");
	out.println("n1="+n1);
	
	%>
	<%--page context --%>
	<% pageContext.setAttribute("name1",n1,pageContext.SESSION_SCOPE);
	String n3=(String)pageContext.getAttribute("name1",pageContext.SESSION_SCOPE);
	out.println(n3);
	%>
</body>
</html>