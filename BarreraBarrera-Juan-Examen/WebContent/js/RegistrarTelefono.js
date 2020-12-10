/**
 * 
 */


 function registrarTelefono() {
	
	var cedula = document.getElementById("cedula").value;
	var nombres = document.getElementById("nombres").value;
	var apellidos = document.getElementById("apellidos").value;
	var email = document.getElementById("email").value;
	var password = document.getElementById("password").value;
	var phone = document.getElementById("phone").value;
	var operadora = document.getElementById("operadora").value;
	var tipo = document.getElementById("tipo").value;
	
	if (window.XMLHttpRequest) {
        // code for IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp = new XMLHttpRequest();
    } else {
        // code for IE6, IE5
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    
	xmlhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            //alert("llegue");
            document.getElementById("informacion2").innerHTML = this.responseText;
        }
    };
    
	xmlhttp.open("GET", "/BarreraBarrera-Juan-Examen/RegistrarTelefono?cedula="+cedula+"&nombres="+nombres
	+"&apellidos="+apellidos+"&email="+email+"&password="+password+"&phone="+phone+"&operadora="+operadora+"&tipo="+tipo, true);
	xmlhttp.send();
		
}
