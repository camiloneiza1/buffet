package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DetMenus buscarPorId(int idDetMenu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(DetMenus detMenu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(int idDetMenu) {
		// TODO Auto-generated method stub

	}

}
