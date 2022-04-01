<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	int id = Integer.parseInt(request.getParameter("id"));

Connection con = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
String query = "select filename from student.employee_image where id=" + id + "";
System.out.println(query);
try
{
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
	pstmt = con.prepareStatement(query);
//	pstmt.setString(1, firstname);
	rs = pstmt.executeQuery();
	while(rs.next())
	{
		String filename = rs.getString("filename");
			
 %>

<table style="width: 100%">
	<tr>
	
		<th> fname </th>
		<th> image </th>
	</tr>
	<tr>
		<td><%= filename %></td>
		<td><img src="images\<%= filename %>" width="200" height="200"></td>
	</tr>
	</table>
	
	<%			
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	%>
	
</body>
</html>