<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all">
<link href="assets/css/layout.css" rel="stylesheet" type="text/css"
	media="all">
<title>Block Page</title>
</head>
<body id="top">
	<jsp:include page="header.jsp" flush="true" />
	<div class="jumbotron">
		<p class="text-danger">ACESSO NEGADO</p>
		<p class="text-danger">Logue no sistema para ter acesso aos recursos.</p>
		<p class="text-danger">Caso nao possua conta, crie em loja - cadastro</p>
	</div>
	<jsp:include page="footer.html" flush="true" />
</body>
</html>