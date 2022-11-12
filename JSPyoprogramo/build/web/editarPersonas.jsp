<%-- 
    Document   : editarPersonas
    Created on : 24 oct 2022, 00:04:43
    Author     : c.olguin
--%>


<%@page import="java.util.List"%>
<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
        <title>Editar Personas</title>
    </head>
    <body>
        <div class="card border-danger mb-3">
            <div class="card-header ">
                <h1> editar personas :</h1>
            </div>
            
            <h1>Datos de la persona</h1>
            
            <form action="SvEditar" method="POST">
                <p><label> ID :</label> <input type="text"  name="id" ></p>
                <p><label>NOMBRE :</label><input type="text"  name="nombre" ></p>
                <p><label>APELLIDO :</label><input type="text"  name="apellido" ></p>
                <p><label>DNI :</label><input type="text"  name="dni"></p>
                <p><label>TELEFONO :</label><input type="text"  name="telefono"></p>
                <button type="submit">enviar</button>
            </form>
 
        <div class="card-footer bg-transparent border-success">
            <button class="btn btn-outline-primary" ><a href="index.jsp">volver</a></button>
        </div> 
       </div>      
            
    </body>
</html>
