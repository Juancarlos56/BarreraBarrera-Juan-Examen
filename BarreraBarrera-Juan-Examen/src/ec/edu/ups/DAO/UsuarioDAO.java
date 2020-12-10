package ec.edu.ups.DAO;

import java.util.List;

import ec.edu.ups.entidades.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer>{

	public abstract Usuario findByUsuarioPorNombre(String nombre);

	public abstract Usuario findByUsuarioPorCedula(String cedula);

	public abstract List<Usuario> findByUsuarioPorNombreAJAX(String cedula);

	
}
