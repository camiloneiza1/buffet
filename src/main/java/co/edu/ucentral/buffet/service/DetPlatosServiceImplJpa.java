package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DetPlatos buscarPorId(int idDetPlato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(DetPlatos detPlato) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(int idDetPlato) {
		// TODO Auto-generated method stub

	}

}
