package com.empire.spaceEmpire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empire.spaceEmpire.model.Empire;
import com.empire.spaceEmpire.repository.EmpireRepository;

@Service
public class EmpireService {

	@Autowired
	EmpireRepository repository;
	
	public Iterable<Empire> findAll() {

		return repository.findAll();
	}
	
	public void insertEmpire (Empire empire) {

		repository.save(empire);
	}
}
