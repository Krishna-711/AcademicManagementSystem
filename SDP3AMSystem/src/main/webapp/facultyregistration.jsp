<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

<html>
<head>
<link rel ="stylesheet" href = "../css/home.css">
<link rel ="stylesheet" href = "../css/dropdown.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.gstatic.com/css2?family=Josefin+Sans:ital,wght@0,100;0,300;0,400;,0,500;0,600;0,700;1,100;1,200;1,300;1,400;,1,500;1,600;1,700&family=Montserrat:wght@700;800;900&display=swap" rel ="stylesheet">
    <style media="screen">
      *,
*:before,
*:after{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}
body{
    background-color: #080710;
}
.background{
    width: 430px;
    height: 520px;
    position: absolute;
    transform: translate(-50%,-50%);
    left: 50%;
    top: 50%;
}
.background .shape{
    height: 200px;
    width: 200px;
    position: absolute;
    border-radius: 50%;
}
.shape:first-child{
    background: linear-gradient(
        #1845ad,
        #23a2f6
    );
    left: -80px;
    top: -80px;
}
.shape:last-child{
    background: linear-gradient(
        to right,
        #ff512f,
        #f09819
    );
    right: -30px;
    bottom: -80px;
}
form{
    height: 820px;
    width: 450px;
    background-color: rgba(255,255,255,);
    position: absolute;
    transform: translate(-50%,-50%);
    top: 55%;
    left: 50%;
    border-radius: 10px;
    backdrop-filter: blur(5px);
    border: 2px solid rgba(255,255,255,0.1);
    box-shadow: 0 0 40px rgba(8,7,16,0.6);
    padding: 50px 50px;
}
form *{
    font-family: 'Poppins',sans-serif;
    color: #ffffff;
    letter-spacing: 0.5px;
    outline: none;
    border: none;
}
form h3{
    font-size: 32px;
    font-weight: 500;
    line-height: 42px;
    text-align: center;
}

label{
    display: block;
    margin-top: 30px;
    font-size: 16px;
    font-weight: 500;
}
input{
    display: block;
    height: 50px;
    width: 250px;
    background-color: rgba(255,255,255,0.07);
    border-radius: 3px;
    padding: 0 10px;
    margin-top: 10px;
    font-size: 15px;
    font-weight: 300;
}
::placeholder{
    color: #e5e5e5;
}
button{
    margin-top: 30px;
    margin-left: 5px;
    width: 75%; 
    background-color: #ffffff;
    color: #080710;
    padding: 15px 0;
    font-size: 18px;
    font-weight: 600;
    border-radius: 5px;
    cursor: pointer;
}
.box
{
        width: 150px;
        height: 30px;
        border: 1px solid #999;
        font-size: 18px;
        color: white;
        background-color: grey;
        border-radius: 5px;
}


}

</style>
</head>
<body>
<div class = "login">
<nav>
	<h2><a href="/"><span>AMS</span></a></h2>
<ul>
<li><a class="active" href="adminhome">Home</a></li>
</ul>
<span class="blink">
<h3 align=center style="color: red"><c:out value="${msg}"/></h3>
</span>
</nav>
<br>



<form:form action="addemployee" method="post" modelAttribute="emp">
<h3 style="color:white;font-weight: bold">Add Faculty</h3>
<table id="reg" align=center>
<tr>
<td><label>Faculty ID</label></td>
<td>
<form:input path="facultyid" required="required"></form:input>
</td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Name</label></td>
<td>
<form:input path="name" required="required"></form:input>
</td>
</tr>

<tr><td></td></tr>

<tr>
<td><label for="gender">Gender</label></td>
<td>
<select name="gender" id="gender" class="box">
<option selected value="-1">--Select--</option>
 <option value="Male">Male</option>
 <option value="Female">Female</option>
 </select>
</td>
</tr>


<tr><td></td></tr>

<tr>
<td><label>DOB</label></td>
<td><form:input path="dateofbirth" required="required" placeholder="DD/MM/YYYY"/></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label for="department">Department</label></td>
<td>
<select name="department" id="department" class="box">
<option selected value="-1">--Select--</option>
 <option value="BT">BT</option>
 <option value="BBA">BBA</option>
 <option value="CSE">CSE</option>
 <option value="CSIT">CSIT</option>
 <option value="MECH">MECH</option>
 <option value="ECE">ECE</option>
 <option value="EEE">EEE</option>
 </select>
</td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Salary</label></td>
<td><form:input path="salary" value="0.00" required="required"/></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Location</label></td>
<td><form:input path="location" required="required"/></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Email ID</label></td>
<td><form:input path="emailid" required="required"/></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Password</label></td>
<td><form:password path="password" required="required"/></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Contact No</label></td>
<td><form:input path="contactno" required="required"/></td>
</tr>

<tr><td></td></tr>
<tr><td></td></tr>

<tr align=center>
<td colspan=2><button>Register</button></td>
</tr>
</table>

</form:form>



</div>
</body>
</html>

 
