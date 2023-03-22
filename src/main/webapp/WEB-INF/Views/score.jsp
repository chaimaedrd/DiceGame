<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Dice Game | Score</title>
	<link href="<%=request.getContextPath()%>/styles/index.css" rel="stylesheet">
</head>
<body>

	<div class="topnav">
	  <a class="active" href="<%=request.getContextPath()%>/game">Game</a>
	  <a href="<%=request.getContextPath()%>/leaderboard">Leaderboard</a>
	  <a href="#about">About</a>
	</div>
	
	<section class="container">
	
		<h1>Welcome to Dice Game Dashboard</h1>
		
		<div class="game-over">
			<h2>Game Over</h2>
						
			<h3>Your current score is : 20</h3>
			<h3>Your best score is : 38</h3>
		</div>
	  	  	
  	</section>
</body>
</html>