package co.edu.ucentral.buffet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.buffet.model.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Integer> {

}
