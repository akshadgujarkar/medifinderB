package com.medifinder.Registration;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;
	
	@PostMapping(value="/add",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> registerPharmacy(@RequestBody Registration pharmacy){
		registrationService.registerPharmacy(pharmacy);
		return ResponseEntity.ok("registration successfully");
}
}
