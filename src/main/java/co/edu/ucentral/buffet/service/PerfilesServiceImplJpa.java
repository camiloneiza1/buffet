package co.edu.ucentral.buffet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.ucentral.buffet.model.Perfiles;
import co.edu.ucentral.buffet.repository.PerfilesRepository;

public class PerfilesServiceImplJpa implements PerfilesService {
	
	@Autowired
	private PerfilesRepository repo;

	@Override
	public List<Perfiles> listarPerfiles() {
		return repo.findAll();
	}

	@Override
	public Perfiles buscarPorId(int idPerfiles) {
		Optional<Perfiles> optional= repo.findById(idPerfiles);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(Perfiles perfiles) {
		repo.save(perfiles);
	}

	@Override
	public void borrar(int idPerfiles) {
		repo.deleteById(idPerfiles);

	}

	@Override
	public Page<Perfiles> paginarPerfiles(Pageable page) {
		return repo.findAll(page);
	}

}
