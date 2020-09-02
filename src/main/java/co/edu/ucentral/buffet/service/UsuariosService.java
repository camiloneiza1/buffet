package co.edu.ucentral.buffet.service;

import java.util.List;

import co.edu.ucentral.buffet.model.Usuarios;

public interface UsuariosService {
	public List<Usuarios> listarUsuarios();
	public Usuarios buscarPorId(int idUsuario);
	public void guardar(Usuarios usuario);
	public void borrar(int idUsuario);
}