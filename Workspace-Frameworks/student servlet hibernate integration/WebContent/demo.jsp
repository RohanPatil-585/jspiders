<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <%@ page import="java.util.List,org.jspiders.dto.studentDto.*" %>
     <h3> Insert Student </h3>
     <h4> Enter Student login details  </h4>
     <form action="rohan" method="POST">
        <table >
           <tr> <td>NAME </td> 
             <td> <input type="text" name="name" /> </td>
           </tr>
           <tr> <td>PASSWORD </td> 
              <td> <input type="password" name="password" /> </td>
           </tr>
           <tr> <td>CITY </td> 
              <td> <input type="text" name="city" /> </td>
           </tr>
           <tr> <td><input type="Submit" value="Save"/> </td> 
           </tr>
        </table>
     </form></body></html>