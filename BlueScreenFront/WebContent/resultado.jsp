<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<link href="assets/css/layout.css" rel="stylesheet" type="text/css" media="all">
<title>Smart Control - Home</title>
</head>
<body id="top">

	
	<div>
		<jsp:include page="header.jsp" flush="true" />
		<div class="wrapper row3">
			<main class="hoc container clear"> <!-- main body -->
			<div id="comments">
				<form action="venda.jsp" method="post">
				<% 
			String nomeUser = request.getParameter("name");
			String senhaUser = request.getParameter("password");
			
			if(nomeUser.equals("Cliente") && senhaUser.equals("123")){%>
			<h1 style="color:orange;font-size: 25px;">LOGADO NO SISTEMA</h1><br>
				<h2 style="color:orange;font-family: new courier">BEM VINDO!</h2>
				<h4 style="font-family: sans-seriff;font-style: italic;"><%=nomeUser%></h4>
				
				<div id="comments">
					<div class="one_half first">
					<input type="submit" class="btn" value="Ir Para a Página de Vendas">
					</div>
				
			<%}else{%>
				
				<h2>Nome de usuário ou senha inválidos</h2>

				<h3><a href="index.jsp">Voltar para área de login</a></h3>
			<%}%>
				
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