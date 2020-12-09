package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usu_id")
	private int codigoUsu;
	
	@Column(name="usu_cedula", length=255, nullable=false, unique=true)
    private String cedula;
	
	@Column(name="usu_nombre", length=255, nullable=false)
    private String nombre;
	
	@Column(name="usu_apellido", length=255, nullable=false)
    private String apellido;
	
	@Column(name="usu_correo", length=255, nullable=false, unique=true)
    private String correo;
	
	@Column(name="usu_password", length=255, nullable=false, unique=false)
    private String password;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usu_telefonos")
    private List<Telefono> telefonosUsuario = new ArrayList<Telefono>();
    
    
	
	public Usuario() {
		super();
	}

	
	public Usuario(int codigoUsu, String cedula, String nombre, String apellido, String correo, String password) {
		super();
		this.codigoUsu = codigoUsu;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.password = password;
	}


	public int getCodigoUsu() {
		return codigoUsu;
	}



	public void setCodigoUsu(int codigoUsu) {
		this.codigoUsu = codigoUsu;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public List<Telefono> getTelefonos() {
		return telefonosUsuario;
	}



	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonosUsuario = telefonos;
	}

	public void addTelefonos(Telefono telefono) {
		this.telefonosUsuario.add(telefono);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
		result = prime * result + codigoUsu;
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((telefonosUsuario == null) ? 0 : telefonosUsuario.hashCode());
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
		Usuario other = (Usuario) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		if (codigoUsu != other.codigoUsu)
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (telefonosUsuario == null) {
			if (other.telefonosUsuario != null)
				return false;
		} else if (!telefonosUsuario.equals(other.telefonosUsuario))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Usuario [codigoUsu=" + codigoUsu + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", correo=" + correo + ", password=" + password + ", telefonos=" + telefonosUsuario + "]";
	}
	
   
}
