package com.medifinder.PharmacyList;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.medifinder.Admin.Admin;
import com.medifinder.Location.Location;
import com.medifinder.Medicine.Medicine;
import com.medifinder.Registration.Registration;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class PharmacyList {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	@ManyToOne
	@JoinColumn(name = "location_id", nullable = false)
	@JsonBackReference("location-pharmacy")
	private Location location;

	@ManyToOne
	@JoinColumn(name = "registration_id", nullable = false)
	@JsonBackReference("registration-pharmacy")
	private Registration registration;

    @OneToMany(mappedBy = "pharmacyList", cascade = CascadeType.ALL)
    @JsonManagedReference("pharmacyList-admin")
    private List<Admin> admins;
    
    @OneToMany(mappedBy = "pharmacyList", cascade = CascadeType.ALL)
    @JsonManagedReference("pharmacy-medicine")
    private List<Medicine> medicines;

    
    private Double longitude;
    private Double latitude;
    private String phoneNo;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Registration getRegistration() {
		return registration;
	}
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public String getCall() {
		return phoneNo;
	}
	public void setCall(String call) {
		this.phoneNo = call;
	}
	
	
	public PharmacyList(Long id, Location location, Registration registration, List<Admin> admins,
			List<Medicine> medicines, Double longitude, Double latitude, String call) {
		super();
		this.id = id;
		this.location = location;
		this.registration = registration;
		this.admins = admins;
		this.medicines = medicines;
		this.longitude = longitude;
		this.latitude = latitude;
		this.phoneNo = call;
	}
	public List<Admin> getAdmins() {
		return admins;
	}
	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}
	public PharmacyList() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
