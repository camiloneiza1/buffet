package co.edu.ucentral.buffet.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CategoriasComida")
public class CategoriasComida {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idCategoriasComida;
	private String nombre;
    private String descripcion;

    @OneToMany (mappedBy = "categoriasComida")
    private List<Comidas> comidas;

    @OneToMany (mappedBy = "categoriasComida")
    private List<detPlatos> dPlatos;
    

    public Integer getIdCategoriasComida() {
        return this.idCategoriasComida;
    }

    public void setIdCategoriasComida(Integer idCategoriasComida) {
        this.idCategoriasComida = idCategoriasComida;
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


    public List<Comidas> getComidas() {
        return this.comidas;
    }

    public void setComidas(List<Comidas> comidas) {
        this.comidas = comidas;
    }

    public List<detPlatos> getDPlatos() {
        return this.dPlatos;
    }

    public void setDPlatos(List<detPlatos> dPlatos) {
        this.dPlatos = dPlatos;
    }

    @Override
    public String toString() {
        return "{" +
            " idCategoriasComida='" + getIdCategoriasComida() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", comidas='" + getComidas() + "'" +
            ", dPlatos='" + getDPlatos() + "'" +
            "}";
    }

}