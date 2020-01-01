<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>

<link href="<%=request.getContextPath()%>/css/styles.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css?family=Open+Sans:800|Quicksand&display=swap" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/form.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/common.js"></script>

<title>TechSpace</title>
</head>
<body onload="showMsg('${msg}')">
	<div class="div-body">
		<div class="div-common-head">
			<div class="div-logo">
				<%-- <img class="logo-icon" src="<%=request.getContextPath()%>/icons/techspace.png" alt="No logo available"/> --%>
				<a href="#" class="a-logo">TechSpace</a>
			</div>
			<div class="div-properties">
				<div class="div-navbar">
					<div class="div-home">
						<a href="#">HOME</a>
					</div>
					<div class="div-techs">
  						<button class="btn-techs">TECHS&nbsp;<i class="fa fa-tablet"></i></button>
  						<div class="div-techs-content">
    						<a href="#">MOBILE</a>
    						<a href="#">LAPTOP</a>
    						<a href="#">TABLET</a>
  						</div>
					</div>
					<div class="div-menu">
  						<button class="btn-menu">MENU&nbsp;<i class="fa fa-bars"></i></button>
  						<div class="div-menu-content">
    						<a href="#">BENCHMARK</a>
    						<a href="#">SPECS COMPARE</a>
    						<a href="#">TEMP LINK</a>
  						</div>
					</div>
				</div>
			</div>
		</div>