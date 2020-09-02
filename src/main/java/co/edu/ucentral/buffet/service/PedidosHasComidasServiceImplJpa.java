package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PedidosHasComidas buscarPorId(int idPedidosHasComida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(PedidosHasComidas pedidosHasComidas) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(int idPedidosHasComida) {
		// TODO Auto-generated method stub

	}

}
