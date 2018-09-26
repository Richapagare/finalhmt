<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Edify Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- Custom Theme files -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet"
	media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link href="css/font-awesome.css" rel="stylesheet">
<!-- font-awesome icons -->
<!-- //Custom Theme files -->
<!-- js -->
<script src="js/jquery-2.2.3.min.js"></script>
<!-- //js -->
<!-- web-fonts -->
<link
	href="//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i"
	rel="stylesheet">
<link
	href="//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">


<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

form {
	border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

button:hover {
	opacity: 0.8;
}

.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
}

img.avatar {
	width: 40%;
	border-radius: 50%;
}

.container {
	padding: 16px;
}

span.psw {
	float: right;
	padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
	span.psw {
		display: block;
		float: none;
	}
	.cancelbtn {
		width: 100%;
	}
}
</style>

</head>
<body>
<body>
	<!-- header -->
	<div class="header">
		<nav class="navbar navbar-default">
		<div class="container">
			<div class="navbar-header navbar-left wthree">
				<h1>
					<a href="index.html">HMT<span>Stationary services</span></a>
				</h1>
			</div>
			<!-- navigation -->
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<div class="header-right wthree">
				<div class="top-nav-text">
					<p>
						Call Us: <span>+91-9584722702</span>
					</p>
					<div id="sb-search" class="sb-search">
						<form action="#" method="post">
							<input type="search" class="sb-search-input" name="Search"
								placeholder="Enter your search term..." id="search" required="">
							<input class="sb-search-submit" type="submit" value=""> <span
								class="sb-icon-search"> </span>
						</form>
						<div class="clearfix"></div>
						<!-- search-scripts -->
						<script src="js/classie.js"></script>
						<script src="js/uisearch.js"></script>
						<script>
							new UISearch(document.getElementById('sb-search'));
						</script>
						<!-- //search-scripts -->
					</div>
				</div>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse navbar-right"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-left cl-effect-14">
						<li><a href="Logout" class="active">Logout</a></li>


						<li><a href="Cart.jsp" class="active">Cart</a></li>


					

						<li><a href="contact.html">Help</a></li>
					</ul>
					<div class="clearfix"></div>
				</div>
				<!-- //navigation -->
			</div>
			<div class="clearfix"></div>
		</div>
		</nav>
	</div>

<%-- <h1>ITEMS</h1>
<%

HttpSession session=request.getSession(false);
ResultSet rs=(ResultSet) session.getAttribute("result");

while(rs.next()){
	%>
	<strong>Item Id
	<%=rs.getInt(1) %>
	<br>
	Item Name
	<%=rs.getString(2) %>
	<br>
	Price <%=rs.getInt(3) %>
	<br>
	Quantity <%=rs.getInt(4) %>
	<br>

	<img src="images/<%=rs.getString(5) %>" width="100px">
	<hr>

	<br>
	<% 
	
}

%>
 --%>
 
 
 <center><strong><h1>ITEMS</h1></strong></center>
<%

HttpSession session=request.getSession(false);
ResultSet rs=(ResultSet) session.getAttribute("result");
String email=(String)session.getAttribute("email");

while (rs.next()) {
%>

<table>
 
<tr>
<td><strong>Item Id : </td>
<td><strong> <%=rs.getString(1)%> </td> 
</tr>
<tr>
<td><strong>Item Name : </td>
<td><strong><%=rs.getString(2)%></td>
 
</tr>
<tr>
<td><strong>Price : </td>
<td><strong><%=rs.getInt(3)%></td>
 
</tr>
<tr>
<td><strong>Quantity in Stock : </td>
<td><strong><%=rs.getInt(4)%></td>
 
</tr>
<tr>
<td><img src="images/<%=rs.getString(5)%>" width="100px">
</td>
<hr>

 

</tr>
 
</table>
<strong><center><a href="Cart?id=<%=rs.getString(1)%>">ADD ITEM</a></center></strong>
<br>
<% 
 
}

%>

	<!-- //copyright -->
	<!-- js -->
	<script src="js/jquery-2.2.3.min.js"></script>
	<script src='js/jquery.validate.min.js'></script>
	<script src='js/formAnimation.js'></script>
	<script src='js/shake.js'></script>
	<!-- //js -->
	</div>
	<div class="clearfix"></div>
	</div>
	</div>
	<div class="footer-w3copy w3-agileits">
		<p>
			© 2018 Infogain. All Rights Reserved | Design by Group 6</a>
		</p>
	</div>
	<!-- //footer -->
	<!-- banner Slider starts Here -->
	<script src="js/responsiveslides.min.js"></script>
	<script>
		// You can also use "$(window).load(function() {"
		$(function() {
			// Slideshow 3
			$("#slider3").responsiveSlides({
				auto : false,
				pager : true,
				nav : false,
				speed : 500,
				namespace : "callbacks",
				before : function() {
					$('.events').append("<li>before event fired.</li>");
				},
				after : function() {
					$('.events').append("<li>after event fired.</li>");
				}
			});

		});
	</script>
	<!-- //End-slider-script -->
	<script src="js/bootstrap.js"></script>
</body>
</body>
</html>