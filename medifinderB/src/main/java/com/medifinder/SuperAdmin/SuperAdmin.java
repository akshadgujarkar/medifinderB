package com.medifinder.SuperAdmin;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.medifinder.Admin.Admin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class SuperAdmin {
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    private String adminName;
	    private String status;
	    private String email;
	    private String phoneNo;
	    private String username;

	    @OneToMany(mappedBy = "superAdmin")
	    @JsonManagedReference("superAdmin-admin")
	    private List<Admin> admins;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getAdminName() {
			return adminName;
		}

		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public List<Admin> getAdmins() {
			return admins;
		}

		public void setAdmins(List<Admin> admins) {
			this.admins = admins;
		}

		public SuperAdmin(Long id, String adminName, String status, String email, String phoneNo, String username,
				List<Admin> admins) {
			super();
			this.id = id;
			this.adminName = adminName;
			this.status = status;
			this.email = email;
			this.phoneNo = phoneNo;
			this.username = username;
			this.admins = admins;
		}

		public SuperAdmin() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
