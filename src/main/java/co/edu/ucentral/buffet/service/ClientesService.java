package co.edu.ucentral.buffet.service;

import java.util.List;

import co.edu.ucentral.buffet.model.Clientes;

public interface ClientesService {
	public List<Clientes> listarClientes();
	public Clientes buscarPorId(int idCliente);
	public void guardar(Clientes cliente);
	public void borrar(int idCliente);
}
