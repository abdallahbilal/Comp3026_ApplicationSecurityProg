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
					<td><input type="text" name="userId" required /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="text" name="password" pattern="[0-9]{9}" required/></td>
				</tr>
				
			</table>
			<input type="submit" value="Submit" />
		</form>




</body>
</html>