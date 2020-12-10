package ec.edu.ups.DAO;

import java.util.List;

import ec.edu.ups.entidades.Operadora;

public interface OperadoraDAO extends GenericDAO<Operadora, Integer>{

	public abstract List<Operadora> findOperadoras();
}
