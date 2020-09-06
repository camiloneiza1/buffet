package co.edu.ucentral.buffet.model;

import java.util.Date;
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
@Table(name="pedidos")
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
	private double valorAdicionales;
	private double valorTotal;

	@ManyToOne
    @JoinColumn (name = "idClientes")
	private Clientes clientes;

	

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

	public double getValorAdicionales() {
		return this.valorAdicionales;
	}

	public void setValorAdicionales(double valorAdicionales) {
		this.valorAdicionales = valorAdicionales;
	}

	public double getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Clientes getClientes() {
		return this.clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "{" +
			" idPedidos='" + getIdPedidos() + "'" +
			", direccion='" + getDireccion() + "'" +
			", telefono='" + getTelefono() + "'" +
			", formaPago='" + getFormaPago() + "'" +
			", fechaSolicitud='" + getFechaSolicitud() + "'" +
			", fechaEntrega='" + getFechaEntrega() + "'" +
			", estado='" + getEstado() + "'" +
			", observaciones='" + getObservaciones() + "'" +
			", valorDomicilio='" + getValorDomicilio() + "'" +
			", valorPlatos='" + getValorPlatos() + "'" +
			", valorAdicionales='" + getValorAdicionales() + "'" +
			", valorTotal='" + getValorTotal() + "'" +
			", clientes='" + getClientes() + "'" +
			"}";
	}
}
