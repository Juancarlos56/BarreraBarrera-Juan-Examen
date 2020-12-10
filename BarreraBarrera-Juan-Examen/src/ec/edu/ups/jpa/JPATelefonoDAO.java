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
	public List<Telefono> findByTelefonoNumeroAJAX(String numero) {
		
		
		List<Telefono> usu = null;
		
		String consulta = "SELECT  t FROM Telefono t WHERE t.telnumero LIKE :numero";
		try {
			em.clear();
			usu = (List<Telefono>)em.createQuery(consulta).setParameter("numero", "%"+numero+"%").getResultList();		
		} catch (Exception e) {
			System.out.println(">>>WARNING (findByTelefonoNumeroAJAX): " + e.getMessage());
		}
		
		return usu;
	}


}
