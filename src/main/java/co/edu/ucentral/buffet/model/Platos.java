package co.edu.ucentral.buffet.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="platos")
public class Platos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPlatos;
	private String nombre;
	private String descripcion;
	private String precio;
	private Double foto;

	@OneToMany (mappedBy = "platos")
	private List<DetPedidos> dPedidos;

	@OneToMany (mappedBy = "platos")
	private List<DetPlatos> dPlatos;
	

	public Integer getIdPlatos() {
		return this.idPlatos;
	}

	public void setIdPlatos(Integer idPlatos) {
		this.idPlatos = idPlatos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public Double getFoto() {
		return this.foto;
	}

	public void setFoto(Double foto) {
		this.foto = foto;
	}

	public List<DetPedidos> getDPedidos() {
		return this.dPedidos;
	}

	public void setDPedidos(List<DetPedidos> dPedidos) {
		this.dPedidos = dPedidos;
	}

	public List<DetPlatos> getDPlatos() {
		return this.dPlatos;
	}

	public void setDPlatos(List<DetPlatos> dPlatos) {
		this.dPlatos = dPlatos;
	}

	@Override
	public String toString() {
		return "{" +
			" idPlatos='" + getIdPlatos() + "'" +
			", nombre='" + getNombre() + "'" +
			", descripcion='" + getDescripcion() + "'" +
			", precio='" + getPrecio() + "'" +
			", foto='" + getFoto() + "'" +
			", dPedidos='" + getDPedidos() + "'" +
			", dPlatos='" + getDPlatos() + "'" +
			"}";
	}
	
}
