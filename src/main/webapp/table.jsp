<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="./img/headerIcons/favicon.png" type="image/x-icon">
    <link rel="stylesheet" href="./style/table.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <title>AGO - Agricultura orgânica</title>
</head>
<body>


<a class="toBack" href="./index.html">Voltar para pagina principal</a>
<a class="toBack1" href="./index.html">Ver grafico</a>
<a class="toBack2" href="./index.html">Gerar relatório</a>

<div class="container mt-5">
    <h1>Tabela</h1>       
        <div class="row">
            <table class="table table-responsive">
                <thead class="table-dark">
                    <tr class="table-tr">
                        <th scope="col">ID</th>
                        <th scope="col">Nome</th>
                        <th scope="col">Região</th>
                        <th scope="col">Área</th>
                        <th scope="col">Preço</th>
                        <th scope="col">Peso</th>
                        <th scope="col p-2">Editar ou Deletar</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr class="table-active">
                        <th scope="row">1</th>
                        <td>Valor</td>
                        <td>Valor</td>
                        <td>Valor</td>
                        <td>Valor</td>
                        <td>Valor</td>
                        <td>
                            <a class ="link-edit" href="">Editar</a>
                            <a class= "link-delete" href="">Deletar</a>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>  

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>

    