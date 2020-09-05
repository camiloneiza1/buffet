package co.edu.ucentral.buffet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.edu.ucentral.buffet.model.DetPedidos;
import co.edu.ucentral.buffet.repository.DetPedidosRepository;

@Service
@Primary
public class DetPedidosServiceImplJpa implements DetPedidosService {

	@Autowired
	private DetPedidosRepository repo;
	
	@Override
	public List<DetPedidos> listarDetPedidos() {
		return repo.findAll();
	}

	@Override
	public DetPedidos buscarPorId(int idDetPedido) {
		Optional<DetPedidos> optional= repo.findById(idDetPedido);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(DetPedidos detPedido) {
		repo.save(detPedido);
	}

	@Override
	public void borrar(int idDetPedido) {
		repo.deleteById(idDetPedido);

	}

	@Override
	public Page<DetPedidos> paginarDetPedidos(Pageable page) {
		return repo.findAll(page);
	}

}
