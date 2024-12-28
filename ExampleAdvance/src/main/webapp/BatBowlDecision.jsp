<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Choose Bat or Bowl</title>
</head>
<body>
    <h2>You won the toss! Choose your action:</h2>
    <form action="PlayerBat.jsp" method="post">
        <label>
            <input type="radio" name="userChoice" value="Bat" required> Bat
        </label>
        <label>
            <input type="radio" name="userChoice" value="Bowl" required> Bowl
        </label>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
