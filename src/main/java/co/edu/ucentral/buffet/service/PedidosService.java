package co.edu.ucentral.buffet.service;

import java.util.List;

import co.edu.ucentral.buffet.model.Pedidos;

public interface PedidosService {
	public List<Pedidos> listarPedidos();
	public Pedidos buscarPorId(int idPedido);
	public void guardar(Pedidos pedido);
	public void borrar(int idPedido);
}
