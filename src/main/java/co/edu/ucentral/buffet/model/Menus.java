package co.edu.ucentral.buffet.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Menus")
public class Menus {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idMenus;
	private Date fecha;
	private String nombre;
	private String descripcion;
    private String imagen;
    private Double precio;
    
    @OneToMany (mappedBy = "menus")
    private List<DetMenus> dMenus;
    
    @OneToMany (mappedBy = "menu")
    private List<DetPedidos> dPedidos;

	public Integer getIdMenus() {
		return idMenus;
	}
	public void setIdMenus(Integer idMenus) {
		this.idMenus = idMenus;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public List<DetMenus> getDMenus() {
		return this.dMenus;
	}

	public void setDMenus(List<DetMenus> dMenus) {
		this.dMenus = dMenus;
	}
	
	
	public List<DetMenus> getdMenus() {
		return dMenus;
	}
	public void setdMenus(List<DetMenus> dMenus) {
		this.dMenus = dMenus;
	}
	public List<DetPedidos> getdPedidos() {
		return dPedidos;
	}
	public void setdPedidos(List<DetPedidos> dPedidos) {
		this.dPedidos = dPedidos;
	}
	@Override
	public String toString() {
		return "Menus [idMenus=" + idMenus + ", fecha=" + fecha + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", imagen=" + imagen + ", precio=" + precio + ", dMenus=" + dMenus + ", dPedidos=" + dPedidos + "]";
	}
	

}


