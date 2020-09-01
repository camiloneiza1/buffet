package co.edu.ucentral.buffet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PedidosHasComidas")
public class PedidosHasComidas {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idPedidosHasComidas;
    private Integer cantidad;
    private Double precioUnitario;
    private Double costoTotal;

    @ManyToOne
    @JoinColumn (name = "idComidas")
    private Comidas comidas;

    @ManyToOne
    @JoinColumn (name = "idPedidos")
    private Pedidos pedidos;


    public Integer getIdPedidosHasComidas() {
        return this.idPedidosHasComidas;
    }

    public void setIdPedidosHasComidas(Integer idPedidosHasComidas) {
        this.idPedidosHasComidas = idPedidosHasComidas;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return this.precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getCostoTotal() {
        return this.costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }


    public Comidas getComidas() {
        return this.comidas;
    }

    public void setComidas(Comidas comidas) {
        this.comidas = comidas;
    }

    public Pedidos getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "{" +
            " idPedidosHasComidas='" + getIdPedidosHasComidas() + "'" +
            ", cantidad='" + getCantidad() + "'" +
            ", precioUnitario='" + getPrecioUnitario() + "'" +
            ", costoTotal='" + getCostoTotal() + "'" +
            ", comidas='" + getComidas() + "'" +
            ", pedidos='" + getPedidos() + "'" +
            "}";
    }

}