<%-- 
    Document   : index
    Created on : Feb 18, 2019, 10:31:46 AM
    Author     : ssubik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Clients</h1>
        <c:forEach var = "client" items = "${clients}">
            <h2>${client.name}</h2>
        </c:foreach>
    </body>
</html>
