<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ingresar al Sistema</title>
    <style>
        body {
            background-color: #D3E4C4; /* Color de fondo */
            font-family: Arial, sans-serif;
        }
        .login-container {
            width: 300px;
            margin: 100px auto;
            padding: 20px;
            border: 2px solid #000;
            background-color: #f0f0f0;
            text-align: center;
        }
        .login-container h1 {
            margin-bottom: 20px;
        }
        .login-container input[type="text"],
        .login-container input[type="password"] {
            width: 80%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .login-container input[type="submit"] {
            padding: 10px 20px;
            border: none;
            background-color: #ccc;
            cursor: pointer;
            border-radius: 4px;
        }
        .login-container input[type="submit"]:hover {
            background-color: #bbb;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h1>Ingresar al Sistema</h1>
        <form action="tu_ruta_de_autenticacion" method="post">
            <label for="usuario">usuario</label><br>
            <input type="text" id="usuario" name="usuario"><br>
            <label for="password">password</label><br>
            <input type="password" id="password" name="password"><br>
            <input type="submit" value="Registrar">
        </form>
    </div>
</body>
</html>

