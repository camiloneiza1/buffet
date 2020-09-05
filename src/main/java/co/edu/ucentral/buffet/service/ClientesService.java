package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.ucentral.buffet.model.Clientes;

public interface ClientesService {
	public List<Clientes> listarClientes();
	public Clientes buscarPorId(int idCliente);
	public void guardar(Clientes cliente);
	public void borrar(int idCliente);
	public Page<Clientes> paginarClientes(Pageable page);
}

