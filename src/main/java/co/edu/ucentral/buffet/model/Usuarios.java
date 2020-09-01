package co.edu.ucentral.buffet.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idUsuarios;
	private String nombre;
	private String usuario;
	private String clave;
	private Integer rol;

	@OneToMany (mappedBy = "usuarios")
	private List<Clientes> clientes;

	public Integer getIdUsuarios() {
		return this.idUsuarios;
	}

	public void setIdUsuarios(Integer idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Integer getRol() {
		return this.rol;
	}

	public void setRol(Integer rol) {
		this.rol = rol;
	}


	public List<Clientes> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Clientes> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "{" +
			" idUsuarios='" + getIdUsuarios() + "'" +
			", nombre='" + getNombre() + "'" +
			", usuario='" + getUsuario() + "'" +
			", clave='" + getClave() + "'" +
			", rol='" + getRol() + "'" +
			", clientes='" + getClientes() + "'" +
			"}";
	}

}
