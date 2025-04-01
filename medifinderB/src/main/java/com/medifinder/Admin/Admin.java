package com.medifinder.Admin;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.medifinder.PharmacyList.PharmacyList;
import com.medifinder.SuperAdmin.SuperAdmin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
		
		@Entity
		public class Admin {
			@Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
		    private Long id;
		 
			@ManyToOne
			@JoinColumn(name = "s_id", nullable = false)
			@JsonBackReference("superAdmin-admin")
			private SuperAdmin superAdmin;
		
		    @ManyToOne
		    @JoinColumn(name = "pharmacylist_id", nullable = false)
		    @JsonBackReference("pharmacyList-admin")
		    private PharmacyList pharmacyList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SuperAdmin getSuperAdmin() {
		return superAdmin;
	}

	public void setSuperAdmin(SuperAdmin superAdmin) {
		this.superAdmin = superAdmin;
	}

	public PharmacyList getPharmacyList() {
		return pharmacyList;
	}

	public void setPharmacyList(PharmacyList pharmacyList) {
		this.pharmacyList = pharmacyList;
	}

	public Admin(Long id, SuperAdmin superAdmin, PharmacyList pharmacyList) {
		super();
		this.id = id;
		this.superAdmin = superAdmin;
		this.pharmacyList = pharmacyList;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
