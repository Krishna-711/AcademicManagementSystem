<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View</title>
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
<div class = "hero2">

<nav>
<br>

<ul>
  <li><a href="adminhome">Home</a></li>
</ul>
</nav>

<center>
<table align=center border=2>

<tr>

<th>ID</th>
<th>FacultyID</th>
<th>Name</th>
<th>Gender</th>
<th>Date of Birth</th>
<th>Department</th>
<th>Salary</th>
<th>Location</th>
<th>Email ID</th>
<th>Contact No</th>
<th>Action</th>

</tr>

<c:forEach items="${emplist}" var="emp">

<tr>

<td> <c:out value="${emp.id}"></c:out>   </td>
<td> <c:out value="${emp.facultyid}"></c:out>   </td>
<td> <c:out value="${emp.name}"></c:out>   </td>
<td> <c:out value="${emp.gender}"></c:out>   </td>
<td> <c:out value="${emp.dateofbirth}"></c:out>   </td>
<td> <c:out value="${emp.department}"></c:out>   </td>
<td> <c:out value="${emp.salary}"></c:out>   </td>
<td> <c:out value="${emp.location}"></c:out>   </td>
<td> <c:out value="${emp.emailid}"></c:out>   </td>
<td> <c:out value="${emp.contactno}"></c:out>   </td>
<td> 
<a href='<c:url value='deleteemp?id=${emp.id}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a href='<c:url value='viewempbyid?id=${emp.id}'></c:url>'>View</a>&nbsp;&nbsp
</td>


</tr>

</c:forEach>

</table>
</center>
</div>
</body>
</html>