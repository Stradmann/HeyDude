package com.empire.spaceEmpire.model;

import javax.persistence.Entity;

public class Planet {

	private Long id;
	private String name;
	private String sector;
	private int population;
	
	public Planet() {}

	public Planet(Long id, String name, String sector, int population) {
		super();
		this.id = id;
		this.name = name;
		this.sector = sector;
		this.population = population;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", sector=" + sector + ", population=" + population + "]";
	}
	
	
}
