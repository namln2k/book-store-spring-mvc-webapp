<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title><decorator:title default="MasterLayout"></decorator:title></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<!-- Bootstrap styles -->
<link href="<c:url value="/assets/user/css/bootstrap.css" />"
	rel="stylesheet" />
<!-- Customize styles -->
<link href="<c:url value="/assets/user/style.css" />" rel="stylesheet" />
<!-- Login styles -->
<link href="<c:url value="/assets/user/css/login.css" />"
	rel="stylesheet" />
<!-- font awesome styles -->
<link
	href="<c:url value="/assets/user/font-awesome/css/font-awesome.css" />"
	rel="stylesheet">
<!--[if IE 7]>
			<link href="css/font-awesome-ie7.min.css" rel="stylesheet">
		<![endif]-->

<!--[if lt IE 9]>
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->

<!-- Favicons -->
<link rel="shortcut icon"
	href="<c:url value="/assets/user/ico/favicon.ico"/>">
</head>
<body onload="javascript:init()">
	<h1 id="top"></h1>
	<!-- 
	Upper Header Section 
-->
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="topNav">
			<div class="container">
				<div class="alignR">
					<div class="pull-left socialNw">
						<a href="#"><span class="icon-twitter"></span></a> <a href="#"><span
							class="icon-facebook"></span></a> <a href="#"><span
							class="icon-youtube"></span></a> <a href="#"><span
							class="icon-tumblr"></span></a>
					</div>
					<a id="logOut" class="btn btn-secondary" href="<c:url value="/logout"/>"
						style="margin: 10px; padding: 5px">Log out </a> <a class="btn btn-success" id="loggedIn"
						href="#"><span class="icon-user btn"
						style="margin: 10px; padding: 5px;"></span> My Account</a> <a id="cart"
						style="margin: 10px; padding: 5px;" class="btn btn-info"
						href="<c:url value="/cart/"/>"><span
						class="icon-shopping-cart"></span> ${totalQuantity } Item(s) - <span
						class="badge badge-warning"> <fmt:formatNumber
								type="number" maxFractionDigits="0" value="${totalSum }" />đ
					</span></a>

				</div>
			</div>
		</div>
	</div>

	<!--
Lower Header Section 
-->
	<div class="container">
		<div id="gototop"></div>
		<%@include file="/WEB-INF/views/layouts/user/header.jsp"%>


		<!-- 
Body 
-->
		<decorator:body />

		<!-- 
Footer 
-->
		<%@include file="/WEB-INF/views/layouts/user/footer.jsp"%>

	</div>

	<!-- /container -->
	<div class="copyright">
		<div class="container">
			<p class="pull-right">
				<a href="#"><img
					src="<c:url value="/assets/user/img/maestro.png"/>" alt="payment"></a>
				<a href="#"><img src="<c:url value="/assets/user/img/mc.png"/>"
					alt="payment"></a> <a href="#"><img
					src="<c:url value="/assets/user/img/pp.png"/>" alt="payment"></a>
				<a href="#"><img
					src="<c:url value="/assets/user/img/visa.png"/>" alt="payment"></a>
				<a href="#"><img
					src="<c:url value="/assets/user/img/disc.png"/>" alt="payment"></a>
			</p>
			<span>Copyright &copy; 2013<br> bootstrap ecommerce
				shopping template
			</span>
		</div>
	</div>
	<a href="#" class="gotop"><i class="icon-double-angle-up"></i></a>
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="<c:url value="/assets/user/js/jquery.js"/>"></script>
	<script src="<c:url value="/assets/user/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="/assets/user/js/jquery.easing-1.3.min.js"/>"></script>
	<script
		src="<c:url value="/assets/user/js/jquery.scrollTo-1.4.3.1-min.js"/>"></script>
	<script src="<c:url value="/assets/user/js/shop.js"/>"></script>

	<script type="text/javascript">
		function init() {
			var username = '<%= session.getAttribute("username") %>';
			var isLoggedIn = '<%= session.getAttribute("loggedIn") %>';
			document.getElementById("loggedIn").style.visibility = "hidden";
			document.getElementById("cart").style.visibility = "hidden";
			document.getElementById("logOut").style.visibility = "hidden";
			if (isLoggedIn === "true") {
				document.getElementById("loggedIn").style.visibility = "visible";
				document.getElementById("cart").style.visibility = "visible";
				document.getElementById("logOut").style.visibility = "visible";
				document.getElementById("loggedIn").innerHTML = "Username - "
						+ username;
			}
			var wrongLogin = '<%= session.getAttribute("wrongLogin") %>';
			if (wrongLogin === "true") {
				alert("Wrong username or password");
			}
		}
		window.onload = init;
	</script>
</body>
</html>