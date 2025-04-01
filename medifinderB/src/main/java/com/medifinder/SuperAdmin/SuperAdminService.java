package com.medifinder.SuperAdmin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperAdminService {

	@Autowired
	private SuperAdminRepository superAdminRepository;
	
	public List<SuperAdmin> getAllAdmins(){
	    List<SuperAdmin> superadmin = new ArrayList<>();
	    superAdminRepository.findAll()
	    .forEach(superadmin::add);
	    return superadmin;		
	}
	
	public void addAdmin(SuperAdmin superAdmin) {
		superAdminRepository.save(superAdmin);
	}
}
