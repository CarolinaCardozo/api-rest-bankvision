package com.bankvision.test.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankvision.test.model.Persona;
import com.bankvision.test.service.IPersonaService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping({ "/personas" })
public class PersonaController {

	@Autowired
	private IPersonaService personaService;

	@GetMapping("/getPersonAll")
	public List<Persona> listar() {
		log.info("Ejecutando servicio GET");
		return personaService.listarPersona();
	}

	@PostMapping("/getPersonByID/{id}")
	public Persona listarPersonaByID(@PathVariable("id") int id) {
		return personaService.listarPersonaById(id);
	}

	@PostMapping("/setPerson")
	public Persona agregar(@RequestBody Persona persona) {
		return personaService.agregarPersona(persona);
	}

	@PutMapping("/updatePerson")
	public Persona editar(@RequestBody Persona persona) {
		return personaService.editarPersona(persona);
	}

	@DeleteMapping("/deletePerson/{id}")
	public void eliminar(@PathVariable("id") int id) {
		personaService.eliminarPersona(id);
	}

}
