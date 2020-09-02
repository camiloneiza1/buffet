package co.edu.ucentral.buffet.service;

import java.util.List;

import co.edu.ucentral.buffet.model.Platos;

public interface PlatosService {
	public List<Platos> listarPlatos();
	public Platos buscarPorId(int idPlatos);
	public void guardar(Platos platos);
	public void borrar(int idPlatos);
}
