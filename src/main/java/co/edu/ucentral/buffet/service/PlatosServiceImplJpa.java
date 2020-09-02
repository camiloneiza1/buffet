package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Platos buscarPorId(int idPlatos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Platos platos) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(int idPlatos) {
		// TODO Auto-generated method stub

	}

}
