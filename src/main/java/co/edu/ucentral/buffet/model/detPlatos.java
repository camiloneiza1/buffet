package co.edu.ucentral.buffet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detPlatos")
public class detPlatos {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer iddetPlatos;
    private Double cantidad;  
    
    @ManyToOne
    @JoinColumn (name = "idCategoriasComidas")
    private CategoriasComida categoriasComida;

    @ManyToOne
    @JoinColumn (name = "idPlatos")
    private Platos platos;


    public Integer getIddetPlatos() {
        return this.iddetPlatos;
    }

    public void setIddetPlatos(Integer iddetPlatos) {
        this.iddetPlatos = iddetPlatos;
    }

    public Double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }


    public CategoriasComida getCategoriasComida() {
        return this.categoriasComida;
    }

    public void setCategoriasComida(CategoriasComida categoriasComida) {
        this.categoriasComida = categoriasComida;
    }

    public Platos getPlatos() {
        return this.platos;
    }

    public void setPlatos(Platos platos) {
        this.platos = platos;
    }

    @Override
    public String toString() {
        return "{" +
            " iddetPlatos='" + getIddetPlatos() + "'" +
            ", cantidad='" + getCantidad() + "'" +
            ", categoriasComida='" + getCategoriasComida() + "'" +
            ", platos='" + getPlatos() + "'" +
            "}";
    }    
    
}