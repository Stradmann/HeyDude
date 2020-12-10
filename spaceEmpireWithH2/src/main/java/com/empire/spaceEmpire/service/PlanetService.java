package com.empire.spaceEmpire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empire.spaceEmpire.model.Planet;
import com.empire.spaceEmpire.repository.PlanetRepository;

@Service
public class PlanetService {

	@Autowired
	PlanetRepository repository;
	
	public Iterable<Planet> findAll() {

		return repository.findAll();
	}
	
	public void insertEmpire (Planet planet) {

		repository.save(planet);
	}
}
