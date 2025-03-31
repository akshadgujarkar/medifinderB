package com.medifinder.ReserveMedicine;

import java.time.LocalDateTime;

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
	    private Medicine medicine;

	    private String username;
	    private String phoneNo;
	    private LocalDateTime pickupStartTime;
	    private LocalDateTime pickupEndTime;

}
