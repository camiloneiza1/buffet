package co.edu.ucentral.buffet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.edu.ucentral.buffet.model.Comidas;
import co.edu.ucentral.buffet.repository.ComidasRepository;

@Service
@Primary
public class ComidasServiceImplJpa implements ComidasService {
	
	@Autowired
	private ComidasRepository repo;

	@Override
	public List<Comidas> listarComidas() {
		return repo.findAll();
	}

	@Override
	public Comidas buscarPorId(int idComida) {
		Optional<Comidas> optional= repo.findById(idComida);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(Comidas comida) {
		repo.save(comida);

	}

	@Override
	public void borrar(int idComida) {
		repo.deleteById(idComida);

	}

	@Override
	public Page<Comidas> paginarComida(Pageable page) {
		return repo.findAll(page);
	}

}
