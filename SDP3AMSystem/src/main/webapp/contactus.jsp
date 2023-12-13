<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About AMS</title>
<link rel ="stylesheet" href = "../css/home.css">
<link rel ="stylesheet" href = "../css/dropdown.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.gstatic.com/css2?family=Josefin+Sans:ital,wght@0,100;0,300;0,400;,0,500;0,600;0,700;1,100;1,200;1,300;1,400;,1,500;1,600;1,700&family=Montserrat:wght@700;800;900&display=swap" rel ="stylesheet">
<style>
@import url(https://fonts.googleapis.com/css?family=Anonymous+Pro);
@import url('https://fonts.googleapis.com/css?family=Raleway:300,400');
	*{
		margin: 0;
	}
	body{
	color:white;
	
 		 display:flex;align-items:center;
 		 height:100vh;
 		 justify-content:center;
	}
	.typewriter {
		font-family: 'Anonymous Pro', monospace;
		width: 65%; 
		line-height: 2; 
	}
	h1 {
	  overflow: hidden;
	  margin: 0 auto;
	  display: inline-block;
	  font-weight: normal;

	}
	p {
  font-size: 24px;
  text-align: justify;
  text-justify: inter-word;
}
	

	/* The typewriter cursor effect */
	@keyframes cursor {
		0% { opacity: 1; }
		  49% { opacity: 1; }
		  50% { opacity: 0; }
		  100% { opacity: 0; }
	}

</style>
</head>
<body>	
<div class = "hero">

<nav>
	<h2><a href="/"><span>AMS</span></a></h2>	
	<div class="dropdown">
    <button class="dropbtn">Login
    </button>
    <div class="dropdown-content">
      <a href="adminlogin">Admin</a>
      <a href="facultylogin">Faculty</a>
      <a href="studentlogin">Student</a>
    </div>
  </div>
</nav> 

<center>
<h1>Contact Us</h1>   

	<div class="typewriter"  >
	<br>
		<p id="text">
		You are welcome to contact us at any time through our mail:<br>
2000030672@kluniversity.in 
<br>
2000030727cse@gmail.com
<br>
2000030871@kluniversity.in
		</p>
	</div>
	</center>
	</div>
</body>
<script>
var i = 0;
//var A = 0;
		var tag = document.getElementById("text");
		var html = document.getElementById("text").innerHTML;
		var attr = tag.setAttribute("data", html);
		var txt = tag.getAttribute("data");
		var speed = 30;

		function typeWriter() {
		  if (i <= txt.length) {
		    document.getElementById("text").innerHTML = txt.slice(0 , i + 1);
		    i++;
		    setTimeout(typeWriter, speed);
		  }
		    //console.log(document.getElementById("text").innerHTML);
		}

typeWriter();


//function deltxt() {
//			if (A <= txt.length) {
		// 	    document.getElementById("text").innerHTML = txt.slice(0, -A);
		// 	    A++;
		// 	    setTimeout(deltxt, 50);
		// 	  }
		// }
		// var backward = speed * txt.length + 1000		;
		// // console.log(backward);
		// setTimeout( function () {
		// 	deltxt();
		// },backward);
		</script>
</html>