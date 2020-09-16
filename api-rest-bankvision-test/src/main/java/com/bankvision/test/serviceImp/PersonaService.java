package com.bankvision.test.serviceImp;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bankvision.test.dao.IPersonaDAO;
import com.bankvision.test.exception.NotFoundException;
import com.bankvision.test.model.Persona;
import com.bankvision.test.service.IPersonaService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PersonaService implements IPersonaService {
	
	@Autowired
	private IPersonaDAO personaDAO;
	
	@Override
	public List<Persona> listarPersona() {
		return personaDAO.findAll();
	}

	@Override
	public Persona agregarPersona(Persona persona) {
		persona.setFecha_creacion(new Date());
		return personaDAO.save(persona);
	}

	@Override
	public Persona editarPersona(Persona persona) {
		persona.setFecha_creacion(new Date());
		return personaDAO.save(persona);
	}


	@Override
	public void eliminarPersona(int id) {
		personaDAO.deleteById(id);
		
	}


	@Override
	public Persona listarPersonaById(int id) {
		Optional<Persona> persona = personaDAO.findById(id);
		if (!persona.isPresent()) {
			log.warn(String.format("Error: usuario no encontrado", id));
			
			throw new NotFoundException("El usuario no existe");
		}
		return persona.get();
		
	}

}
