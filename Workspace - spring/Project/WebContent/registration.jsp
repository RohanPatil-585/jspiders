<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="black" text="white">
	<form action="reg.do" method="post">
		<h1>Welcome to registration page</h1>
		<pre>
Name:<input type="text" name="name"><br>
Phone No:<input type="text" name="phno"><br>
Email ID:<input type="text" name="email"><br>
Password:<input type="password" name="password"><br>
Contry:<select name="contry">
<option value="India">India</option>
<option value="USA">USA</option>
<option value="RSA">RSA</option>
</select>
<input type="submit" value="register">
<br>
<a href="login.jsp">Login</a>
</pre>
	</form>
</body>
</html>