<%--
  Created by IntelliJ IDEA.
  User: 46988172t
  Date: 12/04/16
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cesar Server</title>
</head>
<body>
    <h1>Tu, tots, tothom</h1>
    <p>Introdueix la frase de la qual vols fer el Cesar</p>
    <form action="Cesar" method="post">
        <input name="value" type="text"/>
        <input type="submit" value="Enviar"/>
    </form>
</body>
</html>
