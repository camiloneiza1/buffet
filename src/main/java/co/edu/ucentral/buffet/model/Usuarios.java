package co.edu.ucentral.buffet.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idUsuarios;
	private String nombres;
	private String apellidos;
	private String email;
	private String username;
	private String password;
	private Integer estatus;
	private String tipoDocumento;
	private String numeroDocumento;
	private String telefono;
	private String direccion;
	private String ciudad;

	@OneToMany (mappedBy = "usuarios")
	private List<Clientes> clientes;
	
	@ManyToMany
	@JoinTable(name="usuarioperfil",joinColumns=@JoinColumn(name="idUsuario"), inverseJoinColumns=@JoinColumn(name="idPerfil"))
	private List<Perfiles> perfiles;

	public Integer getIdUsuarios() {
		return this.idUsuarios;
	}

	public void setIdUsuarios(Integer idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getNombres() {
		return this.nombres;
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

	public void setNombre(String nombres) {
		this.nombres = nombres;
	}
	

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public List<Clientes> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Clientes> clientes) {
		this.clientes = clientes;
	}

	public List<Perfiles> getPerfiles() {
		return perfiles;
	}

	public void setPerfiles(List<Perfiles> perfiles) {
		this.perfiles = perfiles;
	}
	
	public void agregarPerfil(Perfiles perfil) {
		if(perfiles==null) {
			perfiles = new LinkedList<Perfiles>();
		}
		perfiles.add(perfil);
	}

	@Override
	public String toString() {
		return "Usuarios [idUsuarios=" + idUsuarios + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email="
				+ email + ", username=" + username + ", password=" + password + ", estatus=" + estatus
				+ ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", ciudad=" + ciudad + ", clientes=" + clientes + ", perfiles="
				+ perfiles + "]";
	}
}
