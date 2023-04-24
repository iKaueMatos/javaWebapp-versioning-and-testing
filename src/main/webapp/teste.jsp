<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% String nomeProduto = (String) request.getAttribute("produto");
    %>
   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3> Empresa <%= (nomeProduto) %> cadastrada com sucesso! </h3>

</body>
</html>