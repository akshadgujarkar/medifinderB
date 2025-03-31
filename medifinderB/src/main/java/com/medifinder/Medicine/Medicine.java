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

	    @ManyToOne
	    @JoinColumn(name = "pharmacy_list_id", nullable = false)
	    @JsonBackReference("pharmacy-medicine")
	    private PharmacyList pharmacyList;
	    
	    @OneToMany(mappedBy = "medicine", cascade = CascadeType.ALL, orphanRemoval = true)
	    @JsonManagedReference("medicine-reserve")  // Parent side of ReserveMedicine relation
	    private List<ReserveMedicine> reserveMedicines;

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

		


		public Medicine(Long id, String medicineName, PharmacyList pharmacyList,
				List<ReserveMedicine> reserveMedicines) {
			super();
			this.id = id;
			this.medicineName = medicineName;
			this.pharmacyList = pharmacyList;
			this.reserveMedicines = reserveMedicines;
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
