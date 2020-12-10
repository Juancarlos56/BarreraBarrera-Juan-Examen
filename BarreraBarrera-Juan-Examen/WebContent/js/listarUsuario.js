/**
 * 
 */

function registrarTelefono() {
	
	var busqueda = document.getElementById("busqueda").value;
	var opcion = document.getElementById("opcion").value;
	
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
            document.getElementById("informacion").innerHTML = this.responseText;
        }
    };
	
	if(busqueda == "cedula"){
		xmlhttp.open("GET", "/BarreraBarrera-Juan-Examen/listarUsuarioCedula?opcion="+opcion, true);
   		xmlhttp.send();	
	}
	
	if(busqueda == "numero"){
		xmlhttp.open("GET", "/BarreraBarrera-Juan-Examen/listarUsuarioNumero?opcion="+opcion, true);
   		xmlhttp.send();	
	}   	

    
    return false;
}