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
<div class = "hero2">

<nav>

<br>
<h2><a href="/"><span>AMS</span></a></h2>
<ul>
   <div class="dropdown">
    <button>Account
    </button>
    <div class="dropdown-content">
      <a href="#">Profile</a>
      <a href="#">Update</a>
      <a href="#">ChangePassword</a>
    </div>
  </div>
  <li>
  <div class="dropdown">
    <button class="dropbtn">Courses
    </button>
    <div class="dropdown-content">
      <a href="#">Course-Registration</a>
      <a href="studentcourses">viewcourses</a>
    </div>
  </div>
  </li>
  
</ul>
<a href ="studentlogin"><button class="dropbtn">Logout
    </button></a>

<br>

</nav>

<h2 class="alignleft" >Welcome&nbsp;<c:out value="${suname}"></c:out></h2>

</div>

</body>
</html>

 
