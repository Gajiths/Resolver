<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<body>
	<h2>Sign in</h2><span><a href="register">here</a></span>
	
	<form action="login" method="post">
	<table >
		<tr>
			<td><input type="text" name="username" class="form-control" placeholder="Username"></td>
			
		</tr>
		<tr>
			<td><input type="password" name="password" class="form-control" placeholder="Password"></td>
		</tr>
		<tr>
			<td>${error}</td>
		</tr>
		<tr>
			<td><input type="submit" name="submit" value="Login" class="btn btn-primary"></td>
			
		</tr>

	</table>
	</form>
</body>
</html>
