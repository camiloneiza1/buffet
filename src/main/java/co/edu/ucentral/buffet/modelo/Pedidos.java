package co.edu.ucentral.buffet.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedidos")
public class Pedidos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPedidos;
	private Integer idClientes;
	private String direccion;
	private String telefono;
	private String formaPago;
	private Date fechaSolicitud;
	private Date fechaEntrega;
	private String estado;
	private String observaciones;
	private double valorDomicilio;
	private double valorPlatos;
	private double valorAdicionales;
	private double valorTotal;
	public Integer getIdPedidos() {
		return idPedidos;
	}
	public void setIdPedidos(Integer idPedidos) {
		this.idPedidos = idPedidos;
	}
	public Integer getIdClientes() {
		return idClientes;
	}
	public void setIdClientes(Integer idClientes) {
		this.idClientes = idClientes;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public double getValorDomicilio() {
		return valorDomicilio;
	}
	public void setValorDomicilio(double valorDomicilio) {
		this.valorDomicilio = valorDomicilio;
	}
	public double getValorPlatos() {
		return valorPlatos;
	}
	public void setValorPlatos(double valorPlatos) {
		this.valorPlatos = valorPlatos;
	}
	public double getValorAdicionales() {
		return valorAdicionales;
	}
	public void setValorAdicionales(double valorAdicionales) {
		this.valorAdicionales = valorAdicionales;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	@Override
	public String toString() {
		return "Pedidos [idPedidos=" + idPedidos + ", idClientes=" + idClientes + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", formaPago=" + formaPago + ", fechaSolicitud=" + fechaSolicitud
				+ ", fechaEntrega=" + fechaEntrega + ", estado=" + estado + ", observaciones=" + observaciones
				+ ", valorDomicilio=" + valorDomicilio + ", valorPlatos=" + valorPlatos + ", valorAdicionales="
				+ valorAdicionales + ", valorTotal=" + valorTotal + "]";
	}
}
