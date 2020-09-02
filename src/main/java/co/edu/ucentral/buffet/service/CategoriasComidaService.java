package co.edu.ucentral.buffet.service;

import java.util.List;

import co.edu.ucentral.buffet.model.CategoriasComida;


public interface CategoriasComidaService {
	public List<CategoriasComida> listarCategoriasComidas();
	public CategoriasComida buscarPorId(int idCategoriasComida);
	public void guardar(CategoriasComida categoriaComida);
	public void borrar(int idCategoriasComida);
}
