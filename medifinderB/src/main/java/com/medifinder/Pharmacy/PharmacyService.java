package com.medifinder.Pharmacy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medifinder.registeration.Register;
import com.medifinder.registeration.RegisterRepository;

@Service
public class PharmacyService {
	@Autowired
	public PharmacyRepository pharmacyRepository;
	
	@Autowired
	public RegisterRepository registerRepository;
	
	public List<Pharmacy> getAllPharmacies() {
		
	    List<Pharmacy> pharmacies = new ArrayList<>();
		
	    pharmacyRepository.findAll()
	    .forEach(pharmacies::add);
		
	    return pharmacies;		
	}
		
	public List<Register> getRegisteredPharmacy() {
		
	    List<Register> registeredPharmacy = registerRepository.findByStatus("APPROVED");
	    addRegisteredPharmacy(registeredPharmacy);
	    registerRepository.deleteByStatus("PENDING");
	    
	    return registeredPharmacy;
	}
	
	public void addRegisteredPharmacy(List<Register> registers) {
	    List<Pharmacy> pharmacies = registers.stream()
	        .map(register -> new Pharmacy(
	        	register.getId(),
	            register.getPharmacyName(),  // Assuming Register has this field
	            register.getUserName(),
	            register.getLiscenceNo(),
	            register.getArea(),
	            register.getCompleteAddress(),
	            register.getPhoneNo(),
	            register.getOpeningHour(),
	            register.getClosingHour(),
	            register.getOwner(),
	            register.getPassword(),
	            register.getEmail(),
	            "APPROVED" // Default status for registered pharmacies
	        ))
	        .toList();
	    pharmacyRepository.saveAll(pharmacies);
	}

	

}
