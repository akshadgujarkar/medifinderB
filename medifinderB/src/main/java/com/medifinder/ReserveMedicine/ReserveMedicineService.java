package com.medifinder.ReserveMedicine;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserveMedicineService {

	
	@Autowired
	ReserveMedicineRepository reserveMedicineRepositoy;
	
	public List<ReserveMedicine> getAllReserveMedicine(){
		List<ReserveMedicine> medicines = new ArrayList<>();
		reserveMedicineRepositoy.findAll()
		.forEach(medicines::add);
		return medicines;
	}
	
	public void addReserveMedicine(ReserveMedicine reserveMedicine) {
		reserveMedicineRepositoy.save(reserveMedicine);
	}
}
