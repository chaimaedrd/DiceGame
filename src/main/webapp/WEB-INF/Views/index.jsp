<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Dice Game | Home</title>
	<link href="<%=request.getContextPath()%>/styles/index.css" rel="stylesheet">
</head>
<body>

	<div class="topnav">
	  <a class="active" href="<%=request.getContextPath()%>/game">Game</a>
	  <a href="<%=request.getContextPath()%>/leaderboard">Leaderboard</a>
	  <a href="#about">About</a>
		<form action="game" method="POST">
			<input type=hidden name="logout">
			<input type="submit" value="logout">
		</form>
	</div>
	
	<section class="container">
	
		<h1>Welcome to Dice Game Dashboard</h1>
		
		<form action="game" method="post">
		    <label for="diceNumber">Dice number</label>
		    <input type="number" id="diceNumber" name="diceNumber" placeholder="Write a number..." value="1">
		    
		    <input type="submit" value="Roll the Dice">
	  	</form>
	  	
	  	  	
  	</section>
</body>
</html>