<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ejemplo formulario Servlet</title>
    <link rel="stylesheet" type="text/css" href="../style.css"
</head>
<body>
    <div>
    <h3>Ejemplo formulario servlet</h3>

    <form action="/myServlet2" method="get">
    <label for="fname">Nombre:</label><br>
    <input type="text" id="fname" name="name" value="Daniel"><br>
    <label for="lname">Apellido:</label><br>
    <input type="text" id="lname" name="lname" value="Ramos"><br><br>
    <input type="submit" value="Enviar">
</form>

<p>Al hacer clic en enviar lleva al servlet 2 alojado en la carpeta</p>


</body>
</html>
