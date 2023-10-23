<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<img src="https://www.hellovizag.in/storage/greater-visakhapatnam-municipal-corporation-1635508497.jpg"/>
<br>
<br>
<form method="post" action="/addComplaint" modelAttribute="comp">
Raise Complaint Here:<select path="Raise Here" id="comp">
  <option value="sewage">Sewage</option>
  <option value="drinage">Drinage</option>
  <option value="water">water</option>
  <option value="Muncipal Facilities">others</option>
</select>
<button type="submit">Submit Complaint</button>
</form>
<a href="http://vmrda.gov.in/about.aspx">About</a>
<form method="post" action="logout">
    <input type="submit" value="Logout"/>
</body>
</html>