package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedidos buscarPorId(int idPedido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Pedidos pedido) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(int idPedido) {
		// TODO Auto-generated method stub

	}

}
