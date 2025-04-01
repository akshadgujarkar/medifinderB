package com.medifinder.ReserveMedicine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reserveMedicine")
public class ReserveMedicineController {

	
	@Autowired
	ReserveMedicineService reserveMedicineService;
	
	@GetMapping("/all")
	public List<ReserveMedicine> getAllReserveMedicine(){
		return reserveMedicineService.getAllReserveMedicine();
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addReserveMedicine(@RequestBody ReserveMedicine reserveMedicine){
		reserveMedicineService.addReserveMedicine(reserveMedicine);
		return ResponseEntity.ok("medicine reserve successfully");
	}
}
