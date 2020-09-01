package co.edu.ucentral.buffet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	public Integer getIdUsuarios() {
		return idUsuarios;
	}
	public void setIdUsuarios(Integer idUsuarios) {
		this.idUsuarios = idUsuarios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Integer getRol() {
		return rol;
	}
	public void setRol(Integer rol) {
		this.rol = rol;
	}
	@Override
	public String toString() {
		return "Usuarios [idUsuarios=" + idUsuarios + ", nombre=" + nombre + ", usuario=" + usuario + ", clave=" + clave
				+ ", rol=" + rol + "]";
	}
}
