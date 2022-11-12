<%-- 
    Document   : index
    Created on : 20 oct 2022, 21:14:16
    Author     : c.olguin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

        <title>formulario de prueba de jsp</title>
    </head>
    <body >
        <div class="card">
            <div class="card-header text-center">
                <h1>Datos de la persona</h1>
            </div>
            <form action="SvPersona" method="POST">

                <p><label>NOMBRE :</label><input type="text"  name="nombre"></p>
                <p><label>APELLIDO :</label><input type="text"  name="apellido"></p>
                <p><label>DNI :</label><input type="text"  name="dni"></p>
                <p><label>TELEFONO :</label><input type="text"  name="telefono"></p>
                <div class="d-grid gap-2 col-6 mx-auto">
                    <button type="submit" class="btn btn-outline-secondary">enviar</button>
                </div>

            </form>
        </div>

        <div class="card">
            <div class="card-header text-center">
                <h1>ver lista personas</h1>
            </div>
            <p>si desea ver a todas las personas haga click en el boton mostrar personas</p>
            <form action="SvPersona" method="GET">
                <div class="d-grid gap-2 col-6 mx-auto">
                    <button type="submit" class="btn btn-outline-success">mostrar personas</button>
                </div>
            </form>
        </div>

        <div class="card">
            <div class="card-header text-center">
                <h1>eliminar persona</h1>
            </div>
            <p>ingrese el id de la persona a eliminar</p>
            <form action="SvEliminar" method="POST">
                <p><label> Id : </label><input type="type" name="id_eliminar"></p>
                <div class="d-grid gap-2 col-6 mx-auto">
                    <button type="submit" class="btn btn-outline-danger">eliminar</button>
                </div>
            </form>
        </div>

        <div class="card">
            <div class="card-header text-center">
                <h1>editar persona</h1>
            </div>
            <p>click para ir a editar personas</p>
            <form action="SvEditar" method="POST">
                <p><label> Id : </label><input type="type" name="id_editar"></p>
                <div class="d-grid gap-2 col-6 mx-auto">
                    <button type="submit" class="btn btn-outline-warning">editar</button>
                </div>
            </form>
        </div>
    </body>
</html>
