package co.edu.ucentral.buffet.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.ucentral.buffet.model.Perfiles;

public interface PerfilesService {
    public List<Perfiles> listarPerfiles();
	public Perfiles buscarPorId(int idPerfiles);
	public void guardar(Perfiles perfiles);
	public void borrar(int idPerfiles);
	public Page<Perfiles> paginarPerfiles(Pageable page);
}
