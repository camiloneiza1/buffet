package co.edu.ucentral.buffet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.edu.ucentral.buffet.model.CategoriasComida;
import co.edu.ucentral.buffet.repository.CategoriasComidaRepository;

@Service
@Primary
public class CategoriasComidaServiceImplJpa implements CategoriasComidaService {
	
	@Autowired
	private CategoriasComidaRepository repo;

	@Override
	public List<CategoriasComida> listarCategoriasComidas() {
		return repo.findAll();
	}

	@Override
	public CategoriasComida buscarPorId(int idCategoriasComida) {
		Optional<CategoriasComida> optional= repo.findById(idCategoriasComida);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(CategoriasComida categoriaComida) {
		repo.save(categoriaComida);
	}

	@Override
	public void borrar(int idCategoriasComida) {
		repo.deleteById(idCategoriasComida);

	}

	@Override
	public Page<CategoriasComida> paginarCategoriasComida(Pageable page) {
		return repo.findAll(page);
	}

}
