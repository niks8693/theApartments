<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<section id="navbar"> 
	<nav
		class="navbar navbar-expand-lg navbar-dark bg-dark navbar-full"
		id="nav-main"> <a class="navbar-brand" href="${pageContext.request.contextPath}/">The Apartments</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse " id="navbarSupportedContent">
		<ul class="navbar-nav ml-auto ">
			<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/signup">Signup
			</a></li>
			<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/signin">Signin</a></li>
			<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/logout">Logout</a>
			</li>	
		</ul>
	</div>
	</nav> 
	</section>
	<section id="welcome-cover">
	<div class="container">
	<div class="jumbotron">
	<h1>Welcome to The Apartments..</h1>
	<p>View your next Dream Home</p>
	<p>${username}</p>
	</div>
	
	</div>
	
	</section>

	<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>