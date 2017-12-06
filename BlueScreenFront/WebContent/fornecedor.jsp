<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<link href="assets/css/layout.css" rel="stylesheet" type="text/css" media="all">
<title>Smart Control - Fornecedor</title>
</head>
<body id="top">
	<div>
		<jsp:include page="header.jsp" flush="true" />
		<div class="wrapper row2">
			<div id="breadcrumb" class="hoc clear">
				<ul>
					<li><a href="fornecedor.jsp">Fornecedor</a></li>
					<li><a href="fornecedor.jsp">Estoque</a></li>
				</ul>
			</div>
		</div>
		<div class="wrapper row3">
			<main class="hoc container clear"> <!-- main body -->
			<div id="comments">
				<h2>SOLICITAÇÃO DE RECURSOS</h2>
				<form action="item.jsp" method="post" onSubmit="return validar()">
					<div class="one_third first">
						<div class="form-group">
							<div class="hoc">
								<label for="usr">FORNECEDOR:</label> <select
									class="form-control">
									<option value="fornecedor1">Fornecedor 1</option>
									<option value="fornecedor2">Fornecedor 2</option>
									<option value="fornecedor3">Fornecedor 3</option>
								</select>
							</div>
						</div>
					</div>
					<div class="one_third">
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
							type="number" name="qtd" id="qtd" size="22" required pattern="[0-9]{1,}">
					</div>

					<div class="one_third first">
						<label for="temp">TEMPO ESTIMADO<span>*</span></label> <input
							type="text" name="temp" id="temp" value="" size="22"
							placeholder="X HORAS" required pattern="[0-9]{1,}" title="Mínimo de 1 Hora">
					</div>
					<div class="one_third">
						<label for="prec">PREÇO DE PRODUÇÃO<span>*</span></label> <input
							type="text" name="prec" id="prec" value="" size="22"
							placeholder="R$ 00,00" required pattern="[0-9]{1,}" title="Mínimo de 1 Dígito">
					</div>
					<div class="one_half first">
						<button class="btn" type="submit">Solicitar</button>
					</div>
					<div class="one_half">
						<button class="btn" type="reset" >Limpar</button>
					</div>
				</form>
			</div>
			<!-- / main body -->
			<div class="clear"></div>
			</main>
		</div>
		<jsp:include page="footer.html" flush="true" />
	</div>
	<script type="text/javascript">

	function validar(){
		window.alert("Solicitação De Recursos Informações Importantes")
		var quant = document.getElementById("qtd").value;
		var tempo = document.getElementById("temp").value;
		var preco = document.getElementById("prec").value;

		alert("Quantidade: "+quant+"\n"+"Tempo: "+tempo+"\n"+"Preço: "+preco+"\n");
		alert("A SOLICITAÇÃO DOS RECURSOS FORAM ENVIADOS COM SUCESSO!")
	}
	
	</script>
</body>
</html>