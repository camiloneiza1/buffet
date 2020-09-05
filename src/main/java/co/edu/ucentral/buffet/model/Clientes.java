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
@Table(name="clientes")
public class Clientes {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idClientes;
	private String nombres;
	private String apellidos;
	private String tipoDocumento;
	private String numeroDocumento;
	private String telefono;
	private String direccion;
	private String ciudad;
    private Date fechaNacimiento;
    
    @ManyToOne
    @JoinColumn (name = "idUsuarios")
    private Usuarios usuarios;

    @OneToMany (mappedBy = "clientes")
    private List<Pedidos> pedidos;


    public Integer getIdClientes() {
        return this.idClientes;
    }

    public void setIdClientes(Integer idClientes) {
        this.idClientes = idClientes;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocumento() {
        return this.tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuarios getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public List<Pedidos> getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }

	@Override
	public String toString() {
		return "Clientes [idClientes=" + idClientes + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", ciudad=" + ciudad + ", fechaNacimiento=" + fechaNacimiento
				+ ", usuarios=" + usuarios + ", pedidos=" + pedidos + "]";
	}
}
