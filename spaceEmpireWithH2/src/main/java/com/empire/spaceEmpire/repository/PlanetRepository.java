package com.empire.spaceEmpire.repository;

import org.springframework.data.repository.CrudRepository;

import com.empire.spaceEmpire.model.Planet;

public interface PlanetRepository extends CrudRepository<Planet, Long> {

}
