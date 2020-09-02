package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import co.edu.ucentral.buffet.model.Menus;
import co.edu.ucentral.buffet.repository.MenusRepository;

@Service
@Primary
public class MenusServiceImplJpa implements MenusService {
	
	@Autowired
	private MenusRepository repo;
	
	@Override
	public List<Menus> listarMenus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menus buscarPorId(int idMenu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Menus menu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(int idMenu) {
		// TODO Auto-generated method stub

	}

}
