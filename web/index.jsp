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
    <link rel="stylesheet" type="text/css" href="index.css">
  </head>
  <body>
    <p class="errorMessage">${errorMessageEmpty}</p>
    <p class="errorMessage">${errorMessageWrongCharacter}</p>
    <form action="controllaDati" method="get" >
      Nome: <input class="${nameIsEmpty}" type="text" name="nome" onclick="this.style.borderColor = 'initial'"  value="${namePlaceholder}" />
      Prezzo: <input class="${priceIsEmpty}" type="text" name="prezzo" id="${wrongCharacterInPrice}" onclick="this.style.textDecoration = 'none';this.style.color = 'black';this.style.borderColor = 'initial'" value="${pricePlaceholder}"/>
      Codice: <input class="${codeIsEmpty}" type="text" name="codice" onclick="this.style.borderColor = 'initial'" value="${codePlaceholder}"/>
      <input type="submit" name="sumbit" value="invia"  />
    </form>
  </body>
</html>
