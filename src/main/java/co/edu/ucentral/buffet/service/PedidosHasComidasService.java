package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.ucentral.buffet.model.PedidosHasComidas;

public interface PedidosHasComidasService {
	public List<PedidosHasComidas> listarPedidosHasComidas();
	public PedidosHasComidas buscarPorId(int idPedidosHasComida);
	public void guardar(PedidosHasComidas pedidosHasComidas);
	public void borrar(int idPedidosHasComida);
	public Page<PedidosHasComidas> paginarPedidosHasComidas(Pageable page);
}
