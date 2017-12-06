<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<link href="assets/css/layout.css" rel="stylesheet" type="text/css" media="all">
<title>Smart Control - Cadastro</title>
</head>
<body id="top">
	<div>
		<jsp:include page="header.jsp" flush="true" />
		<div class="wrapper row2">
			<div id="breadcrumb" class="hoc clear">
				<ul>
					<li><a href="#">Loja</a></li>
					<li><a href="#">Cadastro</a></li>
				</ul>
			</div>
		</div>
		<div class="wrapper row3">
			<main class="hoc container clear"> <!-- main body -->
			<div class="content first">
				<div id="comments">
					<h2>CADASTRO DE CLIENTE</h2>
					<form action="cad" method="post" data-toggle="validator">
				
						<div class="one_third first">
						<p><span class="glyphicon glyphicon-list-alt" style="font-size:18px;color:green;"></span></p>
							<label for="name">Name<span>*</span></label> <input type="text"
							    name="name" id="name" placeholder="Put Your Name Here" required 
								pattern="[A-Za-z0-9]{5,}" title="Nome inválido ou menor que 5 caracteres">
						</div>
						<div class="one_third">
						<p><span class="glyphicon glyphicon-envelope" style="font-size:18px;color:green;"></span></p>
							<label for="email">E-mail<span>*</span></label> 
							<input type="email" name="email" id="email"  size="22" required placeholder="E-mail Here"
							pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" title="Siga o exemplo cliente@cli.com">
						</div>
						<div class="one_third">
						<p><span class="glyphicon glyphicon-star" style="font-size:18px;color:green;"></span></p>
							<label for="rg">RG<span>*</span></label> <input type="text"
								name="rg" id="rg" placeholder="xx.xxx.xxx-x" required pattern="[0-9]{9,9}" title="Coloque o rg sem os pontos e o traço 9 números">
						</div>
						<div class="one_third first">
						<p><span class="glyphicon glyphicon-pencil " style="font-size:18px;color:green;"></span></p>
							<label for="cpf">CPF<span>*</span></label> <input type="text"
								name="cpf" id="cpf" placeholder="yyy.yyy.yyy-yy" required pattern="[0-9]{11,11}" title="Coloque somente os números do rg sem os pontos e o traço, 11 números">
						</div>
						<div class="one_third">
						<p><span class="glyphicon glyphicon-user" style="font-size: 18px;color:green;"></span></p>
							<label for="sexo">Sexo<span>*</span></label> 
							<input type="text" name="sexo" id="sexo" placeholder="Gender" required pattern="[F-Mf-m]{1}" title="F ou M">
						</div>
						<div class="one_third">
						<p><span class="	glyphicon glyphicon-log-in" style="font-size: 18px;color:green;"></span></p>
							<label for="login">Login<span>*</span></label> <input type="text"
								name="login" id="login" required placeholder="User" required pattern="[A-Za-z0-9]{5,30}" title="Mínimo 5 letras max 30"> 
						</div>
						<div class="one_third first">
						<p><span class="glyphicon glyphicon-lock" style="font-size: 18px;color:green;"></span></p>
							<label for="senha">Senha<span>*</span></label> <input
								type="password" name="senha" id="senha" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
								title="Precisa preencher mais de 8 caracteres e conter pelo menos 1 número, 1 letra maiúscula 1 letra minúscula."
								required placeholder="Password">
						</div>
						<div class="one_half first">
						<p><span class="glyphicon glyphicon-thumbs-up" style="font-size: 18px;color:green;"></span></p>
							<button type="submit" class="btn btn-sucess" onclick="enviarDados()">Cadastrar</button>
						</div>
						<div class="one_half">
						<p><span class="	glyphicon glyphicon-refresh" style="font-size: 18px;color:green;"></span></p>
							<button type="submit" class="btn btn-sucess">Limpar</button>
						</div>
					</form>
				</div>
			</div>
			<!-- / main body -->
			<div class="clear"></div>
			</main>
		</div>
		<jsp:include page="footer.html" flush="true" />
	</div>
	
	
</body>
</html>