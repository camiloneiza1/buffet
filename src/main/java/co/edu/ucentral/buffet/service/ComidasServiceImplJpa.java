package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comidas buscarPorId(int idComida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Comidas comida) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(int idComida) {
		// TODO Auto-generated method stub

	}

}
