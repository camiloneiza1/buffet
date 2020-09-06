package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.ucentral.buffet.model.Usuarios;

public interface UsuariosService {
	public List<Usuarios> listarUsuarios();
	public Usuarios buscarPorId(int idUsuario);
	public void guardar(Usuarios usuario);
	public void borrar(int idUsuario);
	public Usuarios buscarPorUserName(String username);
	public Page<Usuarios> paginarUsuarios(Pageable page);
}