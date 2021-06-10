<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="well well-small">
			<h3>Featured Products</h3>
			<hr class="soften" />
			<div class="row-fluid">
				<c:if test="${products.size() > 0 }">
					<ul class="thumbnails">
						<c:forEach var="item" items="${products }" varStatus="loop">
							<li class="span4">
								<div class="thumbnail">
									<a class="zoomTool" href="product-detail/${item.id }"
										title="Add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="product-detail/${item.id }"><img
										style="height: 260px"
										src="<c:url value="/assets/user/img/product${item.id }.png"/>"
										alt="" /></a>
									<div class="caption">
										<h5>${item.name }</h5>
										<h4>
											<a class="defaultBtn" href="product-detail/${item.id }"
												title="Click to view"><span class="icon-zoom-in"></span></a>
											<a class="shopBtn"
												href="<c:url value="/add-to-cart/${item.id }"/>"
												title="Add to cart"><span class="icon-plus"></span></a> <span
												class="pull-right"><fmt:formatNumber type="number"
													maxFractionDigits="0" value="${item.price }" />đ</span>
										</h4>
									</div>
								</div>

							</li>
							<c:if
								test="${(loop.index + 1) % 3 == 0 || (loop.index + 1) == products.size() }">
					</ul>
					<c:if test="${(loop.index + 1) < products.size() }">
						<ul class="thumbnails">
					</c:if>
				</c:if>
				</c:forEach>
				</c:if>
			</div>
		</div>
</body>
</html>