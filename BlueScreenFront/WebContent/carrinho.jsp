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
<title>Smart Control - Carrinho</title>
</head>
<body id="top">
	<div>
		<jsp:include page="header.jsp" flush="true" />
		<div class="wrapper row3">
			<main class="hoc container clear"> <!-- main body -->
			<div class="content">
				<form action="index.jsp" method="post">
					<div class="one_third first">
						<div class="form-group">
							<div class="center">
								<label class="checkbox-inline" for="usr">${AttrProd1}</label>
							</div>
							<div class="hoverzoom">
								<img src="assets/img/azul.jpg" alt="">
								<div class="retina">
									<a href="produto1.jsp"> Ver detalhes</a>
								</div>
							</div>
							<label for="usr">Quantidade comprada:</label> 
							<label for="usr">${AttrQtd1}</label> 
							<label for="usr">Valor unitario:</label>
							<label for="usr">R$: ${AttrPreco1}</label>
						</div>
					</div>
					<div class="one_third">
						<div class="form-group">
							<div class="center">
								<label class="checkbox-inline" for="usr">${AttrProd2}</label>
							</div>
							<div class="hoverzoom">
								<img src="assets/img/branca.jpg" alt="">
								<div class="retina">
									<a href="produto2.jsp"> Ver detalhes</a>
								</div>
							</div>
							<label for="usr">Quantidade comprada:</label> 
							<label for="usr">${AttrQtd2}</label> 
							<label for="usr">Valor unitario:</label>
							<label for="usr">R$: ${AttrPreco2}</label>
						</div>
					</div>
					<div class="one_third">
						<div class="form-group">
							<div class="center">
								<label class="checkbox-inline" for="usr">${AttrProd3}</label>
							</div>
							<div class="hoverzoom">
								<img src="assets/img/magenta.jpg" alt="">
								<div class="retina">
									<a href="produto3.jsp"> Ver detalhes</a>
								</div>
							</div>
							<label for="usr">Quantidade comprada:</label> 
							<label for="usr">${AttrQtd3}</label> 
							<label for="usr">Valor unitario:</label>
							<label for="usr">R$: ${AttrPreco3}</label>
						</div>
					</div>
					<div class="one_third_first">
						<label for="usr">Valor total:</label> <label for="usr">R$: ${AttrTotal}</label>
					</div>
					<div class="one_half first">
						<div class="center">
							<button type="submit" class="btn">Comprar</button>
						</div>
					</div>

					<div class="one_half">
						<div class="center">
							<button type="submit" class="btn">Cancelar</button>
						</div>
					</div>
				</form>
				<!-- / main body -->
				<div class="clear"></div>
			</main>
		</div>
		<jsp:include page="footer.html" flush="true" />
	</div>
	<script type="text/javascript" src="assets/js/validar.js"></script>
</body>
</html>