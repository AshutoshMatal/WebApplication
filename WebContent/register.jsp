<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BridgeLabz Registration</title>
<style type="text/css">
section {
	width: 45%;
	background-color: white;
	padding: 25px 0 25px 0;
	margin: 100px 200px 100px 300px;
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
			<b>Registration Form</b>
		</h1>
	</header>
	<section>
		<form>
		<h4 align="center">Registration to Bridgelabz Solutions</h4><br>
			<table align="center">
				<tr>
					<th>UserName :</th>
					<td><input type="text" name="username"
						placeholder="emaild or username"></td>
				</tr>
				<tr>
					<th>Name :</th>
					<td><input type="text" name="name" placeholder="Name"></td>
				</tr>
				<tr>
					<th>Password :</th>
					<td><input type="password" name="password1"
						placeholder="password1"></td>
				</tr>
				<tr>
					<th>Re-Enter_Password :</th>
					<td><input type="password" name="password2"
						placeholder="password2"></td>
				</tr>
				<tr>
					<th>emailId :</th>
					<td><input type="text" name="emailid" placeholder="emailid"></td>
				</tr>
				<tr>
					<th>Country :</th>
					<td><input type="text" name="country" placeholder="country"></td>
				</tr>
				<tr>
				<th>
					<td><input type="submit" name="submit" value="register"></td>
				</th>
				</tr>
			</table>
		</form>
	</section>
</body>