<%--
  Created by IntelliJ IDEA.
  User: Andrea
  Date: 17/04/15
  Time: 08:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Dati inseriti nella form</h1>
<ul>
  <li>Nome: <b><%out.println(request.getSession().getAttribute("nome"));%></b></li>
  <li>Prezzo: <b><%out.println(request.getSession().getAttribute("prezzo"));%></b></li>
</ul>
<h2>Altri dati relativi alla richiesta</h2>
<br />IP: <b>"<%out.println(request.getRemoteAddr());%>"</b>
<br />Host: <b>"<%out.println(request.getRemoteHost());%>"</b>
<br />User Agent: <b>"<%out.println(request.getHeader("User-Agent"));%></b>
<p><a href="<c:url value="prodotti.jsp" />">Lista Prodotti</a></p>
</body>
</html>
