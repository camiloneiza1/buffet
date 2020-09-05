package co.edu.ucentral.buffet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.edu.ucentral.buffet.model.PedidosHasComidas;
import co.edu.ucentral.buffet.repository.PedidosHasComidasRepository;

@Service
@Primary
public class PedidosHasComidasServiceImplJpa implements PedidosHasComidasService {
	
	@Autowired
	private PedidosHasComidasRepository repo;
	@Override
	public List<PedidosHasComidas> listarPedidosHasComidas() {
		return repo.findAll();
	}

	@Override
	public PedidosHasComidas buscarPorId(int idPedidosHasComida) {
		Optional<PedidosHasComidas> optional= repo.findById(idPedidosHasComida);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(PedidosHasComidas pedidosHasComidas) {
		repo.save(pedidosHasComidas);

	}

	@Override
	public void borrar(int idPedidosHasComida) {
		repo.deleteById(idPedidosHasComida);

	}

	@Override
	public Page<PedidosHasComidas> paginarPedidosHasComidas(Pageable page) {
		return repo.findAll(page);
	}

}
