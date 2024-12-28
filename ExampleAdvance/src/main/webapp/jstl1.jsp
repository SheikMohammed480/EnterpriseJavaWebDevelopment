<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${'Good Day'}"/>  
<c:set var="Hike"  value="${25000}"/>
<c:out value="Hike="/>
<c:out value="${Hike}"/>
<c:remove var="Hike"/>
after removed value
<c:out value="${Hike}"/>
<br>
<c:set var="total" value="${90+90+99+100+100}"/>
<c:if test="${total<450}">
<c:out value="your mark is good:"/>
<c:out value="${total}"/>
</c:if>

<c:if test="${total>450}">
<c:out value="your mark is excellence"/>
<c:out value="${total}"/>
</c:if>
<c:choose>
<c:when test="${total==450 }">
your mark is 450
</c:when>
<c:when test="${total<=450 }">
your mark is low
</c:when>
<c:otherwise>
your mark is excellent
</c:otherwise>
</c:choose>

<br>
<c:forEach var="i" begin="1" end="5">
<p>please be quiet<c:out value="${i}"/></p>
</c:forEach>
</body>
</html>
