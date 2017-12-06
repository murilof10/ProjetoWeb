<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<link href="assets/css/layout.css" rel="stylesheet" type="text/css" media="all">
<title>Smart Control - Home</title>
</head>
<body id="top" onload="servlet">
	<div>
		<jsp:include page="header.jsp"/>
		<div class="wrapper row3">
			<main class="hoc container clear"> 
			<div id="comments">
				<h2>LOGIN NO SISTEMA</h2>
				<form action="login" method="post">
					<div class="one_half first">
						<label for="name">Usuario<span>*</span></label> <input type="text"
							name="usuario" id="name" value="" size="22" required>
					</div>
					<div class="one_half">
						<label for="password">Senha<span>*</span></label> <input
							type="password" name="senha" id="password" value="" size="22"
							required>
					</div>
					<div class="one_half first">
						<button type="submit" class="btn">Logar</button>
					</div>
					<div class="one_half">
						<button type="reset" class="btn">Limpar</button>
					</div>
				</form>
			</div>
			<!-- / main body -->
			<div class="clear"></div>
			</main>
		</div>
		<jsp:include page="footer.html" flush="true" />
	</div>
</body>
</html>