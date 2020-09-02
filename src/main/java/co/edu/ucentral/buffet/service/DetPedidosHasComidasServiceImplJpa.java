package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DetPedidosHasComidas buscarPorId(int idDetPedidosHasComida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(DetPedidosHasComidas detPedidosHasComida) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(int idDetPedidosHasComida) {
		// TODO Auto-generated method stub

	}

}
