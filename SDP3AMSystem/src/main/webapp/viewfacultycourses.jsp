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
  
  <li><a href="facultyhome">Back</a></li>
</ul>
</nav>

<center>
<table align=center border=2>

<tr>

<th>ID</th>
<th>Name</th>
<th>Code</th>
<th>LTPS</th>
<th>Credits</th>
<th>Year</th>
<th>Sem</th>
<th>Faculty_id</th>

</tr>

<c:forEach items="${courselist}" var="course">

<tr>

<td> <c:out value="${course.id}"></c:out>   </td>
<td> <c:out value="${course.name}"></c:out>   </td>
<td> <c:out value="${course.code}"></c:out>   </td>
<td> <c:out value="${course.ltps}"></c:out>   </td>
<td> <c:out value="${course.credits}"></c:out>   </td>
<td> <c:out value="${course.year}"></c:out>   </td>
<td> <c:out value="${course.sem}"></c:out>   </td>
<td> <c:out value="${course.faculty_id}"></c:out>  </td>


</tr>

</c:forEach>

</table>
</center>
</div>
</body>
</html>