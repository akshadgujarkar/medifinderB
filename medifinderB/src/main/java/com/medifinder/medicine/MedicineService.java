package com.medifinder.medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {
    
    @Autowired
    private MedicineRepository medicineRepository;
    
    public Medicine addMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }
    
    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }
}
