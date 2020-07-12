<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
	<title>Simple Login Page</title>
	<link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>
	<br> <b> USER LOGIN</b>
	<br><blink> ${errMsg}</blink>
	<form action="/login" method="POST">
	    <br>
		<table>
			<tr align="center">
				<td>
					UserName : 
				</td>
				<td>
					<input type="text" name="username" placeholder="Username"/>
				</td>
			</tr>
			<tr align="center">
				<td>
					Password : 
				</td>
				<td>
					<input type="password" name="password" placeholder="password" required/>
				</td>
			</tr>
			<tr align="center">
			    <td></td>
				<td>
					<input type="submit" name="Submit" value="Submit"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>