<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/RegisterServlet" method="post">
			<table style="width: 80%">
				<tr>
					<td>UserId</td>
					<td><input type="text" name="userId" pattern="[A-Za-z]{7,12}" required /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" pattern="[A-Za-z0-9]{7,12}" required/></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" pattern="[A-Za-z]{1,120}" required/></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address"/></td>
				</tr>
			<tr>
				<td><label for="country">Country:</label></td>
				<td><select name="country" id="country" required>
						<option value="Canada">Canada</option>
						<option value="Kenya">Kenya</option>
						<option value="UAE">UAE</option>
				</select></td>
			</tr>
			<tr>
					<td>Zip Code</td>
					<td><input type="text" name="zipcode" pattern="[0-9]{1,120}" required/></td>
			</tr>
			<tr>
					<td>Email</td>
					<td><input type="email" name="email"  required/></td>
			</tr>
			<tr>
				<td><label for="sex">Sex:</label></td>
				<td><input type="radio" name="sex" value="Male" required>
					<label for="sex">Male</label><br> 
					<input type="radio" name="sex" value="Female" > 
					<label for="sex">Female</label><br>
				</td>
			</tr>
			<tr>
				<td><label for="language">Language:</label></td>
				<td><input type="checkbox" name="language" value="English" required>
					<label for="language">English</label><br> 
					<input type="checkbox" name="language" value="Non English" > 
					<label for="language">Non English</label><br>
				</td>
			</tr>
			<tr>
					<td>About</td>
					<td><input type="text" name="about"/></td>
				</tr>




		</table>
			<input type="submit" value="Submit" />
		</form>




</body>
</html>