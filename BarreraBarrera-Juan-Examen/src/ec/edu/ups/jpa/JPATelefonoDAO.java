package ec.edu.ups.jpa;

import ec.edu.ups.DAO.TelefonoDAO;
import ec.edu.ups.entidades.Telefono;

public class JPATelefonoDAO extends JPAGenericDAO<Telefono, Integer> implements TelefonoDAO{

	public JPATelefonoDAO() {
		super(Telefono.class);
		// TODO Auto-generated constructor stub
	}

}
