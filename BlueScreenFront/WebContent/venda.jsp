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
<title>Smart Control - Venda</title>
</head>
<body id="top">
	<div>
		<jsp:include page="header.jsp" flush="true" />
		<div class="wrapper row2">
			<div id="breadcrumb" class="hoc clear">
				<ul>
					<li><a href="#">Loja</a></li>
					<li><a href="#">Venda</a></li>
				</ul>
			</div>
		</div>

		<div class="wrapper row3">
			<main class="hoc container clear"> <!-- main body -->
			<div class="content">
				<form action="carrinho" method="post">
					<div class="one_third first">
						<div class="form-group">
							<div class="center">
								<input type="checkbox" class="form-control" id="capa-azul">
								<label class="checkbox-inline" for="usr">${AttrProd1}</label>
							</div>
							<div class="hoverzoom">
								<img src="assets/img/azul.jpg" alt="">
								<div class="retina">
									<a href="produto1.jsp"> Ver detalhes</a>
								</div>
							</div>
							<label for="usr">FORNECEDOR:</label> <select class="form-control">
								<option value="fornecedor1">${AttrForn1}</option>
								<option value="fornecedor2">${AttrForn2}</option>
								<option value="fornecedor3">${AttrForn3}</option>
							</select> <label for="text">QUANTIDADE</label> <input type="number" name="qtd1"
								class="form-control" id="qtd1" size="22" required>
						</div>
					</div>
					<div class="one_third">
						<div class="form-group">
							<div class="center">
								<input type="checkbox" class="form-control" id="capa-branca">
								<label class="checkbox-inline" for="usr">${AttrProd2}</label>
							</div>
							<div class="hoverzoom">
								<img src="assets/img/branca.jpg" alt="">
								<div class="retina">
									<a href="produto2.jsp"> Ver detalhes</a>
								</div>
							</div>
							<label for="usr">FORNECEDOR:</label> <select class="form-control">
								<option value="fornecedor1">${AttrForn1}</option>
								<option value="fornecedor2">${AttrForn2}</option>
								<option value="fornecedor3">${AttrForn3}</option>
							</select> <label for="text">QUANTIDADE</label> <input type="number" name="qtd2"
								class="form-control" id="qtd2" size="22" required>
						</div>
					</div>
					<div class="one_third">
						<div class="form-group">
							<div class="center">
								<input type="checkbox" class="form-control" id="capa-magenta">
								<label class="checkbox-inline" for="usr">${AttrProd3}</label>
							</div>
							<div class="hoverzoom">
								<img src="assets/img/magenta.jpg" alt="">
								<div class="retina">
									<a href="produto3.jsp"> Ver detalhes</a>
								</div>
							</div>
							<label for="usr">FORNECEDOR:</label> <select class="form-control">
								<option value="fornecedor1">${AttrForn1}</option>
								<option value="fornecedor2">${AttrForn2}</option>
								<option value="fornecedor3">${AttrForn3}</option>
							</select> <label for="text">QUANTIDADE</label> <input type="number" name="qtd3"
								class="form-control" id="qtd3" size="22" required>
						</div>
					</div>



					<div class="one_half first">
						<div class="center">
							<button type="submit" class="btn">Adicionar ao Carrinho</button>
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
		<script type="text/javascript" src="assets/js/validar.js"></script>
	</div>

</body>
</html>