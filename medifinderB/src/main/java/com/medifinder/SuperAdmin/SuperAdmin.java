package com.medifinder.SuperAdmin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SuperAdmin {
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    private String adminName;
	    private String status;
	    private String email;
	    private String phoneNo;
	    private String username;

}
