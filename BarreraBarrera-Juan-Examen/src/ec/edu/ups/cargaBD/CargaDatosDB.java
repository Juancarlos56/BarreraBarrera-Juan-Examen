package ec.edu.ups.cargaBD;

import ec.edu.ups.DAO.DAOFactory;
import ec.edu.ups.DAO.OperadoraDAO;
import ec.edu.ups.DAO.TelefonoDAO;
import ec.edu.ups.DAO.TipoDAO;
import ec.edu.ups.DAO.UsuarioDAO;
import ec.edu.ups.entidades.Telefono;
import ec.edu.ups.entidades.Tipo;
import ec.edu.ups.entidades.Usuario;

public class CargaDatosDB {

	private UsuarioDAO ud = DAOFactory.getFactory().getUsuarioDAO();
	private TelefonoDAO tf = DAOFactory.getFactory().getTelefonoDAO();
	private TipoDAO tp = DAOFactory.getFactory().getTipoDAO();
	private OperadoraDAO op = DAOFactory.getFactory().getOperadoraDAO();
	
	public static void main(String[] args) {
		CargaDatosDB db = new CargaDatosDB();
		
		Usuario u = new Usuario(0, "0106113301", "Juan Carlos", "Barrera Barrera", "barrerajuan930@gmail.com", "1234");
		System.out.println("Creacion de Usuario en DB: "+u.toString());
		
		Usuario u = new Usuario(0, "0106113301", "Christian Alexander", "Barrera Barrera", "christianbarrera@gmail.com", "1234");
		System.out.println("Creacion de Usuario en DB: "+u.toString());
		
	}

	public void cargaDeUsuario(Usuario usu) {
		
	}
	
	public void cargaDeTelefono(Telefono tel) {
		
	}
	
	public void cargaDeTipo(Tipo tip) {
		
	}
	
	public void cargaDeOperadora(Usuario usu) {
		
	}

}
