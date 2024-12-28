<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Game Over</title>
</head>
<body>
    <h2>Game Over!</h2>
    <p>Your final score: <%= request.getAttribute("playerScore") %></p>
    <p>Computer's final score: <%= request.getAttribute("computerScore") %></p>
    <h3><%= request.getAttribute("result") %></h3>
    <a href="Start.jsp">Restart Game</a>
</body>
</html>
