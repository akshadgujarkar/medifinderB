package com.medifinder.PharmacyList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pharmacyList")
public class PharmacyListController {

	
	@Autowired
	PharmacyListService pharmacyListService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addPharmacy(@RequestBody PharmacyList pharmacyList){
		pharmacyListService.addPharmacy(pharmacyList);
		return ResponseEntity.ok("pharmacy added successfully");
	}
}
