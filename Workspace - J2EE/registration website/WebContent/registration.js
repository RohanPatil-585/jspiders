function validation() 
{
	var fname = document.getElementById("fname").value;
	var mname = document.getElementById("mname").value;
	var lname = document.getElementById("lname").value;
	var dob = document.getElementById("bdate").value;
	var mono = document.getElementById("mono").value;
	var email = document.getElementById("email").value;
	if (fname==null || fname=="")
	{  
		  alert(" first Name can't be blank");  
		  return false;  
	}
	
	if (mname==null || mname=="")
	{  
		  alert(" middle Name can't be blank");  
		  return false;  
	}
	
	if (lname==null || lname=="")
	{  
		  alert(" last Name can't be blank");  
		  return false;  
	}
	
	if (dob==null || dob=="")
	{  
		  alert(" date of birth can't be blank");  
		  return false;  
	}
	
	if (mono==null || mono=="")
	{  
		  alert(" mobile number can't be blank");  
		  return false;  
	}
	else if(isNaN(mono))
	{
		alert("enter numeric values only");
		return false;
	}
	else if (mono.length<10 || mono.length>10)
	{
		alert("mobile number must be of 10 digits");
		return false;
	}
	
	if (email==null || email=="")
	{  
		  alert(" email can't be blank");  
		  return false;  
	}
}