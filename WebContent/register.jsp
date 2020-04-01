<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BridgeLabz Registration</title>
</head>
<body>
	<h1>
		<b>Registration Form</b>
	</h1>
	<section>
		<form>
			<table>
				<tr>
					<th>Username:</th>
					<td><input type="text" name="username"
						placeholder="emaild or username"></td>
				</tr>
				<tr>
					<th>Name</th>
					<td><input type="text" name="name" placeholder="Name"></td>
				</tr>

				<tr>
					<th>Password:</th>
					<td><input type="password" name="password1"
						placeholder="password1"></td>
				</tr>
				<tr>
					<th>Re-Enter_Password:</th>
					<td><input type="password" name="password2"
						placeholder="password2"></td>
				</tr>


				<tr>
					<td><input type="submit" name="submit" value="register"></td>
				</tr>
			</table>
		</form>
	</section>
</body>