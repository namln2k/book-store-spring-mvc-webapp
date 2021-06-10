<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>


<head>
<link rel="stylesheet"
	href="<c:url value="/assets/user/css/login.css"/>" />
<title>Login Page</title>
</head>
<body>
	<div class="login">
		<h2 class="login-header">Log in</h2>

		<form class="login-container form-horizontal" action="LoginController"
			method="post">
			<p>
				<input onChange="setUsername()" id="username" type="text"
					placeholder="Username">
			</p>
			<p>
				<input onChange="setPassword()" id="password" type="password"
					placeholder="Password">
			</p>
			<p align="center">
				<a href="#" id="login-button" type="submit" class="btn btn-success">Log
					in</a>
			</p>
		</form>
	</div>
	<script type="text/javascript">
		function setUsername() {
			var username = document.getElementById("username").value;
			var password = document.getElementById("password").value;
			var href = '<c:url value="/login/' + username + '/' + password + '"/>';
			document.getElementById("login-button").href = href;
		}
		function setPassword() {
			var username = document.getElementById("username").value;
			var password = document.getElementById("password").value;
			var href = '<c:url value="/login/' + username + '/' + password + '"/>';
			document.getElementById("login-button").href = href;
		}
	</script>
</body>
</html>