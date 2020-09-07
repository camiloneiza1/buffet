package co.edu.ucentral.buffet.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Comidas")
public class Comidas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idComidas;
	private String nombre;
	private String descripcion;
	private Double precio;
    private String foto;

    @OneToMany (mappedBy = "comidas")
    private List<DetMenus> dMenus;

    @OneToMany (mappedBy = "comidas")
    private List<DetPedidosHasComidas> dPedidosHasComidas;

    public Integer getIdComidas() {
        return this.idComidas;
    }

    public void setIdComidas(Integer idComidas) {
        this.idComidas = idComidas;
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

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }


    public List<DetMenus> getDMenus() {
        return this.dMenus;
    }

    public void setDMenus(List<DetMenus> dMenus) {
        this.dMenus = dMenus;
    }

    public List<DetPedidosHasComidas> getDPedidosHasComidas() {
        return this.dPedidosHasComidas;
    }

    public void setDPedidosHasComidas(List<DetPedidosHasComidas> dPedidosHasComidas) {
        this.dPedidosHasComidas = dPedidosHasComidas;
    }

    @Override
    public String toString() {
        return "{" +
            " idComidas='" + getIdComidas() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", foto='" + getFoto() + "'" +
            ", dMenus='" + getDMenus() + "'" +
            ", dPedidosHasComidas='" + getDPedidosHasComidas() + "'" +
            "}";
    }

}