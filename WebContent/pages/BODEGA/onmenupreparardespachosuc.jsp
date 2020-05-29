<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../library.jsp" %>
<script type="text/javascript" src="<%=request.getContextPath()%>/pages/BODEGA/onmenupreparardespachosuc.js?<%= version %>"></script>
</head>
<body>
	<div class="main_body">
		<%@ include file="../header.jsp" %>
		<%@ include file="../menu.jsp" %>
		<div class="wrapper">
			<div class="container">
				<h1>Preparar despacho a sucursales</h1>
				<div class="marco">
					<div class="marco_interior">
						<div id="envios"></div>
					</div>
				</div>
			</div>
		</div>
		<div id="oTsListasParaDespacho">
			<form id="oTsListasParaDespachoForm">
				<fieldset>
					<div id="oTsListas"></div>
				</fieldset>
			</form>
		</div>
	</div>	
</body>
</html>