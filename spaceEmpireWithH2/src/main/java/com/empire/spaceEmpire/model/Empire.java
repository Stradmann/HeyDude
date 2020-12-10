package com.empire.spaceEmpire.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Empire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String govermentType;
	
	@OneToMany(mappedBy = "empire", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Planet> ownedPlanets;
	
	
	public Empire() {}
	
	public Empire(Long id, String name, String govermentType) {
		super();
		this.id = id;
		this.name = name;
		this.govermentType = govermentType;
	}
	
	public Empire(String name, String govermentType) {
		
		this.name = name;
		this.govermentType = govermentType;
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

	public String getGovermentType() {
		return govermentType;
	}

	public void setGovermentType(String govermentType) {
		this.govermentType = govermentType;
	}

	public List<Planet> getOwnedPlanets() {
		return ownedPlanets;
	}

	public void setOwnedPlanets(List<Planet> ownedPlanets) {
		this.ownedPlanets = ownedPlanets;
	}

	@Override
	public String toString() {
		return "Empire [id=" + id + ", name=" + name + ", govermentType=" + govermentType + "]";
	}
	
	
}
