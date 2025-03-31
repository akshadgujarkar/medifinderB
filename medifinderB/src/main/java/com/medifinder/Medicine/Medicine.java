package com.medifinder.Medicine;

import com.medifinder.PharmacyList.PharmacyList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Medicine {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    private String medicineName;

	    @ManyToOne
	    @JoinColumn(name = "pharmacy_list_id", nullable = false)
	    private PharmacyList pharmacyList;
}
