package com.codingdojo.cynthia.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.cynthia.modelos.Respuesta;

@Repository
public interface RepositorioRespuestas extends CrudRepository<Respuesta, Long> {
	//save, findById, deleteById
}
