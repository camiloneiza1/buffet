package co.edu.ucentral.buffet.service;

import java.util.List;

import co.edu.ucentral.buffet.model.Perfiles;

public interface PerfilesService {
    public List<Perfiles> listarPerfiles();
	public Perfiles buscarPorId(int idPerfiles);
	public void guardar(Perfiles perfiles);
	public void borrar(int idPerfiles);
}
