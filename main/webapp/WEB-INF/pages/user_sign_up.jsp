<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form action="signup" method="post">
	
	<table cellpadding="5">
		<tr>
			<td>FirstName :</td>
			<td> 
				<div class="input-group input-group-sm">
					<input type="text" class="form-control" name="fname">
		  			<span class="input-group-addon">*</span>
	  			</div>
	  		</td>
		</tr>
		<tr>
			<td>LastName :</td>
			<td>
				<div class="input-group input-group-sm">
				  <input type="text" name="lname" class="form-control" >
				  <span class="input-group-addon">*</span>
				</div>
			</td>
		</tr>
		
		<tr>
			<td>Email :</td>
			<td>
				<div class="input-group input-group-sm">
					<input type="text" name="email" class="form-control" >
				 	<span class="input-group-addon">*</span>
				</div>
			</td>
		</tr>
		
		<tr>
			<td>UserName:</td>
			<td>
				<div class="input-group input-group-sm">
				 
				  <input type="text" name="username" class="form-control">
				   <span class="input-group-addon">*</span>
				</div>
	
			</td>
		</tr>
		<tr>
			<td>password :</td>
			<td>
				<div class="input-group input-group-sm">
				  
				  <input type="password" name="password" class="form-control">
				  <span class="input-group-addon">*</span>
				</div>
			</td>
		</tr>
		
		<tr>
			<td><input type="submit" name="submit" value="Register" class="btn btn-primary"></td>
		</tr>
	</table>
	<h3>${registered}</h3>
	</form>

</body>
</html>