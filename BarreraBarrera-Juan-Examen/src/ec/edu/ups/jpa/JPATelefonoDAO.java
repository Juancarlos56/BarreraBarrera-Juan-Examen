package ec.edu.ups.jpa;

import java.util.List;

import ec.edu.ups.DAO.TelefonoDAO;
import ec.edu.ups.entidades.Telefono;
import ec.edu.ups.entidades.Usuario;

public class JPATelefonoDAO extends JPAGenericDAO<Telefono, Integer> implements TelefonoDAO{

	public JPATelefonoDAO() {
		super(Telefono.class);
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	public List<Telefono> findByUsuarioPorNombreAJAX(String nombre) {
		
		
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
