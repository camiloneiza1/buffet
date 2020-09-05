package co.edu.ucentral.buffet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.edu.ucentral.buffet.model.Platos;
import co.edu.ucentral.buffet.repository.PlatosRepository;

@Service
@Primary
public class PlatosServiceImplJpa implements PlatosService {

	@Autowired
	private PlatosRepository repo;
	
	@Override
	public List<Platos> listarPlatos() {
		return repo.findAll();
	}

	@Override
	public Platos buscarPorId(int idPlatos) {
		Optional<Platos> optional= repo.findById(idPlatos);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(Platos platos) {
		repo.save(platos);

	}

	@Override
	public void borrar(int idPlatos) {
		repo.deleteById(idPlatos);

	}

	@Override
	public Page<Platos> paginarPlatos(Pageable page) {
		return repo.findAll(page);
	}

}
