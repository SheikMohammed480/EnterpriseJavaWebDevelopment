<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <h2>this is main jsp file</h2>
 <jsp:forward page="PrintDate.jsp"/>
<h2>this is after forward statement</h2>
--%>
<h2>this is main jsp file</h2>
 <jsp:include page="PrintDate.jsp"/>
<h2>this is after forward statement</h2>
</body>
</html>