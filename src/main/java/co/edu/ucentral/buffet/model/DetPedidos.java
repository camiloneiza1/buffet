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
public class DetPedidos {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer iddetPedidos;
    private Integer cantidad;
    private Double precioUnitario;
    private Double costoAdicionales;
    private Double costoTotal;
    private String observaciones;

    @OneToMany (mappedBy = "dPedidos")
    private List<DetPedidosHasComidas> dPedidosHasComidas;

    @ManyToOne
    @JoinColumn (name = "idMenus")
    private Menus menus;

    @ManyToOne
    @JoinColumn (name = "idPedidos")
    private Pedidos pedidos;

    public Integer getIddetPedidos() {
        return this.iddetPedidos;
    }

    public void setIddetPedidos(Integer iddetPedidos) {
        this.iddetPedidos = iddetPedidos;
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


    public List<DetPedidosHasComidas> getDPedidosHasComidas() {
        return this.dPedidosHasComidas;
    }

    public void setDPedidosHasComidas(List<DetPedidosHasComidas> dPedidosHasComidas) {
        this.dPedidosHasComidas = dPedidosHasComidas;
    }
    

    public Menus getMenus() {
		return menus;
	}

	public void setMenus(Menus menus) {
		this.menus = menus;
	}

	public Pedidos getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

	@Override
	public String toString() {
		return "DetPedidos [iddetPedidos=" + iddetPedidos + ", cantidad=" + cantidad + ", precioUnitario="
				+ precioUnitario + ", costoAdicionales=" + costoAdicionales + ", costoTotal=" + costoTotal
				+ ", observaciones=" + observaciones + ", dPedidosHasComidas=" + dPedidosHasComidas + ", menus=" + menus
				+ ", pedidos=" + pedidos + "]";
	}

}