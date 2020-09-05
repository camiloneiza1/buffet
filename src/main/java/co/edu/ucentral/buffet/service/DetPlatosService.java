package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.ucentral.buffet.model.DetPlatos;

public interface DetPlatosService {
	public List<DetPlatos> listarDetPlatos();
	public DetPlatos buscarPorId(int idDetPlato);
	public void guardar(DetPlatos detPlato);
	public void borrar(int idDetPlato);
	public Page<DetPlatos> paginarDetPlatos(Pageable page);
}
