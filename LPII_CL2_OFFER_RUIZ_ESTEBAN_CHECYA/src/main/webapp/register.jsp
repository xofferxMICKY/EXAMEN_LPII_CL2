<!DOCTYPE html>
<%@page import="modelo.Modelo_producto"%>
<%@ page import="java.util.List" %>
<% List<Modelo_producto> productos = (List<Modelo_producto>) request.getAttribute("productos"); %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registrar Producto</title>
    <style>
        body {
            background-color: #D3E4C4; /* Color de fondo */
            font-family: Arial, sans-serif;
        }
        .container {
            width: 400px;
            margin: 20px auto;
            padding: 20px;
            border: 2px solid #000;
            background-color: #f0f0f0;
            text-align: center;
        }
        .form-group {
            margin: 10px 0;
            text-align: left;
        }
        .form-group label {
            display: inline-block;
            width: 100px;
            text-align: right;
        }
        .form-group input {
            width: 200px;
            padding: 5px;
        }
        .form-group button {
            padding: 10px 20px;
            margin-top: 10px;
            border: none;
            background-color: #ccc;
            cursor: pointer;
        }
        .form-group button:hover {
            background-color: #bbb;
        }
        .table-container {
            margin-top: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 8px;
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Registrar Producto</h1>
        <form action="Controlador_producto" method="post">
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" id="nombre" name="nombre">
            </div>
            <div class="form-group">
                <label for="precio">Precio:</label>
                <input type="text" id="precio" name="precio">
            </div>
            <div class="form-group">
                <label for="precioven">PrecioVen:</label>
                <input type="text" id="precioven" name="precioven">
            </div>
            <div class="form-group">
                <label for="estado">Estado:</label>
                <input type="text" id="estado" name="estado">
            </div>
            <div class="form-group">
                <label for="descr">Descrip:</label>
                <input type="text" id="descr" name="descr">
            </div>
            <div class="form-group">
                <button type="submit">Registrar</button>
            </div>
        </form>
    </div>
    
    <div class="table-container">
        <h2>Dato Registrado en la BD</h2>
        <h3>Listado de Productos</h3>
        <table>
            <tr>
                <th>Codigo</th>
                <th>Nom</th>
                <th>pv</th>
                <th>pc</th>
                <th>Est.</th>
                <th>Des</th>
            </tr>
            <% for(Modelo_producto producto : productos) { %>
            <tr>
                <td><%= producto.getIdProductoCL2() %></td>
		        <td><%= producto.getNombreCL2() %></td>
		        <td><%= producto.getPrecioVentaCL2() %></td>
		        <td><%= producto.getPrecioCompCL2() %></td>
		        <td><%= producto.getEstadoCL2() %></td>
		        <td><%= producto.getDescripCL2() %></td>
            </tr>
            <% } %>
        </table>
    </div>
</body>
</html>
