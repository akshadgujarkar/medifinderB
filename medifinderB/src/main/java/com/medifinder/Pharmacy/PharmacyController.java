package com.medifinder.Pharmacy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.medifinder.registeration.Register;

@RestController
@RequestMapping("/api/pharmacy")  // Base URL for this controller
public class PharmacyController {

    @Autowired
    private PharmacyService pharmacyService;

    // Endpoint: GET /api/pharmacy/admin
    @GetMapping("/admin")
    public List<Pharmacy> getAllPharmacies() {		
        return pharmacyService.getAllPharmacies();
    }	

    // Endpoint: GET /api/pharmacy/registeredPharmacy
    @GetMapping("/registeredPharmacy")
    public List<Register> getRegisteredPharmacy() { 
        return pharmacyService.getRegisteredPharmacy();
    }	
}
