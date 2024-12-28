<!DOCTYPE html>
<html>
<head>
    <title>Hand Cricket Game</title>
</head>
<style>
body{
	background-image:url('img.jpg');
	background-position:top;
	background-repeat:no-repeat;
	background-size:cover;
	background-attachment:fixed;
	
	
}
label,h1{
	color:skyblue;
}

</style>
<body>
    <h1>Welcome to Hand Cricket Game</h1>

   <form action="Game1" method="post">
    <input type="hidden" name="action" value="toss" />
    <label>Choose Toss (Head or Tail):</label>
    <input type="text" name="userToss" />
    <button type="submit">Toss</button>
</form>

<form action="Game1" method="post">
    <input type="hidden" name="action" value="start" />
    <label>Choose to (Bat or Bowl):</label>
    <input type="text" name="decision" />
    <button type="submit">Start Game</button>
</form>

<form action="Game1" method="post">
    <input type="hidden" name="action" value="play" />
    <label>Enter your move (0-10):</label>
    <input type="number" name="move" min="0" max="10" />
    <button type="submit">Play Turn</button>
</form>

      <button><a href="SignOut.jsp">Main Page</a></button>
</body>
</html>
