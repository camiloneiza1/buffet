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
	private String username;
	private String password;
	private Integer estatus;
	private String email;

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


	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEstatus() {
		return this.estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
			", username='" + getUsername() + "'" +
			", password='" + getPassword() + "'" +
			", estatus='" + getEstatus() + "'" +
			", email='" + getEmail() + "'" +
			", clientes='" + getClientes() + "'" +
			"}";
	}
}
