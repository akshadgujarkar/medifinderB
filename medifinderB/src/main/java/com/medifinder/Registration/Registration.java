package com.medifinder.Registration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registration {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String pharmacyName;
    private String username;
    private String licenseNo;
    private String area;
    private String phoneNo;
    private String owner;
    private String password;
}
