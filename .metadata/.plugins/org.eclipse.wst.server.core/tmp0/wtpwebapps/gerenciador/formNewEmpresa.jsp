<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/newTest" var="linkNewTest" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action = "${ linkNewTest}" method = "post">
		
		Nome: <input type="text" name="nome" value="${empresa.nome }"/>
		Senha: <input type="password" name="senha"value="${empresa.senha }/>
		Data Abertura: <input type="text" name="data"value="${empresa.dataAbertura }/>
		
		<input type= "submit"/>
		
	</form>
</body>
</html>