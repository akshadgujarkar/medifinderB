package com.medifinder.Admin;

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
    private SuperAdmin superAdmin;

    @ManyToOne
    @JoinColumn(name = "pharmacylist_id", nullable = false)
    private PharmacyList pharmacyList;
}
