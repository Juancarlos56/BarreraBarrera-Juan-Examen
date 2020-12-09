package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tipo
 *
 */
@Entity
@Table(name = "Tipo")
public class Tipo implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tip_id")
	int tipoCodigo;
	
	@Column(name="tip_nombre", length=255, nullable=false, unique=false)
    private String tipoNombre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tip_telefonos")
    private List<Telefono> telefonosTipos = new ArrayList<Telefono>();
	
	
	public Tipo() {
		super();
	}

	

	public Tipo(int tipoCodigo, String tipoNombre) {
		super();
		this.tipoCodigo = tipoCodigo;
		this.tipoNombre = tipoNombre;
	}

	public int getTipoCodigo() {
		return tipoCodigo;
	}


	public void setTipoCodigo(int tipoCodigo) {
		this.tipoCodigo = tipoCodigo;
	}


	public String getTipoNombre() {
		return tipoNombre;
	}


	public void setTipoNombre(String tipoNombre) {
		this.tipoNombre = tipoNombre;
	}


	public List<Telefono> getTelefonosTipos() {
		return telefonosTipos;
	}


	public void setTelefonosTipos(List<Telefono> telefonosTipos) {
		this.telefonosTipos = telefonosTipos;
	}

	public void addTelefonosTipos(Telefono telefonoTipo) {
		this.telefonosTipos.add(telefonoTipo);
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((telefonosTipos == null) ? 0 : telefonosTipos.hashCode());
		result = prime * result + tipoCodigo;
		result = prime * result + ((tipoNombre == null) ? 0 : tipoNombre.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tipo other = (Tipo) obj;
		if (telefonosTipos == null) {
			if (other.telefonosTipos != null)
				return false;
		} else if (!telefonosTipos.equals(other.telefonosTipos))
			return false;
		if (tipoCodigo != other.tipoCodigo)
			return false;
		if (tipoNombre == null) {
			if (other.tipoNombre != null)
				return false;
		} else if (!tipoNombre.equals(other.tipoNombre))
			return false;
		return true;
	}

	
}
