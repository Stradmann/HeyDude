package com.empire.spaceEmpire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.empire.spaceEmpire.model.Planet;
import com.empire.spaceEmpire.service.PlanetService;

@Controller
@RequestMapping("/empire")
public class PlanetController {

	@Autowired
	PlanetService service;
	
}
