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
					<td><input type="text" name="address"  optional/></td>
				</tr>
				
			</table>
			<input type="submit" value="Submit" />
		</form>




</body>
</html>