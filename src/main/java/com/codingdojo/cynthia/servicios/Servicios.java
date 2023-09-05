package com.codingdojo.cynthia.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.cynthia.modelos.Etiqueta;
import com.codingdojo.cynthia.modelos.Pregunta;
import com.codingdojo.cynthia.modelos.Respuesta;
import com.codingdojo.cynthia.repositorios.RepositorioEtiquetas;
import com.codingdojo.cynthia.repositorios.RepositorioPreguntas;
import com.codingdojo.cynthia.repositorios.RepositorioRespuestas;

@Service
public class Servicios {
	
	@Autowired
	private RepositorioPreguntas repoPreguntas;
	
	@Autowired
	private RepositorioRespuestas repoRespuestas;
	
	@Autowired
	private RepositorioEtiquetas repoEtiquetas;
	
	public List<Pregunta> todasPreguntas() {
		return repoPreguntas.findAll();
	}
	
	public Pregunta guardarPregunta(Pregunta nuevaPregunta) {
		return repoPreguntas.save(nuevaPregunta);
	}
	
	public Respuesta guardarRespuesta(Respuesta nuevaRespuesta) {
		return repoRespuestas.save(nuevaRespuesta);
	}
	
	//tema = "programacion"
	public Etiqueta encuentraEtiqueta(String tema) {
		return repoEtiquetas.findByTema(tema); //OBJ Etiqueta tema=programacion
	}
	
	public Etiqueta guardarEtiqueta(Etiqueta nuevaEtiqueta) {
		return repoEtiquetas.save(nuevaEtiqueta);
	}
	
	public Pregunta encuentraPregunta(Long id) {
		return repoPreguntas.findById(id).orElse(null);
	}
	
}
