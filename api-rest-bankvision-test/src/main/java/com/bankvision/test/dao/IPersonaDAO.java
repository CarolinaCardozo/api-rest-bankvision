package com.bankvision.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bankvision.test.model.Persona;

@Repository
public interface IPersonaDAO extends JpaRepository<Persona, Integer> {

}
