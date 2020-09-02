package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoriasComida buscarPorId(int idCategoriasComida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(CategoriasComida categoriaComida) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(int idCategoriasComida) {
		// TODO Auto-generated method stub

	}

}
