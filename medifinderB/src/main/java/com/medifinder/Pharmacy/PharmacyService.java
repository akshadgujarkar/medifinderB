package com.medifinder.Pharmacy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PharmacyService {
	@Autowired
	public PharmacyRepository pharmacyRepository;
	public List<Pharmacy> getAllPharmacies() {
		
	    List<Pharmacy> pharmacies = new ArrayList<>();
		
	    pharmacyRepository.findAll()
	    .forEach(pharmacies::add);
		
	    return pharmacies;		
	}

}
