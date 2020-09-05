package co.edu.ucentral.buffet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.edu.ucentral.buffet.model.Pedidos;
import co.edu.ucentral.buffet.repository.PedidosRepository;

@Service
@Primary
public class PedidosServiceImplJpa implements PedidosService {
	
	@Autowired
	private PedidosRepository repo;
	
	@Override
	public List<Pedidos> listarPedidos() {
		return repo.findAll();
	}

	@Override
	public Pedidos buscarPorId(final int idPedido) {
		Optional<Pedidos> optional= repo.findById(idPedido);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(final Pedidos pedido) {
		repo.save(pedido);
	}

	@Override
	public void borrar(final int idPedido) {
		repo.deleteById(idPedido);
	}

	@Override
	public Page<Pedidos> paginarPedidos(Pageable page) {
		return repo.findAll(page);
	}

}
