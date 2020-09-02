package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import co.edu.ucentral.buffet.model.Usuarios;
import co.edu.ucentral.buffet.repository.UsuariosRepository;

@Service
@Primary
public class UsuariosServiceImplJpa implements UsuariosService {
	
	@Autowired
	private UsuariosRepository repo;
	
	@Override
	public List<Usuarios> listarUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios buscarPorId(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Usuarios usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(int idUsuario) {
		// TODO Auto-generated method stub

	}

}
