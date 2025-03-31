package com.medifinder.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

	@Autowired
	RegistrationRepository registrationRepository;
	
	public void registerPharmacy(Registration pharmacy) {
		registrationRepository.save(pharmacy);
	}
}
