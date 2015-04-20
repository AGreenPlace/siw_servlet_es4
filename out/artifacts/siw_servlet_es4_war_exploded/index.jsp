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
    <p style="color: red"><%Object error = request.getAttribute("errorMessage"); if(error == null){out.print("");} else {out.println(error);}%></p>
    <form action="controllaDati" method="get" >
      Nome: <input type="text" name="nome" value="<%Object temp = request.getAttribute("namePlaceholder");if (temp == null){out.println("");} else{out.println(temp);}%>" />
      Prezzo: <input id="p1" type="text" name="prezzo" id="priceField" onclick="this.style.textDecoration = 'none';this.style.color = 'black'" <%if (request.getAttribute("errorMessage") != null){out.print("style=\"color: red; text-decoration: line-through\"");}%> value="<%temp = request.getAttribute("pricePlaceholder");if (temp == null){out.println("");} else{out.println(temp);}%>"/>
      Codice: <input type="text" name="codice" value="<%temp = request.getAttribute("codePlaceholder");if (temp == null){out.println("");} else{out.println(temp);}%>"/>
      <input type="submit" name="sumbit" value="invia"  />
    </form>
  </body>
</html>
