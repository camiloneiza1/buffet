package co.edu.ucentral.buffet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
		return repo.findAll();
	}

	@Override
	public Usuarios buscarPorId(int idUsuario) {
		Optional<Usuarios> optional= repo.findById(idUsuario);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(Usuarios usuario) {
		repo.save(usuario);
	}

	@Override
	public void borrar(int idUsuario) {
		repo.deleteById(idUsuario);

	}

	@Override
	public Page<Usuarios> paginarUsuarios(Pageable page) {
		return repo.findAll(page);
	}
	
	@Override
	public Usuarios buscarPorUserName(String username) {
		return repo.findByUsername(username);
	}

}
