package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.ucentral.buffet.model.DetMenus;

public interface DetMenusService {
	public List<DetMenus> listarDetMenus();
	public DetMenus buscarPorId(int idDetMenu);
	public void guardar(DetMenus detMenu);
	public void borrar(int idDetMenu);
	public Page<DetMenus> paginarDetMenus(Pageable page);
}
