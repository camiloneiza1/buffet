package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.ucentral.buffet.model.DetPedidosHasComidas;

public interface DetPedidosHasComidasService {
	public List<DetPedidosHasComidas> listarDetPedidosHasComidas();
	public DetPedidosHasComidas buscarPorId(int idDetPedidosHasComida);
	public void guardar(DetPedidosHasComidas detPedidosHasComida);
	public void borrar(int idDetPedidosHasComida);
	public Page<DetPedidosHasComidas> paginarDetPedidosHasComidas(Pageable page);
}
