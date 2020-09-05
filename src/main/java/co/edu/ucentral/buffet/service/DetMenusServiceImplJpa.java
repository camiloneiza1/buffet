package co.edu.ucentral.buffet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.edu.ucentral.buffet.model.DetMenus;
import co.edu.ucentral.buffet.repository.DetMenusRepository;

@Service
@Primary
public class DetMenusServiceImplJpa implements DetMenusService {

	@Autowired
	private DetMenusRepository repo;
	
	@Override
	public List<DetMenus> listarDetMenus() {
		return repo.findAll();
	}

	@Override
	public DetMenus buscarPorId(int idDetMenu) {
		Optional<DetMenus> optional= repo.findById(idDetMenu);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(DetMenus detMenu) {
		repo.save(detMenu);
	}

	@Override
	public void borrar(int idDetMenu) {
		repo.deleteById(idDetMenu);
	}

	@Override
	public Page<DetMenus> paginarDetMenus(Pageable page) {
		return repo.findAll(page);
	}

}
