<%--
  Created by IntelliJ IDEA.
  User: Andrea
  Date: 15/04/15
  Time: 09:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <meta charset="ISO-8859-1" />
  <title>Pagina di Conferma</title>
</head>
<body>
<h1>Dati inseriti nella form</h1>
<ul>
  <li>Nome: <b>${nome}</b></li>
  <li>Prezzo: <b>${prezzo}</b></li>
  </ul>
<ol>
  <c:forEach var="cookie" items="${cookies}">
    <li>${cookie}</li>
  </c:forEach>
</ol>
<form action="<c:url value="store"/>" method="post">
  <input type="submit" name="confirm" value="conferma"  />
</form>
<a href="<c:url value="index.jsp"/>">
Annulla
</a>
</body>
</html>
