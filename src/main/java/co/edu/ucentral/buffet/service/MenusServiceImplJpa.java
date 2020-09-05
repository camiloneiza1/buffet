package co.edu.ucentral.buffet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
		return repo.findAll();
	}

	@Override
	public Menus buscarPorId(int idMenu) {
		Optional<Menus> optional= repo.findById(idMenu);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(Menus menu) {
		repo.save(menu);

	}

	@Override
	public void borrar(int idMenu) {
		repo.deleteById(idMenu);

	}
	
	@Override
	public Page<Menus> paginarMenus(Pageable page) {
		return repo.findAll(page);
	}

}