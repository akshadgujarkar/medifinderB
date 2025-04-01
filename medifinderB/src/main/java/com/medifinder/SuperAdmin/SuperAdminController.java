package com.medifinder.SuperAdmin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/superAdmin")
public class SuperAdminController {

		
	@Autowired
	SuperAdminService superAdminService;
	
	@GetMapping("/viewAdmin")
	public List<SuperAdmin>	getAllAdmins()
	{
		return superAdminService.getAllAdmins();
	}
	 @PostMapping("/addNewAdmin")
	 public ResponseEntity<String> addStudent(@RequestBody SuperAdmin admin) {
		 superAdminService.addAdmin(admin);
		 return ResponseEntity.ok("Admin add successfully");
	 }
}
