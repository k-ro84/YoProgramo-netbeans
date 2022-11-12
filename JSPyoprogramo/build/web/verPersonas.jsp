<%-- 
    Document   : verPersonas
    Created on : 22 oct 2022, 22:45:31
    Author     : c.olguin
--%>

<%@page import="logica.Persona"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
        <title>Ver Personas</title>
    </head>
    <body>

        <div class="card">
            <div class="card-header text-center">

                <h1> Lista de Personas: </h1>

            </div>
            <%
                List<Persona> listaPersonas = (List) request.getSession().getAttribute("listaPersonas");

                for (Persona per : listaPersonas) {

            %>

            <div class="card-body">
                <ul class="list-group">
                    <li class="list-group-item list-group-item-success"> 
                        <p><b> ID :</b> <%= per.getId()%></p> </li>
                    <li class="list-group-item list-group-item-danger"> 
                        <p><b> NOMBRE:</b> <%= per.getNombre()%> </p> </li>
                    <li class="list-group-item list-group-item-warning">
                        <p><b> APELLIDO :</b> <%= per.getApellido()%> </p>  </li>
                    <li class="list-group-item list-group-item-info">
                        <p><b> DNI :</b> <%= per.getDni()%></p></li>
                    <li class="list-group-item list-group-item-dark"> 
                        <p><b> TELEFONO :</b> <%= per.getTelefono()%> </p>  </li>
                </ul>
              
            </div>

            <%
                }
            %>
            <div class="card-footer bg-transparent border-success"> 
                <button class="btn btn-outline-primary" ><a href="index.jsp">volver</a></button>
            </div>
        </div>
    </body>
</html>
