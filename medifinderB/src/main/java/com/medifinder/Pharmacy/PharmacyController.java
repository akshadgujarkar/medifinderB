package com.medifinder.Pharmacy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PharmacyController {
	@Autowired
	private PharmacyService pharmacyService;

	 @RequestMapping(value = "/admin")
	   public List<Pharmacy> getAllPharmacies() 
	   {		
		return pharmacyService.getAllPharmacies();
	   }	
	 @RequestMapping(value="/registration2") // Explicitly define as a GET request
	    public ResponseEntity<String> getPharmacyRequest() {
	        return ResponseEntity.ok("Hello World");
	    }
}
