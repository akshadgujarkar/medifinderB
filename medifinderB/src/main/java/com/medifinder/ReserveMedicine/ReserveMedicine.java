package com.medifinder.ReserveMedicine;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.medifinder.Medicine.Medicine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ReserveMedicine {
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

		  @ManyToOne
		  @JoinColumn(name = "medicine_id", nullable = false)
		  @JsonBackReference("medicine-reserve")  // Child side of the relationship
		  private Medicine medicine;

	    private String username;
	    private String phoneNo;
	    private LocalDateTime pickupStartTime;
	    private LocalDateTime pickupEndTime;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Medicine getMedicine() {
			return medicine;
		}
		public void setMedicine(Medicine medicine) {
			this.medicine = medicine;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		public LocalDateTime getPickupStartTime() {
			return pickupStartTime;
		}
		public void setPickupStartTime(LocalDateTime pickupStartTime) {
			this.pickupStartTime = pickupStartTime;
		}
		public LocalDateTime getPickupEndTime() {
			return pickupEndTime;
		}
		public void setPickupEndTime(LocalDateTime pickupEndTime) {
			this.pickupEndTime = pickupEndTime;
		}
		public ReserveMedicine(Long id, Medicine medicine, String username, String phoneNo,
				LocalDateTime pickupStartTime, LocalDateTime pickupEndTime) {
			super();
			this.id = id;
			this.medicine = medicine;
			this.username = username;
			this.phoneNo = phoneNo;
			this.pickupStartTime = pickupStartTime;
			this.pickupEndTime = pickupEndTime;
		}
		public ReserveMedicine() {
			super();
			// TODO Auto-generated constructor stub
		}

	    
}
