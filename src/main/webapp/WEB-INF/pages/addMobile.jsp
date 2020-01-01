<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../layouts/header.jsp"></jsp:include>
<form action="<%=request.getContextPath()%>/mobiles/mobile"
	method="post" class="form-horizontal" role="form">
	<h2>Add Mobile</h2>
	<div class="form-group">
		<label for="mobileId" class="col-sm-3 control-label">ID:</label>
		<div class="col-sm-9">
			<input type="text" name="id" id="id" placeholder="MB ID"
				class="form-control" autofocus>
		</div>
	</div>
	<div class="form-group">
		<label for="name" class="col-sm-3 control-label">Name:</label>
		<div class="col-sm-9">
			<input type="text" name="name" id=name class="form-control" autofocus>
		</div>
	</div>
	<div class="form-group">
		<label for="mobileCompany" class="col-sm-3 control-label">Company:</label>
		<div class="col-sm-9">
			<select class="form-control" name="companyId" id="companyId"
				onChange="getBrandsByCompany()" autofocus>
				<option value="CO0">--Select--</option>
				<c:forEach items="${companies}" var="company">
					<option value="${company.id}">${company.name}</option>
				</c:forEach>
			</select>
		</div>
	</div>
	<div class="form-group">
		<label for="mobileBrand" class="col-sm-3 control-label">Brand:
		</label>
		<div class="col-sm-9">
			<select class="form-control" name="brandId" id="brandId" autofocus>
			</select>
		</div>
	</div>
	<div class="form-group">
		<label for="mobilePrice" class="col-sm-3 control-label">Price:</label>
		<div class="col-sm-9">
			<input type="text" name="price" id="price" class="form-control">
		</div>
	</div>

	<button type="submit" class="btn btn-success">Save</button>
	<button type="reset" class="btn btn-primary">Reset</button>
	<button type="button" class="btn btn-danger"
		onClick="cancelFormSubmission('<%=request.getContextPath()%>/mobiles')">Cancel</button>
</form>
<jsp:include page="../layouts/footer.jsp"></jsp:include>