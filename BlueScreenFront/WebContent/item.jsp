<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<link href="assets/css/layout.css" rel="stylesheet" type="text/css" smedia="all">
<title>Block Page</title>
</head>
<body id="top">
	<jsp:include page="header.jsp" flush="true" />
	<div class="wrapper row2">
		<div id="breadcrumb" class="hoc clear">
			<ul>
				<li><a href="#">Estoque</a></li>
				<li><a href="#">Itens</a></li>
			</ul>
		</div>
	</div>
	<div class="wrapper row3">
		<main class="hoc container clear"> <!-- main body --> 
		<div id="comments">
			<h2>PRODUÇÃO DE ITENS</h2>
			<form action="relatorio.jsp" method="post" onSubmit="validar()">
				<div class="one_third first">
					<div class="form-group">
						<div class="hoc">
							<label for="usr">COR:</label> <select class="form-control">
								<option value="fornecedor1">AZUL</option>
								<option value="fornecedor2">MAGENTA</option>
								<option value="fornecedor3">BRANCO</option>
							</select>
						</div>
					</div>
				</div>
				<div class="one_third">
					<label for="qtd">QUANTIDADE:<span>*</span></label> <input
						type="text" name="qtf" id="qtd" value="" size="22" required pattern="[0-9]{1,}" title="Mínimo por quantidade 1">
				</div>
				<div class="one_third">
					<label for="temp">TEMPO ESTIMADO<span>*</span></label> <input
						type="text" name="temp" id="temp" value="" size="22"
						placeholder="X horas" required pattern="[0-9]{1,}" title="Tempo estimado com mínimo de 1h">
				</div>
				<div class="one_third first">
					<label for="prec">PREÇO DE PRODUÇÃO<span>*</span></label> <input
						type="text" name="prec" id="prec" value="" size="22"
						placeholder="R$ 00,00" required pattern="[0-9]{1,}" title="Somente números, mínimo 1 Dígito" >
				</div>
				<div class="one_third">
					<label for="mate">MATÉRIA PRIMA GASTA<span>*</span></label> <input
						type="text" name="mate" id="mate" size="22"
						placeholder="0 itens do estoque" required pattern="[0-9]{1,}" title="Mínimo 1 Dígito">
				</div>
				<div class="one_half first">
					<button class="btn" type="submit" >Produzir</button>
				</div>
				<div class="one_half">
					<button class="btn" type="reset">Limpar</button>
				</div>
			</form>
		</div>
		<!-- / main body -->
		<div class="clear"></div>
		</main>
	</div>
	<jsp:include page="footer.html" flush="true" />
	
	<script type="text/javascript">

	function validar(){
		window.alert("Produção dos Itens Informações Importantes")
		var quant = document.getElementById("qtd").value;
		var tempo = document.getElementById("temp").value;
		var preco = document.getElementById("prec").value;
		var materia = document.getElementById("mate").value

		alert("Quantidade: "+quant+"\n"+"Tempo: "+tempo+"\n"+"Preço: "+preco+"\n"+"Matéria-Prima gasta: "+materia);
		alert("ITENS PRODUZIDOS COM SUCESSO!")
	}
	
	</script>
	
</body>
</html>