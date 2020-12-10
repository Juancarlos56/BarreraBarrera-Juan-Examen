package ec.edu.ups.jpa;

import ec.edu.ups.DAO.DAOFactory;
import ec.edu.ups.DAO.OperadoraDAO;
import ec.edu.ups.DAO.TelefonoDAO;
import ec.edu.ups.DAO.TipoDAO;
import ec.edu.ups.DAO.UsuarioDAO;

public class JPADAOFactory extends DAOFactory{

	@Override
	public UsuarioDAO getUsuarioDAO() {
		return new JPAUsuarioDAO();
	}

	@Override
	public TelefonoDAO getTelefonoDAO() {
		return new JPATelefonoDAO();
	}

	@Override
	public TipoDAO getTipoDAO() {
		return new JPATipoDAO();
	}

	@Override
	public OperadoraDAO getOperadoraDAO() {
		return new JPAOperadoraDAO();
	}

	
	
}
