package co.edu.ucentral.buffet.service;

import java.util.List;

import co.edu.ucentral.buffet.model.DetPlatos;

public interface DetPlatosService {
	public List<DetPlatos> listarDetPlatos();
	public DetPlatos buscarPorId(int idDetPlato);
	public void guardar(DetPlatos detPlato);
	public void borrar(int idDetPlato);
}
