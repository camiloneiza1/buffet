package co.edu.ucentral.buffet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
		return repo.findAll();
	}

	@Override
	public Clientes buscarPorId(int idCliente) {
		Optional<Clientes> optional= repo.findById(idCliente);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(Clientes cliente) {
		repo.save(cliente);
	}

	@Override
	public void borrar(int idCliente) {
		repo.deleteById(idCliente);
	}

	@Override
	public Page<Clientes> paginarClientes(Pageable page) {
		return repo.findAll(page);
	}

}
