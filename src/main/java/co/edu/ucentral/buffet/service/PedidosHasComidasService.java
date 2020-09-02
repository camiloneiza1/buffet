package co.edu.ucentral.buffet.service;

import java.util.List;

import co.edu.ucentral.buffet.model.PedidosHasComidas;

public interface PedidosHasComidasService {
	public List<PedidosHasComidas> listarPedidosHasComidas();
	public PedidosHasComidas buscarPorId(int idPedidosHasComida);
	public void guardar(PedidosHasComidas pedidosHasComidas);
	public void borrar(int idPedidosHasComida);
}
