package ec.edu.ups.jpa;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.DAO.UsuarioDAO;
import ec.edu.ups.entidades.Usuario;

public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, Integer> implements UsuarioDAO {

	public JPAUsuarioDAO() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public Usuario findByUsuarioPorNombre(String nombre) {
		
		
		Usuario usu = new Usuario();
		
		String consulta = "SELECT  u FROM Usuario u WHERE u.nombre LIKE :nombre";
		try {
			em.clear();
			usu = (Usuario)em.createQuery(consulta).setParameter("nombre", nombre).getSingleResult();		
			em.refresh(usu);
			System.out.println("Usuario: "+usu.getNombre());
		} catch (Exception e) {
			System.out.println(">>>WARNING (findByUsuarioPorNombre UsuarioDAO): " + e.getMessage());
		}
		
		return usu;
	}
	
	@Override
	public Usuario findByUsuarioPorCedula(String cedula) {
					
		Usuario usu = null;
		
		String consulta = "SELECT  u FROM Usuario u WHERE u.cedula LIKE :cedula";
		try {
			em.clear();
			usu = (Usuario)em.createQuery(consulta).setParameter("cedula", cedula).getSingleResult();		
			//em.refresh(usu);
			System.out.println("Usuario: "+usu.getNombre());
		} catch (Exception e) {
			System.out.println(">>>WARNING (findByUsuarioPorNombre UsuarioDAO): " + e.getMessage());
		}
		
		return usu;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Usuario> findByUsuarioPorNombreAJAX(String nombre) {
		
		
		List<Usuario> usu = null;
		
		String consulta = "SELECT  u FROM Usuario u WHERE u.nombre LIKE :nombre";
		try {
			em.clear();
			usu = (List<Usuario>)em.createQuery(consulta).setParameter("nombre", "%"+nombre+"%").getResultList();		
		} catch (Exception e) {
			System.out.println(">>>WARNING (findByUsuarioPorNombre UsuarioDAO): " + e.getMessage());
		}
		
		return usu;
	}

}
