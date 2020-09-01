package co.edu.ucentral.buffet.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="detPedidos")
public class detPedidos {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer iddetPedidos;
	private Integer idPlatos;
    private Integer idPedidos;
    private Integer cantidad;
    private Double precioUnitario;
    private Double costoAdicionales;
    private Double costoTotal;
    private String observaciones;

    @OneToMany (mappedBy = "dPedidos")
    private List<detPedidosHasComidas> dPedidosHasComidas;

    @ManyToOne
    @JoinColumn (name = "idPlatos")
    private Platos platos;

    @ManyToOne
    @JoinColumn (name = "idPedidos")
    private Pedidos pedidos;

    public Integer getIddetPedidos() {
        return this.iddetPedidos;
    }

    public void setIddetPedidos(Integer iddetPedidos) {
        this.iddetPedidos = iddetPedidos;
    }

    public Integer getIdPlatos() {
        return this.idPlatos;
    }

    public void setIdPlatos(Integer idPlatos) {
        this.idPlatos = idPlatos;
    }

    public Integer getIdPedidos() {
        return this.idPedidos;
    }

    public void setIdPedidos(Integer idPedidos) {
        this.idPedidos = idPedidos;
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

    public Double getCostoAdicionales() {
        return this.costoAdicionales;
    }

    public void setCostoAdicionales(Double costoAdicionales) {
        this.costoAdicionales = costoAdicionales;
    }

    public Double getCostoTotal() {
        return this.costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


    public List<detPedidosHasComidas> getDPedidosHasComidas() {
        return this.dPedidosHasComidas;
    }

    public void setDPedidosHasComidas(List<detPedidosHasComidas> dPedidosHasComidas) {
        this.dPedidosHasComidas = dPedidosHasComidas;
    }

    public Platos getPlatos() {
        return this.platos;
    }

    public void setPlatos(Platos platos) {
        this.platos = platos;
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
            " iddetPedidos='" + getIddetPedidos() + "'" +
            ", idPlatos='" + getIdPlatos() + "'" +
            ", idPedidos='" + getIdPedidos() + "'" +
            ", cantidad='" + getCantidad() + "'" +
            ", precioUnitario='" + getPrecioUnitario() + "'" +
            ", costoAdicionales='" + getCostoAdicionales() + "'" +
            ", costoTotal='" + getCostoTotal() + "'" +
            ", observaciones='" + getObservaciones() + "'" +
            ", dPedidosHasComidas='" + getDPedidosHasComidas() + "'" +
            ", platos='" + getPlatos() + "'" +
            ", pedidos='" + getPedidos() + "'" +
            "}";
    }
}