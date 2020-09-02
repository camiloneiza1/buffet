package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DetPedidos buscarPorId(int idDetPedido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(DetPedidos detPedido) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(int idDetPedido) {
		// TODO Auto-generated method stub

	}

}
