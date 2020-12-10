package ec.edu.ups.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Telefono
 *
 */
@Entity
@Table(name = "Telefono")
public class Telefono implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tef_id")
	int codigoTelefono;
	
	
	@Column(name="tel_numero", length=10, nullable=false, unique=true)
    private String telnumero;
	
	
	@ManyToOne
    @JoinColumn
    private Usuario usu_telefonos;
    
	@ManyToOne
    @JoinColumn
    private Tipo tip_telefonos;
	
	@ManyToOne
    @JoinColumn
    private Operadora ope_telefonos;
	
	public Telefono() {
		super();
	}
	
	

	public Telefono(int codigoTelefono, String telnumero, Usuario usu_telefonos, Tipo tip_telefonos,
			Operadora ope_telefonos) {
		super();
		this.codigoTelefono = codigoTelefono;
		this.telnumero = telnumero;
		this.usu_telefonos = usu_telefonos;
		this.tip_telefonos = tip_telefonos;
		this.ope_telefonos = ope_telefonos;
	}



	public int getCodigoTelefono() {
		return codigoTelefono;
	}

	public void setCodigoTelefono(int codigoTelefono) {
		this.codigoTelefono = codigoTelefono;
	}

	public String getTelnumero() {
		return telnumero;
	}

	public void setTelnumero(String telnumero) {
		this.telnumero = telnumero;
	}

	public Usuario getUsu_telefonos() {
		return usu_telefonos;
	}

	public void setUsu_telefonos(Usuario usu_telefonos) {
		this.usu_telefonos = usu_telefonos;
	}

	public Tipo getTip_telefonos() {
		return tip_telefonos;
	}

	public void setTip_telefonos(Tipo tip_telefonos) {
		this.tip_telefonos = tip_telefonos;
	}

	public Operadora getOpe_telefonos() {
		return ope_telefonos;
	}

	public void setOpe_telefonos(Operadora ope_telefonos) {
		this.ope_telefonos = ope_telefonos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoTelefono;
		result = prime * result + ((ope_telefonos == null) ? 0 : ope_telefonos.hashCode());
		result = prime * result + ((telnumero == null) ? 0 : telnumero.hashCode());
		result = prime * result + ((tip_telefonos == null) ? 0 : tip_telefonos.hashCode());
		result = prime * result + ((usu_telefonos == null) ? 0 : usu_telefonos.hashCode());
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
		Telefono other = (Telefono) obj;
		if (codigoTelefono != other.codigoTelefono)
			return false;
		if (ope_telefonos == null) {
			if (other.ope_telefonos != null)
				return false;
		} else if (!ope_telefonos.equals(other.ope_telefonos))
			return false;
		if (telnumero == null) {
			if (other.telnumero != null)
				return false;
		} else if (!telnumero.equals(other.telnumero))
			return false;
		if (tip_telefonos == null) {
			if (other.tip_telefonos != null)
				return false;
		} else if (!tip_telefonos.equals(other.tip_telefonos))
			return false;
		if (usu_telefonos == null) {
			if (other.usu_telefonos != null)
				return false;
		} else if (!usu_telefonos.equals(other.usu_telefonos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Telefono [codigoTelefono=" + codigoTelefono + ", telnumero=" + telnumero + ", usu_telefonos="
				+ usu_telefonos + ", tip_telefonos=" + tip_telefonos + ", ope_telefonos=" + ope_telefonos + "]";
	}
   
	
}
