package co.edu.ucentral.buffet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detMenus")
public class DetMenus {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer iddetMenus;
    private Integer Cantidad;

    @ManyToOne
    @JoinColumn (name = "idComidas")
    private Comidas comidas;

    @ManyToOne
    @JoinColumn (name = "idMenus")
    private Menus menus;
    
    public Integer getIddetMenus() {
        return this.iddetMenus;
    }

    public void setIddetMenus(Integer iddetMenus) {
        this.iddetMenus = iddetMenus;
    }

    public Integer getCantidad() {
        return this.Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Comidas getComidas() {
        return this.comidas;
    }

    public void setComidas(Comidas comidas) {
        this.comidas = comidas;
    }

    public Menus getMenus() {
        return this.menus;
    }

    public void setMenus(Menus menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "{" +
            " iddetMenus='" + getIddetMenus() + "'" +
            ", Cantidad='" + getCantidad() + "'" +
            ", comidas='" + getComidas() + "'" +
            ", menus='" + getMenus() + "'" +
            "}";
    }
}