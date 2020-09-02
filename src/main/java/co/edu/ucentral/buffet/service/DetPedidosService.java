package co.edu.ucentral.buffet.service;

import java.util.List;

import co.edu.ucentral.buffet.model.DetPedidos;

public interface DetPedidosService {
	public List<DetPedidos> listarDetPedidos();
	public DetPedidos buscarPorId(int idDetPedido);
	public void guardar(DetPedidos detPedido);
	public void borrar(int idDetPedido);
}
