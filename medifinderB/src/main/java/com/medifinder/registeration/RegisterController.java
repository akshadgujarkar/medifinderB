package com.medifinder.registeration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // Base path for all endpoints (optional)
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @PostMapping("/registration") // Use @PostMapping for clarity
    public ResponseEntity<String> addPharmacyRequest(@RequestBody Register register) {
        registerService.addPharmacyRequest(register);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Pharmacy registration request submitted successfully.");
    }

    @GetMapping("/registration2") // Explicitly define as a GET request
    public ResponseEntity<String> getPharmacyRequest() {
        return ResponseEntity.ok("Hello World");
    }
}
