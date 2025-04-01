package com.medifinder.Location;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.medifinder.PharmacyList.PharmacyList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Location {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    @JsonManagedReference("location-pharmacy")
    private List<PharmacyList> pharmacyLists;

	public Location(Long id, String name, List<PharmacyList> pharmacyLists) {
		super();
		this.id = id;
		this.name = name;
		this.pharmacyLists = pharmacyLists;
	}


	public Location() {
		super();
		// TODO Auto-generated constructor stub
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


	public List<PharmacyList> getPharmacyLists() {
		return pharmacyLists;
	}


	public void setPharmacyLists(List<PharmacyList> pharmacyLists) {
		this.pharmacyLists = pharmacyLists;
	}
    
    
}
