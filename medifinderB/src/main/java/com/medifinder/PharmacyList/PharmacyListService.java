package com.medifinder.PharmacyList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PharmacyListService {

	
	@Autowired
	PharmacyListRepository pharmacyListRepository;
	
	
	public void addPharmacy(PharmacyList pharmacyList) {
		pharmacyListRepository.save(pharmacyList);
	}
}
