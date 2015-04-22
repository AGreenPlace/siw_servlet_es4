<%--
  Created by IntelliJ IDEA.
  User: Andrea
  Date: 15/04/15
  Time: 09:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Prima pagina</title>
  </head>
  <body>
    <p style="color: red">${errorMessageEmpty}</p>
    <p style="color: red">${errorMessageWrongCharacter}</p>
    <form action="controllaDati" method="get" >
      Nome: <input type="text" name="nome" onclick="this.style.borderColor = 'initial'" <%if (request.getParameter("nome") != null && request.getParameter("nome").isEmpty()){out.println("style=\"border-color: red\"");}%> value="${namePlaceholder}" />
      Prezzo: <input id="p1" type="text" name="prezzo" id="priceField" onclick="this.style.textDecoration = 'none';this.style.color = 'black';this.style.borderColor = 'initial'" <%if (request.getParameter("prezzo") != null && request.getParameter("prezzo").isEmpty()){out.println("style=\"border-color: red\"");}%> <%if (request.getAttribute("errorMessageWrongCharacter") != null){out.print("style=\"color: red; text-decoration: line-through\"");}%> value="${pricePlaceholder}"/>
      Codice: <input type="text" name="codice" onclick="this.style.borderColor = 'initial'" <%if (request.getParameter("codice") != null && request.getParameter("codice").isEmpty()){out.println("style=\"border-color: red\"");}%> value="${codePlaceholder}"/>
      <input type="submit" name="sumbit" value="invia"  />
    </form>
  </body>
</html>
