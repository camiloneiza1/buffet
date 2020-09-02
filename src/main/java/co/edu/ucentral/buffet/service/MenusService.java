package co.edu.ucentral.buffet.service;

import java.util.List;

import co.edu.ucentral.buffet.model.Menus;

public interface MenusService {
	public List<Menus> listarMenus();
	public Menus buscarPorId(int idMenu);
	public void guardar(Menus menu);
	public void borrar(int idMenu);
}
