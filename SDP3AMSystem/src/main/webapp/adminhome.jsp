<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<link rel ="stylesheet" href = "../css/home.css">
<link rel ="stylesheet" href = "../css/dropdown.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.gstatic.com/css2?family=Josefin+Sans:ital,wght@0,100;0,300;0,400;,0,500;0,600;0,700;1,100;1,200;1,300;1,400;,1,500;1,600;1,700&family=Montserrat:wght@700;800;900&display=swap" rel ="stylesheet">
</head>
<body>
<div class = "hero">

<nav>

<br>

<ul>
  <li><a class="active" href="adminhome">Home</a></li>
  <li><a href="facultyregistration">FacultyRegistration</a></li>
  <li><a href="studentregistration">StudentRegistration</a></li>
  <li><a href="addcourse">AddCourse</a></li>
  <li><a href="viewallfaculty">View All Employees</a></li>
  <li><a href="Viewallstudents">View All Students</a></li>
    
  <a href ="adminlogin"><button>Logout
    </button></a>
</ul>

<br>
</nav>

<h2 class="alignleft" >Welcome&nbsp;<c:out value="${auname}"></c:out></h2>

</div>

</body>
</html>

 
