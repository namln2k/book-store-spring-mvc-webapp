<%@page import="book_shop.entity.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<header id="header">
	<div class="row">
		<div class="span4">
			<h1>
				<a class="logo" href="<c:url value="/"></c:url>"><span>Twitter
						Bootstrap ecommerce template</span> <img
					src="<c:url value="/assets/user/img/book-shop-logo.png"/>"
					alt="book shop logo"> </a>
			</h1>
		</div>
	</div>
</header>
<!--
Navigation Bar Section 
-->
<body>
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container">
				<a data-target=".nav-collapse" data-toggle="collapse"
					class="btn btn-navbar"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a>
				<div class="nav-collapse">
					<ul class="nav">
						<li class="active"><a href="<c:url value="/"></c:url>">Home
						</a></li><li class="active"><a href="<c:url value="/products"></c:url>">All products
						</a></li>
					</ul>
					<form action="#" class="navbar-search pull-left">
						<input type="text" placeholder="Search" class="search-query span2">
					</form>

					<button class="btn btn-secondary" style="margin-left: 10px">Search</button>

					<a id="notLoggedIn" href="<c:url value="/login"/>"
						class="btn btn-primary pull-right" style="margin-right: 10px">
						<span class="icon-lock"></span> Log in
					</a>
					<ul class="nav pull-right">
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>