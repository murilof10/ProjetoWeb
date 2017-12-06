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
<title>Produto - Capa Magenta</title>
</head>
<body id="top">
	<div>
		<jsp:include page="header.jsp" flush="true" />
		<div class="wrapper row2">
			<div class="col-md-5"></div>
			<div class="mx-auto">
				<h1>Capa celular Magenta</h1>
			</div>
			<div id="comments">
				<form action="#" method="post">
					<div class="swing">
						<img class="produto" src="assets/img/magenta.jpg" alt="">
					</div>
					<div>
						<h3>Descrição:</h3>
						<p>Capa de na cor magenta, case protetora
							ant-quedas. 
							Ao utilizar esta capa de celular caso seu celular
							caia os riscos de que sofra algum dano diminuem consideravelmente</p>
					</div>
					<div class="one_half first">
						<input class="btn" type="button" value="Comprar">
					</div>
					<div class="one_half">
						<input class="btn" type="button" value="Cancelar compra">
					</div>
				</form>
			</div>
		</div>
		<jsp:include page="footer.html" flush="true" />
	</div>
	<script type="text/javascript" src="assets/js/validar.js"></script>
</body>
</html>