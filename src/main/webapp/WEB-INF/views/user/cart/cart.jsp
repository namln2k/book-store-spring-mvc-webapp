<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>
	<!-- 
Body Section 
-->
	<div class="row">
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="<c:url value="/home-page"/>">Home</a> <span class="divider">/</span></li>
				<li class="active">Check Out</li>
			</ul>
			<div class="well well-small">
				<h1>Check Out</h1>
				<hr class="soften" />

				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>Product Image</th>
							<th>Description</th>
							<th>Unit Price</th>
							<th>Quantity</th>
							<th>Edit</th>
							<th>Delete</th>
							<th>Total</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${cart }">
							<tr>
								<td><img width="100"
									src="<c:url value="/assets/user/img/product${item.value.product.id }.png"/>"
									alt=""></td>
								<td>${item.value.product.title }</td>
								<td><fmt:formatNumber type="number" groupingUsed="true"
										value="${item.value.product.price }" /> ₫</td>
								<td><input type="number"
									onChange="editCartItem(${item.key })" min="0" max="1000"
									class="span1" style="max-width: 34px" placeholder="1"
									id="quantity-cart-item-${item.key }" size="16" type="text"
									value="${item.value.quantity }"></td>
								<td><a id="edit-${item.key }"
									href="<c:url value="/edit-cart-item/${item.key }/${item.value.quantity }"/>"
									class="btn btn-mini btn-danger" type="button"> <span
										class="icon-edit"></span>
								</a></td>
								<td><a
									href="<c:url value="/delete-cart-item/${item.key }"/>"
									class="btn btn-mini btn-danger" type="button"> <span
										class="icon-remove"></span>
								</a></td>
								<td><fmt:formatNumber type="number" groupingUsed="true"
										value="${item.value.totalSum }" /> ₫</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<br /> <a href="<c:url value="/home-page"/>" class="shopBtn btn-large"><span
					class="icon-arrow-left"></span> Continue Shopping </a> <a
					href="login.html" class="shopBtn btn-large pull-right">Next <span
					class="icon-arrow-right"></span></a>

			</div>
		</div>
	</div>
	<script>
	function editCartItem(id) {
		var quantity = document.getElementById("quantity-cart-item-" + id).value;
		var href;
		if (quantity > 0) {
			href = '<c:url value="/edit-cart-item/' + id + '/' + quantity + '"/>';
		}
		else {
			href = '<c:url value="/delete-cart-item/' + id + '"/>';
		}
		document.getElementById("edit-" + id).href = href;
	}
</script>
</body>
</html>