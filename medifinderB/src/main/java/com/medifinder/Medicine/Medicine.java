package com.medifinder.Medicine;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.medifinder.PharmacyList.PharmacyList;
import com.medifinder.ReserveMedicine.ReserveMedicine;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Medicine {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    private String medicineName;
	    	
	    private String mediType;
	    private Integer quantity;
	    private Integer pricePerUnit;
	    private String status;
	    private Boolean prescriptionRequired;
	    @ManyToOne
	    @JoinColumn(name = "pharmacy_list_id", nullable = false)
	    @JsonBackReference("pharmacy-medicine")
	    private PharmacyList pharmacyList;
	    
	    @OneToMany(mappedBy = "medicine", cascade = CascadeType.ALL)
	    @JsonManagedReference("medicine-reserve")  // Parent side of ReserveMedicine relation
	    private List<ReserveMedicine> reserveMedicines;
	    
	    public Medicine(Long id, String medicineName, String mediType, Integer quantity, Integer pricePerUnit,
				String status, Boolean prescriptionRequired, PharmacyList pharmacyList,
				List<ReserveMedicine> reserveMedicines) {
			super();
			this.id = id;
			this.medicineName = medicineName;
			this.mediType = mediType;
			this.quantity = quantity;
			this.pricePerUnit = pricePerUnit;
			this.status = status;
			this.prescriptionRequired = prescriptionRequired;
			this.pharmacyList = pharmacyList;
			this.reserveMedicines = reserveMedicines;
		}

		public String getMediType() {
			return mediType;
		}

		public void setMediType(String mediType) {
			this.mediType = mediType;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public Integer getPricePerUnit() {
			return pricePerUnit;
		}

		public void setPricePerUnit(Integer pricePerUnit) {
			this.pricePerUnit = pricePerUnit;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getPrescriptionRequired() {
			return prescriptionRequired;
		}

		public void setPrescriptionRequired(Boolean prescriptionRequired) {
			this.prescriptionRequired = prescriptionRequired;
		}


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getMedicineName() {
			return medicineName;
		}

		public void setMedicineName(String medicineName) {
			this.medicineName = medicineName;
		}

		public PharmacyList getPharmacyList() {
			return pharmacyList;
		}

		public void setPharmacyList(PharmacyList pharmacyList) {
			this.pharmacyList = pharmacyList;
		}


		public List<ReserveMedicine> getReserveMedicines() {
			return reserveMedicines;
		}

		public void setReserveMedicines(List<ReserveMedicine> reserveMedicines) {
			this.reserveMedicines = reserveMedicines;
		}

		public Medicine() {
			super();
			// TODO Auto-generated constructor stub
		}

	    
}
