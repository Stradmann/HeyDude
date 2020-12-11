package com.empire.spaceEmpire.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.empire.spaceEmpire.model.Empire;
import com.empire.spaceEmpire.model.Planet;

@Controller
@RequestMapping("/empire")
public class EmpireController {
	
	Empire userEmpire1 = new Empire((long) 1, "The Empire", "imperial");
	Empire userEmpire2 = new Empire((long) 2, "Centauri Republic", "república");
	ArrayList<Empire> empireInfoArray = new ArrayList<Empire>();
	
	Planet planet1 = new Planet((long)20, "Trantor", "Central Sector", 15000);
	Planet planet2 = new Planet((long)21, "Arrakis", "External Border", 200);
	Planet planet3 = new Planet((long)22, "Alpha Centauri", "Capitol", 20000);
	Planet planet4 = new Planet((long)23, "Ikarra", "The Frontier", 320);
	
	ArrayList<Planet> planets1 = new ArrayList<Planet>();
	ArrayList<Planet> planets2 = new ArrayList<Planet>();

	@RequestMapping("/show")
	public String showEmpire(Model model) {
		
		empireInfoArray.add(userEmpire1);
		empireInfoArray.add(userEmpire2);
		
		model.addAttribute("empireInfo", empireInfoArray);
		
		return "spaceEmpire/empireInfo.html";
	}
	
	public Empire getEmpire(Long id) {
		for(Empire empire : empireInfoArray) {
			if (empire.getId() == id) {
				return empire;
			}
		}
		return null;
	}
	
	@RequestMapping("/showPlanets")
	public String showPlanets(Model model, @RequestParam("empireID") Long id) {
		
		planets1.add(planet1);
		planets1.add(planet2);
		
		planets2.add(planet3);
		planets2.add(planet4);
		
		userEmpire1.setOwnedPlanets(planets1);
		userEmpire2.setOwnedPlanets(planets2);
		
		if (getEmpire(id) != null) {
			model.addAttribute("planets", getEmpire(id).getOwnedPlanets());
			return "spaceEmpire/planetsTable.html";
		}else {
			return "notFound.html";
		}
		
	}
}
