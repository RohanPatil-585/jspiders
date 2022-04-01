<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="changepassword.do" method="post">
<h1>${msg}</h1>
Email:<input type="text" name="email">
OldPassword:<input type="password" name="oldpass">
NewPassword:<input type="password" name="newpass">
<input type="submit" value="update">
</form>
</body>
</html>