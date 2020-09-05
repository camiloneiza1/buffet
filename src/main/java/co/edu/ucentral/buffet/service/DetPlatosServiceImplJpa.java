package co.edu.ucentral.buffet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.edu.ucentral.buffet.model.DetPlatos;
import co.edu.ucentral.buffet.repository.DetPlatosRepository;

@Service
@Primary
public class DetPlatosServiceImplJpa implements DetPlatosService {

	@Autowired
	private DetPlatosRepository repo;
	
	@Override
	public List<DetPlatos> listarDetPlatos() {
		return repo.findAll();
	}

	@Override
	public DetPlatos buscarPorId(int idDetPlato) {
		Optional<DetPlatos> optional= repo.findById(idDetPlato);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(DetPlatos detPlato) {
		repo.save(detPlato);
	}

	@Override
	public void borrar(int idDetPlato) {
		repo.deleteById(idDetPlato);
	}

	@Override
	public Page<DetPlatos> paginarDetPlatos(Pageable page) {
		return repo.findAll(page);
	}

}
