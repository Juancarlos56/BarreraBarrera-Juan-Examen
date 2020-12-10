package ec.edu.ups.jpa;

import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.DAO.OperadoraDAO;
import ec.edu.ups.entidades.Operadora;

public class JPAOperadoraDAO extends JPAGenericDAO<Operadora, Integer> implements OperadoraDAO{

	public JPAOperadoraDAO() {
		super(Operadora.class);
		// TODO Auto-generated constructor stub
	}
	
	public List<Operadora> findOperadoras() {
		
		
		List<Operadora> cats = new ArrayList<Operadora>();
		
		String consulta = "SELECT  o FROM operadora ";
		try {
			em.clear();
			cats = (List<Operadora>)em.createQuery(consulta).getResultList();		
			em.refresh(cats);
			System.out.println("Operadoras: "+cats.size());
		} catch (Exception e) {
			System.out.println(">>>WARNING (Operadoas): " + e.getMessage());
		}
		
		
		return cats;
	}
	

}
