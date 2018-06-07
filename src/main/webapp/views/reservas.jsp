<%-- 
    Document   : index
    Created on : 6/06/2018, 05:38:40 PM
    Author     : SANTIAGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>App Reservas</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/signin.css" rel="stylesheet">
    </head>

    <body>

        <header>
            <!-- Fixed navbar -->
            <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item ">
                            <a class="nav-link" href="${pageContext.servletContext.contextPath}/index.jsp">Guardar Habitacion</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="${pageContext.servletContext.contextPath}/views/reservas.jsp">Reservar Habitacion</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>

        <!-- Begin page content -->
        
        
        <main role="main" class="container">
            <div>
                <center>
                <h1>
                    Reservas de Habitaciones
                </h1>
                    </center>
            </div>
            <form class="form-signin" method="post" action="">
                <div class="form-group">
                    <input name="txtidres" type="text" id="inputState" class="form-control"
                                       class="form-control"  required
                                       placeholder="id reserva">
                </div>
                 <div class="form-group">
                    <input name="txtidhab" type="text" id="inputState" class="form-control"
                                       class="form-control"  required
                                       placeholder="id habitacion">
                </div>
                <div class="form-group">
                    <input name="txtnumcam" type="text" id="inputState" class="form-control"
                                       class="form-control"  required
                                       placeholder="# camas">
                </div>
                <div class="form-group">
                    <input name="txtprecioxcam" type="text" id="inputState" class="form-control" disabled
                                       class="form-control">
                </div>
                <div class="form-group">
                    <center>
                <button name="accion" value="reserva"type="submit" class="btn btn-primary">Guardar</button>
                </center>
                </div>
            </form>
        </main>
        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
        <script src="../../assets/js/vendor/popper.min.js"></script>
        <script src="../../dist/js/bootstrap.min.js"></script>
    </body>
</html>


