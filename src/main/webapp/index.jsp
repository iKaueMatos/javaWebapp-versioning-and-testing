<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style/style.css">
<title>Projeto - APS</title>
</head>
<body>

<header class="cabecalho">
	<h1 class="logo">Logo</h1>
		<ul class="lista">
		
			<li><a href="">Tema</a></li>
			<li><a href="">Text</a></li>
			<li><a href="consultarProduto.jsp">Consultar Tabela</a></li>
		
		</ul>
	</header>
	
	
	
	<div class="form">
		<form action="" method="post" class="bananaForm">
			<div>
				<label><strong>Text:</strong></label><input type="text"
					name="descricao">
			</div>
			<div>
				<label><strong>Text:</strong></label><input type="text"
					name="quantidade">
			</div>
			<div>
			
			<label>
				<strong>Text:</strong>
				</label>
				<input type="text" name="preco">
			</div>
			
			<div>
				<input id="CadastrarButton" type="submit" name="salvar" value="Enviar">
			</div>
		</form>
	</div>

</body>
</html>