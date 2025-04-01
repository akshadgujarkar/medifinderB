package com.medifinder.Registration;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.medifinder.PharmacyList.PharmacyList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Registration {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String pharmacyName;
    private String username;
    private String licenseNo;
    private String area;
    private String phoneNo;
    private String owner;
    private String password;
    
    @OneToMany(mappedBy = "registration", cascade = CascadeType.ALL)
    @JsonManagedReference("registration-pharmacy")
    private List<PharmacyList> pharmacyLists;
	
	public List<PharmacyList> getPharmacyLists() {
		return pharmacyLists;
	}
	public void setPharmacyLists(List<PharmacyList> pharmacyLists) {
		this.pharmacyLists = pharmacyLists;
	}
	public Registration(Long id, String pharmacyName, String username, String licenseNo, String area, String phoneNo,
			String owner, String password, List<PharmacyList> pharmacyLists) {
		super();
		this.id = id;
		this.pharmacyName = pharmacyName;
		this.username = username;
		this.licenseNo = licenseNo;
		this.area = area;
		this.phoneNo = phoneNo;
		this.owner = owner;
		this.password = password;
		this.pharmacyLists = pharmacyLists;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPharmacyName() {
		return pharmacyName;
	}
	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
