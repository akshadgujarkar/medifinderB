package com.medifinder.Medicine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineService {

	
	@Autowired
	MedicineRepository medicineRepository;
	
	public Iterable<Medicine> getAllMedicine() {
	 return medicineRepository.findAll();
	}
	
	public void addMedicine(Medicine medicine) {
		medicineRepository.save(medicine);
	}
	
	public void updatePriceQuantity(int medicineId,int price,int quantity) {
		medicineRepository.updatePriceAndQuantityById(medicineId, price,quantity);
	}
}
