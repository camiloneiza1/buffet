package co.edu.ucentral.buffet.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Pedidos")
public class Pedidos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPedidos;
	private String direccion;
	private String telefono;
	private String formaPago;
	private Date fechaSolicitud;
	private Date fechaEntrega;
	private String estado;
	private String observaciones;
	private double valorDomicilio;
	private double valorPlatos;
	private double valorTotal;

	@ManyToOne
    @JoinColumn (name = "idUsuario")
	private Usuarios usuarios;

	
	public Integer getIdPedidos() {
		return this.idPedidos;
	}

	public void setIdPedidos(Integer idPedidos) {
		this.idPedidos = idPedidos;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public Date getFechaSolicitud() {
		return this.fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public Date getFechaEntrega() {
		return this.fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public double getValorDomicilio() {
		return this.valorDomicilio;
	}

	public void setValorDomicilio(double valorDomicilio) {
		this.valorDomicilio = valorDomicilio;
	}

	public double getValorPlatos() {
		return this.valorPlatos;
	}

	public void setValorPlatos(double valorPlatos) {
		this.valorPlatos = valorPlatos;
	}

	public double getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return "Pedidos [idPedidos=" + idPedidos + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", formaPago=" + formaPago + ", fechaSolicitud=" + fechaSolicitud + ", fechaEntrega=" + fechaEntrega
				+ ", estado=" + estado + ", observaciones=" + observaciones + ", valorDomicilio=" + valorDomicilio
				+ ", valorPlatos=" + valorPlatos + ", valorTotal=" + valorTotal + ", usuarios=" + usuarios + "]";
	}

	

}
