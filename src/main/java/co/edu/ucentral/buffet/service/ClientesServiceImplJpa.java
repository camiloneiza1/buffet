package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import co.edu.ucentral.buffet.model.Clientes;
import co.edu.ucentral.buffet.repository.ClientesRepository;

@Service
@Primary
public class ClientesServiceImplJpa implements ClientesService {
	
	@Autowired
	private ClientesRepository repo;
	
	@Override
	public List<Clientes> listarClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clientes buscarPorId(int idCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Clientes cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(int idCliente) {
		// TODO Auto-generated method stub

	}

}
