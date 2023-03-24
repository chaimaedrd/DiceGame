<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Dice Game | Register</title>
<link href="<%=request.getContextPath()%>/styles/login.css" rel="stylesheet">
</head>
<body>

<h1>Welcome to Dice Game Registration</h1>

<section id="container-section">
	<form action="register" method="post">
	  <div class="container">
	  
	  	<label for="firstName"><b>First Name</b></label>
	    <input type="text" placeholder="Enter First name..." id="firstName" name="firstName" required>
	  
	  	<label for="lastName"><b>Last Name</b></label>
	    <input type="text" placeholder="Enter Last name..." id="lastName" name="lastName" required>
	  
	    <label for="login"><b>Email</b></label>
	    <input type="text" placeholder="Enter login..." id="login" name="login" required>
	
	    <label for="password"><b>Password</b></label>
	    <input type="password" placeholder="Enter Password...." id="password" name="password" required>
	        
	    <button type="submit">Register</button>
	  </div>
	  <div class="container" >
	    <p class="psw">You have already an account? 
	    	<a href="<%=request.getContextPath()%>/login">Sign in</a>
	    </p>
	  </div>
	</form>
</section>
</body>
</html>
