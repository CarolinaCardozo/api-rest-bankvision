package com.bankvision.test.service;

import java.util.List;

import com.bankvision.test.model.Persona;

public interface IPersonaService {
	
	List<Persona> listarPersona();

	Persona agregarPersona(Persona persona);
	
	Persona editarPersona(Persona persona);
	
	void eliminarPersona(int id);
	
	Persona listarPersonaById(int id);

}
