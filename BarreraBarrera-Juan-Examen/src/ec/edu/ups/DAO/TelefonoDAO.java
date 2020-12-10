package ec.edu.ups.DAO;

import java.util.List;

import ec.edu.ups.entidades.Telefono;

public interface TelefonoDAO extends GenericDAO<Telefono, Integer>{

	public abstract List<Telefono> findByTelefonoNumeroAJAX(String numero);
	public abstract List<Telefono> findByUsuarioPorCedulaAJAX(String cedula);
}
