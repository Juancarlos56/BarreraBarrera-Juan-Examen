package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Operadora
 *
 */
@Entity
@Table(name = "Operadora")
public class Operadora implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ope_id")
	int codigoOperadora;
	
	@Column(name="ope_nombre", length=255, nullable=false, unique=true)
    private String nombre;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ope_telefonos")
    private List<Telefono> telefonosOperadora = new ArrayList<Telefono>();
	
	public Operadora() {
		super();
	}

	public Operadora(int codigoOperadora, String nombre) {
		super();
		this.codigoOperadora = codigoOperadora;
		this.nombre = nombre;
	}

	public int getCodigoOperadora() {
		return codigoOperadora;
	}

	public void setCodigoOperadora(int codigoOperadora) {
		this.codigoOperadora = codigoOperadora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Telefono> getTelefonosOperadora() {
		return telefonosOperadora;
	}

	public void setTelefonosOperadora(List<Telefono> telefonosOperadora) {
		this.telefonosOperadora = telefonosOperadora;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
