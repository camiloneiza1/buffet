package co.edu.ucentral.buffet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.edu.ucentral.buffet.model.DetPedidosHasComidas;
import co.edu.ucentral.buffet.repository.DetPedidosHasComidasRepository;

@Service
@Primary
public class DetPedidosHasComidasServiceImplJpa implements DetPedidosHasComidasService {
	
	@Autowired
	private DetPedidosHasComidasRepository repo;
	
	@Override
	public List<DetPedidosHasComidas> listarDetPedidosHasComidas() {
		return repo.findAll();
	}

	@Override
	public DetPedidosHasComidas buscarPorId(int idDetPedidosHasComida) {
		Optional<DetPedidosHasComidas> optional= repo.findById(idDetPedidosHasComida);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(DetPedidosHasComidas detPedidosHasComida) {
		repo.save(detPedidosHasComida);
	}

	@Override
	public void borrar(int idDetPedidosHasComida) {
		repo.deleteById(idDetPedidosHasComida);
	}

	@Override
	public Page<DetPedidosHasComidas> paginarDetPedidosHasComidas(Pageable page) {
		return repo.findAll(page);
	}

}
