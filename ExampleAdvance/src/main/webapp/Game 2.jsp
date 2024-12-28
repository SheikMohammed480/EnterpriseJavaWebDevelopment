<!DOCTYPE html>
<html>
<head>
    <title>Rock Paper Scissors Game</title>
</head>
<style>

body{
	background-image:url('img.jpg');
	background-repeat:no-repeat;
	background-position:center;
	background-size:cover;
	height:550px;
	background-attachment:fixed;
	color:skyblue;
}
</style>
<body>
    <h2>Play Hand Game(Rock,paper,scissor)</h2>
    <form action="Game2" method="post">
        <label for="playerMove">Enter your move (Rock, Paper, Scissors):</label>
        <input type="text" id="playerMove" name="playerMove" required>
        <button type="submit">Play</button>
    </form>
    
    <br><br>
    
    <h3>Round Result:</h3>
    <p>${roundResult}</p> <!-- Display the result of the current round -->
    
    <h3>Final Result:</h3>
    <p>${finalResult}</p> <!-- Display the final result (after the game ends) -->
    <button><a href="SignOut.jsp">Main Page</a></button>
</body>
</html>
