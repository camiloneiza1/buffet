package co.edu.ucentral.buffet.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	public Integer getIdPlatos() {
		return idPlatos;
	}
	public void setIdPlatos(Integer idPlatos) {
		this.idPlatos = idPlatos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public Double getFoto() {
		return foto;
	}
	public void setFoto(Double foto) {
		this.foto = foto;
	}
	@Override
	public String toString() {
		return "Platos [idPlatos=" + idPlatos + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio="
				+ precio + ", foto=" + foto + "]";
	}

}
