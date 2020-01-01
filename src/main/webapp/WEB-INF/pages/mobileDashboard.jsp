<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../layouts/header.jsp"></jsp:include>
<div class="div-slider">
	<div class="div-slider-img"></div>
</div>
<div class="div-dashboard">
	<div class="div-filter">
		<div class="div-filter-brands">
			<h4>Brands</h4>
			<c:forEach items="${brands}" var="brand">
				<input type="checkbox" name="brandId" value="${brand.id}">&nbsp;${brand.name}<br>
			</c:forEach>
		</div>
		<hr>
		<div class="div-filter-specs">
		</div>
	</div>
	<div class="div-main-content">
		<div class="div-search-sort">
			<div class="div-search">
        		<form class="search-form" method="post">
           			<input type="text" class="search-bar" name="search" placeholder="Type here to search something" />
					<button type="submit" class="search-btn" name="btn_search"><i class="fa fa-search"></i></button>     
				</form>
			</div>
			<div class="div-sort">
				<button type="button" class="btn-sort">Sort By</button>
  				<div class="div-sort-content">
    					<a href="#">Relevance</a>
    					<a href="#">Brand</a>
    					<a href="#">Company</a>
    					<a href="#">Price Low to High</a>
    					<a href="#">Price High to Low</a>
  				</div>
			</div>
	    </div>
		<div class="div-display">
			<c:set var="count" value="0" scope="page" />
			<c:forEach items="${mobiles}" var="mobile">
				<c:set var="count" value="${count + 1}" scope="page"/>
				<div class="div-sub-display"> 
					<c:if test = "${count == 1}">
 						<div class="div-sub-display">
 						<c:set var="sub" value="1" scope="page" /> 
					</c:if>
					<a href="<%=request.getContextPath()%>/mobiles/mobile?mobileId=${mobile.info.id}">
						<div class="div-content">
							<img class="img-mobile" src="<%=request.getContextPath()%>/mobile_img/${mobile.images[0].imgUrl}" alt="no image found"/>
							<label class="lbl-mobile-name">${mobile.info.name}</label>
						</div>
					</a>
					<c:if test = "${count > 3}">
						</div>
						<c:set var="count" value="0" scope="page"/>
						<c:set var="sub" value="0" scope="page" /> 
    				</c:if>
				</div>
			</c:forEach>
			<c:if test = "${sub==1}">
				</div>
    		</c:if>
		</div>
	</div>
	<div class="div-unknown">
		<img class="img-ad" src="<%=request.getContextPath()%>/other_img/googleAd.jpg" alt="no image found" />
	</div>
</div>
<jsp:include page="../layouts/footer.jsp"></jsp:include>