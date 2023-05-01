<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="./dist/output.css">
<link rel="stylesheet" href="style.css">
<link rel="shortcut icon" href="./img/headerIcons/favicon.png"
	type="image/x-icon">
<link rel="stylesheet" href="./style/table.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<title>AGO - Agricultura orgânica</title>
</head>
<body>


	<a class="toBack" href="./index.jsp">Voltar para pagina principal</a>
	<a class="toBack1" href="./index.jsp">Ver grafico</a>
	<a class="toBack2" href="./index.jsp">Gerar relatório</a>

	<div class="container mt-5">
	 <form action="BuscarTrabalhador" method="post" accept-charset="UTF-8" >
		<input type="text" placeholder="Digite seu nome" name="nome" id="nome"  class="h-10 w-3000 rounded-md border border-slate-300 text-sm pl-2 bg-transparent outline-green-600 shadow-md">
        <button type="submit" name="button" id="btn" class="bg-green-500 w-20 h-10 cursor-pointer text-white rounded-md hover:bg-green-600 hover:outline outline-2 outline-green-600 outline-offset-2 text-sm">Buscar</button>
     </form>  
		<h1>Trabalhadores</h1>
		<div class="row">
			<table class="table table-responsive outline-green-600 shadow-md">
				<thead class="table-dark">
					<tr class="table-tr">
						<th scope="col">Nome</th>
						<th scope="col">Sobrenome</th>
						<th scope="col">Idade</th>
						<th scope="col">Telefone</th>
						<th scope="col">CEP</th>
						<th scope="col">Localidade</th>
						<th scope="col">UF</th>
						<th scope="col">Bairro</th>
						<th scope="col">Logradouro</th>
						<th scope="col p-2">Editar ou Delete</th>
					</tr>
				</thead>
				<tbody>
					<tr class="table-active">
						<td>Dados</td>
						<td>Dados</td>
						<td>dados</td>
						<td>Dados</td>
						<td>Dados</td>
						<td>dados</td>
						<td>Dados</td>
						<td>Dados</td>
						<td>Dados</td>
						<td><a class="link-edit" href="">Editar</a>
						<a class="link-edit" href="">Deletar</a>	
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
</body>
</html>

