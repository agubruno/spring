<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="login.css" />
</head>
<body>
	<center>
	<h1> Crear Usuarios</h1>
	<form action="AltaUsusario">
	<label class="userN">Nombre: </label><input type="text" name="NombreUser"><br>
	<p></p>
	<label class="userD">Numero documento: </label><input type="text" name="NroDocumentoUser"><br>
	<p></p>
	<label class="userM">mail: </label><input type="text" name="mailUser"><br>
	<p></p>
	<button type = "submit" formaction="Creado">Crear</button>
	</form>
	
	</center>
</body>
</html>