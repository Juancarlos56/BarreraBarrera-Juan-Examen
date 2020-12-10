<%@page import="java.util.List"%>
<%@page import="ec.edu.ups.entidades.Tipo"%>
<%@page import="ec.edu.ups.entidades.Operadora"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom fonts for this template -->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
  <link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

  <!-- Custom styles for this template -->
  <link href="css/landing-page.min.css" rel="stylesheet">

  <!-- Funciones JS -->
  <script src="js/RegistrarTelefono.js" type="text/javascript"></script>
</head>
<body>
	<%
		List<Operadora> op = (List<Operadora>)request.getAttribute("operadoras");
		List<Tipo> tp = (List<Tipo>)request.getAttribute("tipoTelefono");        
	%>
	
	<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="well well-sm">
                <form class="form-horizontal" method="post" action="/BarreraBarrera-Juan-Examen/">
                    <fieldset>
                        <legend class="text-center header">Contact us</legend>

                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="cedula" name="cedula" type="text" placeholder="Ingrese su cédula" class="form-control" required>
                            </div>
                        </div>
                        
                        
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="nombres" name="nombres" type="text" placeholder="Ingrese sus nombres" class="form-control" required>
                            </div>
                        </div>
                        
                        
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="apellidos" name="apellidos" type="text" placeholder="Ingrese sus apellidos" class="form-control" required>
                            </div>
                        </div>
                        
                        
                        
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="email" name="email" type="text" placeholder="Email Address" class="form-control" required>
                            </div>
                        </div>
                        
                        
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="password" name="password" type="password" placeholder="Ingrese su Contraseña" class="form-control" required>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="phone" name="phone" type="text" placeholder="Phone" class="form-control">
                            </div>
                        </div>

						<div class="form-group">
							<label for="nombreCat" id="nombreCat">Eliga una Operadora: </label>
						 	<select name="curso" id="operadora" name="operadora"  required >
					     	<option value="" disabled selected>Elige una opción</option>
					     	<% 
						     		for(int i = 0; i<op.size(); i++){
						     			out.print("<option value=\""+op.get(i).getCodigoOperadora()+"\">"+op.get(i).getNombre()+"</option>");
						     		}
						     	
						     %>
						     </select>
						</div>
						
						
						<div class="form-group">
							<label for="nombreCat" id="nombreCat">Eliga un tipo de Teléfono: </label>
						 	<select name="curso" id="tipo" name="tipo"  required >
					     	<option value="" disabled selected>Elige una opción</option>
					     	<% 
						     		for(int i = 0; i<tp.size(); i++){
						     			out.print("<option value=\""+tp.get(i).getTipoCodigo()+"\">"+tp.get(i).getTipoNombre()+"</option>");
						     		}
						     	
						     %>
						     </select>
						</div>
						
						
                        <div class="form-group">
                            <div class="col-md-12 text-center">
                                <button type="button" class="btn btn-primary btn-lg" onclick="registrarTelefono()"> Registrar Telefono</button>
                        </div>
                        
                        <div class="separador"> </div>
			       		<div id="informacion2"><b>Verificacion de crear producto</b></div>
			       		
			       		
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>