package com.medifinder.Medicine;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicine")
public class MedicineController {

	@Autowired
	MedicineService medicineService;
	
	@GetMapping("/all")
	public Iterable<Medicine> getAllMedicine(){
		return medicineService.getAllMedicine();
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addMedicine(@RequestBody Medicine medicine){
		medicineService.addMedicine(medicine);
		return ResponseEntity.ok("medicine added successfully");
	}
	
	@PutMapping("/update/{medicineId}")
	public ResponseEntity<String> updatePriceQuantity(@PathVariable int medicineId , @RequestParam int price, @RequestParam int quantity){
		medicineService.updatePriceQuantity(medicineId,price,quantity);
		return ResponseEntity.ok("price and quantity updated successfully");
	}
}
