<%--
  Created by IntelliJ IDEA.
  User: Andrea
  Date: 22/04/15
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista dei Prodotti</title>
</head>
<body>
<h1>Lista dei Prodotti inseriti</h1>
<ol>
  <c:forEach var="product" items="${productList}">
    <li>Nome: ${product.nome}<br>Prezzo: ${product.prezzo}€<br>Codice: ${product.codice}</li>
  </c:forEach>
</ol>
<a href="<c:url value="index.jsp" />">Inserisci un altro Prodotto</a>
</body>
</html>
