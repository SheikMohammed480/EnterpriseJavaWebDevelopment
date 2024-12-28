<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% int a=10;
int b=15;
out.println("\n addition"+(a+b));

%>
<%="\n addition"+(a+b) %><%--we can directly print message + execution --%>
<%--implicit object --%>
<%out.println("\n today is \n "+ java.util.Calendar.getInstance().getTime()); %>
<%--jsp request --%>
<%
String n=request.getParameter("name");
out.println("welcome "+n);
out.println("welcome "+request.getParameter("name"));
%>

<%--jsp response link must have http or https --%>
<%  response.sendRedirect("http://www.google.com"); %>

<%--config jsp file  to get servletName--%>
<%String ns=config.getServletName(); 
out.println("servlet name is"+ns);
%>
</body>
</html>