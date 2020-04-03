<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BridgelabzSolution Login</title>
<style type="text/css">
section {
	width: 45%;
	background-color: white;
	padding: 25px 0 25px 0;
	margin: 100px 200px 100px 250px;
}
form input {
	width: 80%;
	padding: 10px;
	margin: 10px;
}
</style>
</head>
<body style="background-color: #eeffee;">
	<header
		style="background-color: #3b5998; color: white; padding: 20px opx 1px 100px;">
		<h1>
			<b>Bridgelabz Solutions</b>
		</h1>
	</header>
	<section>
		<form action="<%=request.getContextPath() %>/loginServlet" method="post" align="center">
			<input type="hidden" name="operation" value="login">
			<h4 align="center">Login to Bridgelabz Solutions</h4>
			<br>
			<table align="center">
				<tr>
					<td><h3 style=color:"red;">${message}</h3>
						<h3 style=color:"green;">${successMessage}</h3></td>
				</tr>
				<tr>
					<th>UserName :</th>
					<td><input type="text" name="username"
						placeholder="emaild or username"></td>
				</tr>

				<tr>
					<th>Password :</th>
					<td><input type="password" name="password1"
						placeholder="password"></td>
				</tr>

				<tr>
					<th>
					<td><input type="submit" name="submit" value="Login"></td>

					<td><a href="register.jsp">Registration</a></td>
					</th>
				</tr>
			</table>

		</form>
	</section>
</body>
</html>