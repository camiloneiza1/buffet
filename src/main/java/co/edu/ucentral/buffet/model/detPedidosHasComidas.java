package co.edu.ucentral.buffet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detPedidosHasComidas")
public class detPedidosHasComidas {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer iddetPedidosHasComidas;
    private Integer adicional;
    private Double precio;

    @ManyToOne
    @JoinColumn (name = "iddetPedidos")
    private detPedidos dPedidos;

    @ManyToOne
    @JoinColumn (name = "idComidas")
    private Comidas comidas;

    public Integer getIddetPedidosHasComidas() {
        return this.iddetPedidosHasComidas;
    }

    public void setIddetPedidosHasComidas(Integer iddetPedidosHasComidas) {
        this.iddetPedidosHasComidas = iddetPedidosHasComidas;
    }

    public Integer getAdicional() {
        return this.adicional;
    }

    public void setAdicional(Integer adicional) {
        this.adicional = adicional;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public detPedidos getDPedidos() {
        return this.dPedidos;
    }

    public void setDPedidos(detPedidos dPedidos) {
        this.dPedidos = dPedidos;
    }

    public Comidas getComidas() {
        return this.comidas;
    }

    public void setComidas(Comidas comidas) {
        this.comidas = comidas;
    }

    @Override
    public String toString() {
        return "{" +
            " iddetPedidosHasComidas='" + getIddetPedidosHasComidas() + "'" +
            ", adicional='" + getAdicional() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", dPedidos='" + getDPedidos() + "'" +
            ", comidas='" + getComidas() + "'" +
            "}";
    }
}