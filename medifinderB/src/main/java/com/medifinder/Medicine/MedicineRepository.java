package com.medifinder.Medicine;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface MedicineRepository extends CrudRepository<Medicine, Long>{

	@Modifying
    @Transactional
    @Query("UPDATE Medicine m SET m.pricePerUnit = :price, m.quantity = :quantity WHERE m.id = :id")
    int updatePriceAndQuantityById(int medicineId, int price, int quantity);
}
