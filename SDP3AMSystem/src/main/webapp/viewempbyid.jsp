<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ViewByID</title>
<link rel ="stylesheet" href = "../css/home.css">
<link rel ="stylesheet" href = "../css/table.css">
<link rel ="stylesheet" href = "../css/dropdown.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.gstatic.com/css2?family=Josefin+Sans:ital,wght@0,100;0,300;0,400;,0,500;0,600;0,700;1,100;1,200;1,300;1,400;,1,500;1,600;1,700&family=Montserrat:wght@700;800;900&display=swap" rel ="stylesheet">
<style>
h2{
color: red;

}
</style>
</head>
<body>

<nav>
<br>

<ul>
  <li><a href="viewallfaculty">Back</a></li>
</ul>
</nav>

<br>
<center>
<table align=center>

<tr><th>ID:</th>&nbsp;<td>${emp.id}</td></tr>
<tr><th>FacultyID:</th>&nbsp;<td>${emp.facultyid}</td></tr>
<tr><th>Name:</th>&nbsp;<td>${emp.name}</td></tr>
<tr><th>Gender:</th>&nbsp;<td>${emp.gender}</td></tr>
<tr><th>Date of Birth:</th>&nbsp;<td>${emp.dateofbirth}</td></tr>
<tr><th>Department:</th>&nbsp;<td>${emp.department}</td></tr>
<tr><th>Salary:</th>&nbsp;<td>${emp.salary}</td></tr>
<tr><th>Location:</th>&nbsp;<td>${emp.location}</td></tr>
<tr><th>Email ID:</th>&nbsp;<td>${emp.emailid}</td></tr>
<tr><th>Contact No:</th>&nbsp;<td>${emp.contactno}</td></tr>



</table>
</center>


</body>
</html>

 
