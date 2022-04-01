<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" type="text/css" href="registration.css">
  <script type="text/javascript" src="registration.js"></script>
<title>student registration</title>
</head>
<body background="04.jpg">

<form action="Registration" method="post" onsubmit="return validation()" enctype="multipart/form-data">
<table align="center" style="color: yellow;">
<tr><td>First Name: </td><td><input type="text" name="fname" id="fname" class="text" title="enter first name" ></td></tr>
<tr><td>Middel Name: </td><td><input type="text" name="mname" id="mname" class="text" title="enter middle name"></td></tr>
<tr><td>Last Name: </td><td><input type="text" name="lname" id="lname" class="text" title="enter last name"></td></tr>
<tr><td>Date Of Birth:</td>
	<td>
	<input type="text" name="bdate" id="bdate" class="text" title="enter birthdate">
	</td>
</tr>
<tr><td>Mobile No:</td>
	<td>
	<input type="text" name="mono" id="mono" class="text" title="enter mobile number">
	</td>
</tr>
<tr><td>Email Id:</td>
	<td>
	<input type="text" name="email" id="email" class="text" title="enter email id">
	</td>
</tr>
<tr><td>Country: </td>
	<td>
		<label for="country"></label>
		<select id="country" name="country" title="select country">
			<option>--Select Country--</option>
			<option>india</option>
			<option>america</option>
			<option>china</option>
			<option>russia</option>
			<option>israel</option>
			</optgroup>
		</select>
	</td>
</tr>

<tr><td>City: </td>
	<td>
		<label for="city"></label>
		<select id="city" name="city" title="select city">
			<option>--Select City--</option>
			<optgroup label="metro cities">
			<option>New Delhi</option>
			<option>Kolkata</option>
			<option>Mumbai</option>
			<option>Chennai</option>
			</optgroup>
			<optgroup label="other">
			<option>surat</option>
			<option>navsari</option>
			<option>nashik</option>
			<option>dhule</option>
			</optgroup>
		</select>
	</td>
</tr>
<tr><td>Gender: </td>
  <td> <input type="radio" name="gender" id="male" title="select male??" value="male"> 
       <label for="m">Male</label>
    
       <input type="radio" name="gender" id="female" title="select female??" value="female"> 
       <label for="f">Female</label> 
  </td>
</tr>
<tr><td>Area Of Expt: </td>
	<td>
		<label> <input type="checkbox" title="check java" name="java" value="java" id="java"> :java</label>
		<label> <input type="checkbox" title="check python" name="python" value="python" id="python"> :python</label>
	</td>
</tr>
<tr><td>File: </td><td><input type="file" name="file" title="choose file from location" id="file"></td></tr>
<tr><td>Address: </td><td><textarea rows="4" cols="50" style="color: purple;" title="enter address" name="address" id="address"></textarea></td></tr>
<tr><td></td><td><input type="submit" value="submit" class="button">  <input type="reset" class="button"></td></tr>
</table>
</form>
</body>
</html>