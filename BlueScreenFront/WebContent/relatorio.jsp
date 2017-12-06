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
<title>Smart Control - Relatório</title>
</head>
<body id="top">
	<div>
		<jsp:include page="header.jsp" flush="true" />
		<div class="wrapper row2">
			<div id="breadcrumb" class="hoc clear">
				<ul>
					<li><a href="#">Relatorio</a></li>
				</ul>
			</div>
		</div>
		<div class="wrapper row3">
			<main class="hoc container clear"> <!-- main body -->
			<h2>FILTRO DE BUSCA - ESTOQUE</h2>
			<form action="rel" method="post">
				<div class="one_third first">
					<div class="form-group">
						<div class="hoc">
							<label for="usr">SELECIONE O ESTOQUE</label> 
							<select class="form-control" name="fornecedor">
								<option value="PAULISTA">PAULISTA</option>
								<option value="MORUMBI">MORUMBI</option>
								<option value="BERRINI">BERRINI</option>
							</select>
						</div>
					</div>
				</div>
				<div class="one_half first">
					<input class="btn" type="submit" value="Gerar relatorio de estoque">
				</div>
			</form>

			<script type="text/javascript"
				src="https://www.gstatic.com/charts/loader.js"></script> <script
				type="text/javascript">
					google.charts.load("current", {
						packages : [ 'corechart' ]
					});
					google.charts.setOnLoadCallback(drawChart);
					function drawChart() {
						var data = google.visualization.arrayToDataTable([
								[ "Cor", "Quantidade", {role : "style"} ], 
								[ "Capacidade total", ${AttrArmE}, "blue" ],
								[ "Itens armazenados", ${AttrTotalE}, "grey" ], ]);

						var view = new google.visualization.DataView(data);
						view.setColumns([ 0, 1, {
							calc : "stringify",
							sourceColumn : 1,
							type : "string",
							role : "annotation"
						}, 2 ]);

						var options = {
							title : "QUANTIDADE DE ITEM EM ESTOQUE",
							width : 600,
							height : 400,
							bar : {
								groupWidth : "95%"
							},
							legend : {
								position : "none"
							},
						};
						var chart = new google.visualization.ColumnChart(
								document.getElementById("columnchart_values"));
						chart.draw(view, options);
					}
				</script>
			<div class="one_half first">
				<div id="columnchart_values" style="width: 900px; height: 300px;"></div>
			</div>
			<div class="clear"></div>
			</main>
		</div>
		<jsp:include page="footer.html" flush="true" />
	</div>
	<script type="text/javascript" src="assets/js/validar.js"></script>
</body>
</html>