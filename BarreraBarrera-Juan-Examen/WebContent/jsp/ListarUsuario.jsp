<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Usuarios</title>
<script src="js/listarUsuario.js" type="text/javascript"></script>
<!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom fonts for this template -->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
  <link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

  <!-- Custom styles for this template -->
  <link href="css/landing-page.min.css" rel="stylesheet">
</head>
<body>

	<section class="cuadrado">
		
            	<br>
                <br>    
                <label id="nomProducto" for="nomProducto" style="margin-right: 50px;" >Listar Usuario por: </label>
                
                	<select name="curso" id="busqueda" name="busqueda"  required >
					     	<option value="" disabled selected>Elige una opción</option>
					     	<option value="cedula" disabled selected>cedula</option>
					     	<option value="numero" disabled selected>numero</option>
					     	
					</select>
                
                
                <div class="form-group">
	                <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
	                <div class="col-md-8">
	                    <input id="opcion" name="opcion" type="text" placeholder="Ingrese informacion" class="form-control" required>
	                </div>
               	</div>
                
				<input type="button" id="listarUsuario" name="listarUsuario" value="Listar Usuarios" onclick="listarPedido();" />            
		        <div class="separador"> </div>
		        <div id="informacion"><b>Usuarios Encontrados</b></div>
				<br>
				<br>
						
				
		</section>


</body>
</html>