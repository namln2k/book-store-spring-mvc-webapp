<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product detail</title>
<style>
.product-content {
	overflow-x: hidden;
}
</style>
</head>
<body>
	<!-- 
Body Section 
-->
	<div class="row product-content">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
					<c:forEach var="item" items="${categories }">
						<li><a href="<c:url value="/products/${item.id }"/>"><span
								class="icon-chevron-right"></span> ${item.name }</a></li>
					</c:forEach>

					<li><a class="totalInCart" href="cart.html"><strong>Total
								Amount <span class="badge badge-warning pull-right"
								style="line-height: 18px;"><fmt:formatNumber
										type="number" maxFractionDigits="0" value="${totalSum }" />đ</span>
						</strong></a></li>
				</ul>
			</div>

			<div class="well well-small">
				<a href="#"><img
					src="<c:url value="/assets/user/img/paypal.jpg"/>"
					alt="payment method paypal"></a>
			</div>

		</div>
		<div class="span9">
			<ul class="breadcrumb">
				<li><a href="<c:url value="/home-page"/>">Products</a> <span
					class="divider">/</span></li>
				<li class="active">Product detail</li>
			</ul>
			<div class="well well-small">
				<div class="row-fluid">
					<div class="span5 col-6">
						<img style="margin: 15px; max-height: 320px; max-width: 210px"
							alt=""
							src="<c:url value="/assets/user/img/product${productDetail.id }.png"/>">
						<div id="myCarousel" class="carousel slide cntr">
							<div class="carousel-inner">
								<div class="item active">
									<a href="#"> <img src="assets/img/a.jpg" alt=""
										style="width: 100%"></a>
								</div>
								<div class="item">
									<a href="#"> <img src="assets/img/b.jpg" alt=""
										style="width: 100%"></a>
								</div>
								<div class="item">
									<a href="#"> <img src="assets/img/e.jpg" alt=""
										style="width: 100%"></a>
								</div>
							</div>
							<a class="left carousel-control" href="#myCarousel"
								data-slide="prev">‹</a> <a class="right carousel-control"
								href="#myCarousel" data-slide="next">›</a>
						</div>
					</div>
					<div class="span7">
						<h3>${productDetail.name }</h3>
						<hr class="soft" />

						<form class="form-horizontal qtyFrm" method="get"
							action="<c:url value="/add-to-cart/${productDetail.id }"/>">
							<div class="control-group">
								<label class="control-label"><span>${productDetail.price }đ</span></label>
								<div class="controls">
									<input type="number" min=0 value="0" class="span6"
										placeholder="Qty.">
								</div>
							</div>
							<p>${productDetail.title }
							<p>
								<button type="submit" class="shopBtn">
									<span class=" icon-shopping-cart"></span> Add to cart
								</button>
						</form>
					</div>
				</div>
				<hr class="softn clr" />


				<ul id="productDetail" class="nav nav-tabs">
					<li class="active"><a href="#home" data-toggle="tab">Product
							Details</a></li>
				</ul>
				<div id="myTabContent" class="tab-content tabWrapper">
					<div class="tab-pane fade active in" id="home">
						<h4>Product Information</h4>
						<table class="table table-striped">
							<tbody>
								<tr class="techSpecRow">
									<td class="techSpecTD1">Author:</td>
									<td class="techSpecTD2">${productDetail.author }</td>
								</tr>
								<tr class="techSpecRow">
									<td class="techSpecTD1">Sale:</td>
									<td class="techSpecTD2">${productDetail.sale }%</td>
								</tr>
								<tr class="techSpecRow">
									<td class="techSpecTD1">Last update:</td>
									<td class="techSpecTD2">${productDetail.updated_at }</td>
								</tr>
							</tbody>
						</table>
						<p>${productDetail.detail }</p>
					</div>
				</div>

			</div>
		</div>
	</div>
</body>
</html>