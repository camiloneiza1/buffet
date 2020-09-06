package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.ucentral.buffet.model.Comidas;

public interface ComidasService {
	public List<Comidas> listarComidas();
	public Comidas buscarPorId(int idComida);
	public void guardar(Comidas comida);
	public void borrar(int idComida);
	public Page<Comidas> paginarComida(Pageable page);
}
