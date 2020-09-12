package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.ucentral.buffet.model.DetPedidos;

public interface DetPedidosService {
	public List<DetPedidos> listarDetPedidos();
	public DetPedidos buscarPorId(int idDetPedido);
	public DetPedidos guardar(DetPedidos detPedido);
	public void borrar(int idDetPedido);
	public Page<DetPedidos> paginarDetPedidos(Pageable page);
}
